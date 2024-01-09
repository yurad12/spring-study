package com.yujeong.basic;

import com.yujeong.basic.discount.OrderService;
import com.yujeong.basic.discount.OrderServiceImpl;
import com.yujeong.basic.member.Grade;
import com.yujeong.basic.member.Member;
import com.yujeong.basic.member.MemberService;
import com.yujeong.basic.member.MemberServiceImpl;
import com.yujeong.basic.order.Order;

public class OrderApp {

    public static void main(String[] args) {

        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();
        OrderService orderService = appConfig.orderService();

        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);
        System.out.println("order = " + order);
    }
}
