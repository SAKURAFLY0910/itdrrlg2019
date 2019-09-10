package com.itdr.mappers;


import com.itdr.pojo.cart;

public interface cartMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(cart record);

    int insertSelective(cart record);

    cart selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(cart record);

    int updateByPrimaryKey(cart record);
}