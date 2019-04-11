package com.sovince.mapper;

import com.sovince.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * Created by vince
 * Email: so_vince@outlook.com
 * Data: 2019/4/10
 * Time: 09:13
 * Description:
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class UserMapperTest {

    @Autowired
    UserMapper userMapper;


    @Test
    public void findOne() {
        User one = userMapper.findOne();
        System.out.println(one);
    }

}