package com.hmall.api.client;

import com.hmall.api.po.Order;
import org.springframework.cloud.openfeign.FeignClient;


import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("order-service")
public interface OrderClient {
    @PutMapping()
    void updateById(@RequestBody Order order);


}
