package me.peyppicp.service.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.dubbo.rpc.RpcContext;
import lombok.extern.slf4j.Slf4j;
import me.peyppicp.api.DubboApiService;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author YuXiao Pan
 * @date 2018/9/12
 * @email peyppicp.pan@kikatech.com
 */
@Slf4j
@Service
public class DubboApiServiceImpl implements DubboApiService {

    @Override
    public String helloWorld() {
        try {
            log.info("Get {} from {}.", RpcContext.getContext().getRemotePort(),RpcContext.getContext().getLocalPort());
            return InetAddress.getLocalHost().getCanonicalHostName();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return "";
    }
}
