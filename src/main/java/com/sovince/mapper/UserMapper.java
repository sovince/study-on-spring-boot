package com.sovince.mapper;

import com.sovince.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * Created by vince
 * Email: so_vince@outlook.com
 * Data: 2019/4/10
 * Time: 09:03
 * Description:
 */
@Repository
@Mapper
public interface UserMapper {
    User findOne();
}
