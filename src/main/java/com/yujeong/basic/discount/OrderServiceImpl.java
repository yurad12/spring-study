package com.yujeong.basic.discount;

import com.yujeong.basic.member.Member;
import com.yujeong.basic.member.MemberRepository;
import com.yujeong.basic.member.MemoryMemberRepository;
import com.yujeong.basic.order.Order;

public class OrderServiceImpl implements OrderService{

    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
