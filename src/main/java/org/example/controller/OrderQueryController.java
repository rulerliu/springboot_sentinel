package org.example.controller;

import org.example.service.OrderQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderQueryController {

    @Autowired
    private OrderQueryService orderQueryService;

    /**
     * 限流实现方式二: 注解定义资源
     *
     * @param orderId
     * @return
     */
    @RequestMapping("/getOrder2")
    @ResponseBody
    public String queryOrder3(@RequestParam("orderId") String orderId) {
        return orderQueryService.queryOrderInfo2(orderId);
    }

}
