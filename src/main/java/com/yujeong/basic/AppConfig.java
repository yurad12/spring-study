package com.yujeong.basic;

import com.yujeong.basic.discount.FixDiscountPolicy;
import com.yujeong.basic.discount.OrderService;
import com.yujeong.basic.discount.OrderServiceImpl;
import com.yujeong.basic.member.MemberService;
import com.yujeong.basic.member.MemberServiceImpl;
import com.yujeong.basic.member.MemoryMemberRepository;

public class AppConfig {

    public MemberService memberService() {
        return new MemberServiceImpl(new MemoryMemberRepository());
    }

    public OrderService orderService() {
        return new OrderServiceImpl(
                new MemoryMemberRepository(),
                new FixDiscountPolicy()
        );
    }
}
