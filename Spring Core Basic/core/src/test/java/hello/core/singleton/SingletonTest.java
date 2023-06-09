package hello.core.singleton;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import hello.core.AppConfig;
import hello.core.member.MemberService;

public class SingletonTest {
    @Test
    @DisplayName("Pure DI Container without Spring")
    void pureContainer() {
        AppConfig appConfig = new AppConfig();

        // 1. select: Create an object every time you call
        MemberService memberService1 = appConfig.memberService();
        MemberService memberService2 = appConfig.memberService();

        // have different reference values
        System.out.println("memberService1 = " + memberService1);
        System.out.println("memberService2 = " + memberService2);

        // memberService1 != memberService2
        assertThat(memberService1).isNotSameAs(memberService2);
    }

    @Test
    @DisplayName("usage of object applied Singleton")
    public void singletonServiceTest() {
        // The constructor is blocked by private keyword. compile error occurs.
        // new SingletonService();

        // 1. select: return same object every time called.
        SingletonService singletonService1 = SingletonService.getInstance();

        // 2. select: return same object every time called.
        SingletonService singletonService2 = SingletonService.getInstance();

        // have same reference values
        System.out.println("singletonService1 = " + singletonService1);
        System.out.println("singletonService2 = " + singletonService2);

        // singletonService1 == singletonService2
        assertThat(singletonService1).isSameAs(singletonService2);
        singletonService1.logic();
    }

    @Test
    @DisplayName("Spring Container & Singleton")
    void springContainer() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

        // 1. select: return same object every time called.
        MemberService memberService1 = ac.getBean("memberService", MemberService.class);

        // 2. select: return same object every time called.
        MemberService memberService2 = ac.getBean("memberService", MemberService.class);

        // have same reference values
        System.out.println("memberService1 = " + memberService1);
        System.out.println("memberService2 = " + memberService2);

        // memberService1 == memberService2
        assertThat(memberService1).isSameAs(memberService2);
    }

}
