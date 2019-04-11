package com.sovince.service;

import com.sovince.entity.Emp;
import com.sovince.mapper.EmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by vince
 * Email: so_vince@outlook.com
 * Data: 2019/4/10
 * Time: 22:51
 * Description:
 */
@Service
public class EmpService {
    @Autowired
    EmpMapper empMapper;

    public List<Emp> list() {
        return empMapper.list(0, 100);
    }

    public List<Emp> listWithDept() {
        return empMapper.listWithDept(0, 100);
    }
}
