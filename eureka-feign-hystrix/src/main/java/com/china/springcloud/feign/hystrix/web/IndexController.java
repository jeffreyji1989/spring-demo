package com.china.springcloud.feign.hystrix.web;

import com.china.springcloud.feign.hystrix.service.ComputeClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 季先生 on 2017/6/8 10:06.
 */
@RestController
public class IndexController {
    @Autowired
    private ComputeClient computeClient;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer add() {
        return computeClient.add(100, 200);
    }
}
