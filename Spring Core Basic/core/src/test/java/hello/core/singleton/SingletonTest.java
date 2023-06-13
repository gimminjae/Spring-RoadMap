package hello.core.singleton;

import static org.assertj.core.api.Assertions.assertThat;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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
}
