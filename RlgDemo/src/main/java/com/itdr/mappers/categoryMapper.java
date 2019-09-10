package com.itdr.mappers;


import com.itdr.pojo.category;

public interface categoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(category record);

    int insertSelective(category record);

    category selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(category record);

    int updateByPrimaryKey(category record);
}