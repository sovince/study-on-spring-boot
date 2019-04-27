package com.sovince.service;

import com.sovince.entity.Host;
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
 * Data: 2019/4/27
 * Time: 14:20
 * Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class HostServiceTest {

    @Autowired
    HostService hostService;

    @Test
    public void save() {
        Host host = new Host();
        host.setIp("127.0.0.1");
        host.setHostname("springboot000");

        hostService.save(host);

    }

    @Test
    public void query() {
        List<Host> query = hostService.query();
        for(Host host:query){
            System.out.println(host);
        }
    }
}