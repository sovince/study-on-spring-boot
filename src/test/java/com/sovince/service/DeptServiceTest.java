package com.sovince.service;

import com.sovince.entity.Dept;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by vince
 * Email: so_vince@outlook.com
 * Data: 2019/4/10
 * Time: 21:21
 * Description:
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class DeptServiceTest {
    @Autowired
    DeptService deptService;

    @Test
    public void list() {
        List<Dept> list = deptService.list();
        System.out.println(list);
    }
}