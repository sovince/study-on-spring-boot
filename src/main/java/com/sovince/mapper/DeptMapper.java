package com.sovince.mapper;

import com.sovince.entity.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by vince
 * Email: so_vince@outlook.com
 * Data: 2019/4/10
 * Time: 19:21
 * Description:
 */
@Repository
@Mapper
public interface DeptMapper {

    /**
     * 查询列表
     * @param index
     * @param limit
     * @return
     */
    List<Dept> list(@Param("index") Integer index,@Param("limit") Integer limit);

    /**
     * 查询列表 一对多的关系
     * 第一种方式    不适合设置limit
     * @return
     */
    List<Dept> listAllWithEmp();

    /**
     * 查询列表 一对多的关系
     * 第二种方式    实际上是多次查询了emp表并将结果嵌入每一条dept记录
     * @param index
     * @param limit
     * @return
     */
    List<Dept> listWithEmp(@Param("index") Integer index,@Param("limit") Integer limit);
}
