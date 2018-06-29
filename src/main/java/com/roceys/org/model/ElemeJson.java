package com.roceys.org.model;

import java.math.BigDecimal;
import java.util.List;

/**
 * 饿了么外卖用户订单接口JSON
 */
public class ElemeJson {
    private BigDecimal from_time;
    private List<Orders> orders;

    public BigDecimal getFrom_time() {
        return from_time;
    }

    public void setFrom_time(BigDecimal from_time) {
        this.from_time = from_time;
    }

    public List<Orders> getOrders() {
        return orders;
    }

    public void setOrders(List<Orders> orders) {
        this.orders = orders;
    }
}
