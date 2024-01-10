package com.yujeong.basic.order;

import com.yujeong.basic.order.Order;

public interface OrderService {
    Order createOrder(Long memberId, String itemName, int itemPrice);
}
