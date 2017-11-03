package com.china.springcloud.feign.hystrix.service;

import org.springframework.stereotype.Component;

/**
 * Created by 季先生 on 2017/11/3 10:14.
 */
@Component
public class ComputeClientHystrix  implements ComputeClient {
    @Override
    public Integer add(Integer a, Integer b) {
        return -9999;
    }
}
