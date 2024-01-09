package com.yujeong.basic.discount;

import com.yujeong.basic.member.Member;
import com.yujeong.basic.member.MemberRepository;
import com.yujeong.basic.member.MemoryMemberRepository;
import com.yujeong.basic.order.Order;

public class OrderServiceImpl implements OrderService{

    private final MemberRepository memberRepository;
    private  final DiscountPolicy discountPolicy;

    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
