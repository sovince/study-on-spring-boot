package com.sovince.mapper;

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
 * Time: 19:33
 * Description:
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class DeptMapperTest {

    @Autowired
    DeptMapper deptMapper;
    
    @Test
    public void list() {
        List<Dept> list = deptMapper.list(0,10);
        System.out.println(list.get(1).getDname());
    }

    @Test
    public void listAllWithUser() {
        List<Dept> depts = deptMapper.listAllWithEmp();
        System.out.println(depts);
    }

    @Test
    public void listWithUser() {
        List<Dept> depts = deptMapper.listWithEmp(0, 4);
        System.out.println(depts);
    }
}