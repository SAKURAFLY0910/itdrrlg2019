package com.itdr.mappers;

import com.itdr.pojo.product;
import com.itdr.pojo.productWithBLOBs;

public interface productMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(productWithBLOBs record);

    int insertSelective(productWithBLOBs record);

    productWithBLOBs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(productWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(productWithBLOBs record);

    int updateByPrimaryKey(product record);
}