package com.yujeong.basic.discount;

import com.yujeong.basic.order.Order;

public interface OrderService {
    Order createOrder(Long memberId, String itemName, int itemPrice);
}
