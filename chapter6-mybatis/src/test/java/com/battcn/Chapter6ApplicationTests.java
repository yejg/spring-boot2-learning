package com.battcn;

import com.battcn.entity.Area;
import com.battcn.entity.User;
import com.battcn.mapper.AreaMapper;
import com.battcn.mapper.UserMapper;
import org.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author Levin
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class Chapter6ApplicationTests {

    private static final Logger log = LoggerFactory.getLogger(Chapter6ApplicationTests.class);

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private AreaMapper areaMapper;

    @Test
    public void test1() throws Exception {
        final int row1 = userMapper.insert(new User("u1", "p1"));
        log.info("[添加结果] - [{}]", row1);
        final int row2 = userMapper.insert(new User("u2", "p2"));
        log.info("[添加结果] - [{}]", row2);
        final int row3 = userMapper.insert(new User("u1", "p3"));
        log.info("[添加结果] - [{}]", row3);
        final List<User> u1 = userMapper.findByUsername("u1");
        log.info("[根据用户名查询] - [{}]", u1);
    }

    @Test
    public void test2() throws Exception {
        List<Area> areaList = areaMapper.queryCity(1);
        System.out.println(areaList.size());

        List<Area> areaList2 = areaMapper.queryAllCity();
        System.out.println(areaList2.size());
    }

    @Test
    public void test3() throws Exception {
        // 配置 mybatis.configuration.lazy-loading-enabled=true，延迟查询加载
        List<Area> areas1 = areaMapper.queryCityByParentId(1);
        List<Area> areas2 = areaMapper.queryAllCityV2();
        System.out.println();

    }




}
