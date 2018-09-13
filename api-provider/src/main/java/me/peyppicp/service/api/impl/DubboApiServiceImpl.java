package me.peyppicp.service.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import me.peyppicp.api.DubboApiService;

/**
 * @author YuXiao Pan
 * @date 2018/9/12
 * @email peyppicp.pan@kikatech.com
 */
@Service
public class DubboApiServiceImpl implements DubboApiService {

    @Override
    public String helloWorld() {
        return "hello world!";
    }
}
