package org.example.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;

public interface OrderQueryService {
    @SentinelResource(value = "getOrderInfo", blockHandler = "handleFlowQpsException",
            fallback = "queryOrderInfo2Fallback")
    String queryOrderInfo2(String orderId);
}
