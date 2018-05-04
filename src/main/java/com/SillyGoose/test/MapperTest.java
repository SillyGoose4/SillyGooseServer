package com.SillyGoose.test;

import com.SillyGoose.bean.User;
import com.SillyGoose.dao.UserMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.WebApplicationContext;


@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"classpath*:conf/applicationContext.xml","classpath:conf/dispatch-servlet.xml"})
public class MapperTest {

    @Autowired
    UserMapper userMapper;

    @Autowired
    WebApplicationContext context;
    MockMvc mockMvc;

    @Before
    public void initMockMvc(){
        mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
    }

    @Test
    public void testUser(){
        System.out.println(userMapper);
    }
    @Test
    public void testSerchUser(){
        try {
            MvcResult result;
            result = mockMvc.perform(MockMvcRequestBuilders.get("/user/getUser").param("id","18799137052L")).andReturn();
            MockHttpServletRequest request = result.getRequest();
            System.out.println("==== test    =======================================");
            System.out.println(result);
            System.out.println("==== result  =======================================");
            System.out.println(request);
            System.out.println("==== request =======================================");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testInsert(){
        userMapper.insert(new User(180L,"test","test","18051072519"));
    }
}
