package com.itdr.mappers;


import com.itdr.pojo.orders_item;

public interface orders_itemMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(orders_item record);

    int insertSelective(orders_item record);

    orders_item selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(orders_item record);

    int updateByPrimaryKey(orders_item record);
}