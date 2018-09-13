package me.peyppicp.service.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import me.peyppicp.api.DubboApiService;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author YuXiao Pan
 * @date 2018/9/12
 * @email peyppicp.pan@kikatech.com
 */
@Service
public class DubboApiServiceImpl implements DubboApiService {

    @Override
    public String helloWorld() {
        try {
            return InetAddress.getLocalHost().getCanonicalHostName();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return "";
    }
}
