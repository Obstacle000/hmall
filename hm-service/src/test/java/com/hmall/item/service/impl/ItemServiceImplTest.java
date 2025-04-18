package com.hmall.item.service.impl;

import com.hmall.item.domain.dto.OrderDetailDTO;
import com.hmall.item.service.IItemService;
import com.hmall.item.utils.JwtTool;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.Duration;
import java.util.List;

@SpringBootTest
class ItemServiceImplTest {

    @Autowired
    protected IItemService itemService;

    @Autowired
    private JwtTool jwtTool;

    @Test
    void testJwt() {
        String token = jwtTool.createToken(1L, Duration.ofMinutes(30));
        System.out.println("token = " + token);
    }

    @Test
    void deductStock() {
        List<OrderDetailDTO> items = List.of(
                new OrderDetailDTO().setItemId(317578L).setNum(1),
                new OrderDetailDTO().setItemId(317580L).setNum(1)
        );
        itemService.deductStock(items);
    }
}