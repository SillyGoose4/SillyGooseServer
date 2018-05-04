package com.SillyGoose.dao;

import com.SillyGoose.bean.Pic;
import com.SillyGoose.bean.PicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PicMapper {
    long countByExample(PicExample example);

    int deleteByExample(PicExample example);

    int deleteByPrimaryKey(Integer picId);

    int insert(Pic record);

    int insertSelective(Pic record);

    List<Pic> selectByExample(PicExample example);

    Pic selectByPrimaryKey(Integer picId);

    int updateByExampleSelective(@Param("record") Pic record, @Param("example") PicExample example);

    int updateByExample(@Param("record") Pic record, @Param("example") PicExample example);

    int updateByPrimaryKeySelective(Pic record);

    int updateByPrimaryKey(Pic record);
}