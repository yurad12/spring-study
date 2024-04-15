package com.yujeong.basic.xml;

import com.yujeong.basic.member.MemberService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;

public class XmlAppContext {

    @Test
    void xmlAppContext() {
        ApplicationContext ac = new GenericXmlApplicationContext("appConfig.xml");
        MemberService memberSerivce = ac.getBean("memberService", MemberService.class);
        assertThat(memberSerivce).isInstanceOf(MemberService.class);
    }
}
