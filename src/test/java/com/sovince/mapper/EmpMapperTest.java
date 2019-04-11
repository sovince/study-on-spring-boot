package com.sovince.mapper;

import com.sovince.entity.Emp;
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
 * Time: 22:34
 * Description:
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class EmpMapperTest {

    @Autowired
    EmpMapper empMapper;

    @Test
    public void list() {
        List<Emp> list = empMapper.list(0, 100);
        System.out.println(list);
    }

    @Test
    public void listWithDept() {
        List<Emp> emps = empMapper.listWithDept(0, 100);
        System.out.println(emps);
        System.out.println(emps.get(1).getDept());
    }
}