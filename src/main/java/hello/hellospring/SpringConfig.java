package hello.hellospring;

import hello.hellospring.repository.MemberRepository;
import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    // JDBC
//    private DataSource dataSource;
//
//    public SpringConfig(DataSource dataSource) {
//        this.dataSource = dataSource;
//    }

    // JPA
//    private EntityManager em;
//
//    public SpringConfig(EntityManager em) {
//        this.em = em;
//    }

    // Spring data JPA
    private final MemberRepository memberRepository;

    @Autowired
    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository);
    }

//    @Bean
//    public TimeTraceAop timeTraceAop() {
//        return new TimeTraceAop();
//    }

//    @Bean
//    public MemberRepository memberRepository() {
////        return new MemoryMemberRepository(); // Memory에 저장
////        return new JdbcMemberRepository(dataSource); // 순수한 JDBC
////        return new JdbcTemplateMemberRepository(dataSource); // JDBC Template를 이용
////        return new JpaMemberRepository(em); // JDBC Template를 이용
//    }
}
