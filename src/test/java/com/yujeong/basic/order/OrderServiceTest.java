package com.yujeong.basic.order;

import com.yujeong.basic.discount.OrderService;
import com.yujeong.basic.discount.OrderServiceImpl;
import com.yujeong.basic.member.Grade;
import com.yujeong.basic.member.Member;
import com.yujeong.basic.member.MemberService;
import com.yujeong.basic.member.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class OrderServiceTest {

    MemberService memberService = new MemberServiceImpl();
    OrderService orderService = new OrderServiceImpl();

    @Test
    void createOrder() {
        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);
    }
}
