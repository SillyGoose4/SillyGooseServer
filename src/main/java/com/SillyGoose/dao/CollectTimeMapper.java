package com.SillyGoose.dao;

import com.SillyGoose.bean.CollectTime;
import com.SillyGoose.bean.CollectTimeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CollectTimeMapper {
    long countByExample(CollectTimeExample example);

    int deleteByExample(CollectTimeExample example);

    int insert(CollectTime record);

    int insertSelective(CollectTime record);

    List<CollectTime> selectByExample(CollectTimeExample example);

    int updateByExampleSelective(@Param("record") CollectTime record, @Param("example") CollectTimeExample example);

    int updateByExample(@Param("record") CollectTime record, @Param("example") CollectTimeExample example);
}