package com.sovince.service;

import com.sovince.entity.Dept;
import com.sovince.mapper.DeptMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by vince
 * Email: so_vince@outlook.com
 * Data: 2019/4/10
 * Time: 21:14
 * Description:
 */
@Service
public class DeptService {

    @Autowired
    DeptMapper deptMapper;

    public List<Dept> list(){
        return deptMapper.list(0, 10);//参数写死
    }

    public List<Dept> listAllWithEmp(){
        return deptMapper.listAllWithEmp();
    }

    public List<Dept> listWithEmp(){
        return deptMapper.listWithEmp(0,10);
    }

}
