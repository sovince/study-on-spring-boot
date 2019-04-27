package com.sovince.entity;

import javax.persistence.*;

/**
 * Created by vince
 * Email: so_vince@outlook.com
 * Data: 2019/4/27
 * Time: 11:20
 * Description: 测试JPA的实体类
 */
@Entity
@Table
public class Host {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String ip;
    private String hostname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    @Override
    public String toString() {
        return "Host{" +
                "id=" + id +
                ", ip='" + ip + '\'' +
                ", hostname='" + hostname + '\'' +
                '}';
    }
}
