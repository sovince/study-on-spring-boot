package com.sovince.controller;

import com.sovince.entity.Dept;
import com.sovince.entity.Emp;
import com.sovince.service.DeptService;
import com.sovince.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by vince
 * Email: so_vince@outlook.com
 * Data: 2019/4/10
 * Time: 21:31
 * Description:
 */
@Controller
@RequestMapping("/learnMybatis")
public class LearnMybatisController {

    @Autowired
    DeptService deptService;

    @Autowired
    EmpService empService;


    @GetMapping("index")
    public String index(Model model) {
        List<Dept> depts = deptService.list();
        List<Dept> allDeptsWithEmp = deptService.listAllWithEmp();
        List<Dept> deptsWithEmp = deptService.listWithEmp();

        model.addAttribute("depts", depts);
        model.addAttribute("allDeptsWithEmp", allDeptsWithEmp);
        model.addAttribute("deptsWithEmp", deptsWithEmp);

//        System.out.println(deptsWithEmp);
        return "learnMybatis/index";
    }

    @GetMapping("deptWithEmp")
    @ResponseBody
    public List<Dept> deptWithEmp() {
        return deptService.listWithEmp();
    }

    @GetMapping("empWithDept")
    @ResponseBody
    public List<Emp> empWithDept() {
        return empService.listWithDept();
    }
}
