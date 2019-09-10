package com.itdr.mappers;

import com.itdr.pojo.shipping;

public interface shippingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(shipping record);

    int insertSelective(shipping record);

    shipping selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(shipping record);

    int updateByPrimaryKey(shipping record);
}