package com.sovince.mapper;

import com.sovince.entity.Emp;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by vince
 * Email: so_vince@outlook.com
 * Data: 2019/4/10
 * Time: 22:29
 * Description:
 */
@Repository
@Mapper
public interface EmpMapper {

    /**
     * 查询员工列表
     *
     * @param index
     * @param limit
     * @return
     */
    List<Emp> list(@Param("index") Integer index, @Param("limit") Integer limit);

    /**
     * 查询员工及其部门 多对一关系
     *
     * @param index
     * @param limit
     * @return
     */
    List<Emp> listWithDept(@Param("index") Integer index, @Param("limit") Integer limit);
}
