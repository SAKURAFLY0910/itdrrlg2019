package com.itdr.mappers;

import com.itdr.pojo.payinfo;

public interface payinfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(payinfo record);

    int insertSelective(payinfo record);

    payinfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(payinfo record);

    int updateByPrimaryKey(payinfo record);
}