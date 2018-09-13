package me.peyppicp.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import me.peyppicp.api.DubboApiService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author YuXiao Pan
 * @date 2018/9/12
 * @email peyppicp.pan@kikatech.com
 */
@RestController
public class DubboApiController {

    @Reference
    private DubboApiService dubboApiService;

    @GetMapping("/test")
    public Object helloWorld() {
        return dubboApiService.helloWorld();
    }
}
