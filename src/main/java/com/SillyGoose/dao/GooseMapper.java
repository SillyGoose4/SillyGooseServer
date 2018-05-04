package com.SillyGoose.dao;

import com.SillyGoose.bean.Goose;
import com.SillyGoose.bean.GooseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GooseMapper {
    long countByExample(GooseExample example);

    int deleteByExample(GooseExample example);

    int deleteByPrimaryKey(Long userId);

    int insert(Goose record);

    int insertSelective(Goose record);

    List<Goose> selectByExample(GooseExample example);

    Goose selectByPrimaryKey(Long userId);

    int updateByExampleSelective(@Param("record") Goose record, @Param("example") GooseExample example);

    int updateByExample(@Param("record") Goose record, @Param("example") GooseExample example);

    int updateByPrimaryKeySelective(Goose record);

    int updateByPrimaryKey(Goose record);
}