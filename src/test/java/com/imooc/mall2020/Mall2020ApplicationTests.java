package com.imooc.mall2020;

import com.imooc.mall2020.dao.CategoryMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class Mall2020ApplicationTests {
    @Autowired
    private CategoryMapper categoryMapper;

    @Test
    public void contextLoads() {
        System.out.println(categoryMapper.selectByPrimaryKey(100001));
    }
    @Test
    public void contextLoads2() {
        System.out.println(categoryMapper.selectById(100001));
    }

}
