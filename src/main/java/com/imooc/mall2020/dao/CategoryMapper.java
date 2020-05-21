package com.imooc.mall2020.dao;


import com.imooc.mall2020.pojo.Category;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;


public interface CategoryMapper {


    @Select("select * from mall_category where id=#{id}")
    Category selectByPrimaryKey(@Param("id") Integer id);



}