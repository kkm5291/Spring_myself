package dankook.demo;

import dankook.demo.domain.Member;
import dankook.demo.repository.JdbcMemberRepository;
import dankook.demo.repository.JpaMemberRepository;
import dankook.demo.repository.MemberRepository;
import dankook.demo.repository.MemoryMemberRepository;
import dankook.demo.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.sql.DataSource;

@Configuration
public class SpringConfig {

    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    private final MemberRepository memberRepository;


    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository);
    }
}
