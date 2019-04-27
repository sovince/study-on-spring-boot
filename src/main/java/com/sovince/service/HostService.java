package com.sovince.service;

import com.sovince.entity.Host;
import com.sovince.repository.HostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by vince
 * Email: so_vince@outlook.com
 * Data: 2019/4/27
 * Time: 14:15
 * Description:
 */
@Service
public class HostService {

    @Autowired
    private HostRepository hostRepository;

    @Transactional
    public Host save(Host host){
        return hostRepository.save(host);
    }

    public List<Host> query(){
        return hostRepository.findAll();
    }
}
