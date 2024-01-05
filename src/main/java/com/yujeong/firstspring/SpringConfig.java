package com.yujeong.firstspring;

import com.yujeong.firstspring.repository.MemberRepository;
import com.yujeong.firstspring.repository.MemoryMemberRepository;
import com.yujeong.firstspring.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
