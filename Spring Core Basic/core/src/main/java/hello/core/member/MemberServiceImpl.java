package hello.core.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberServiceImpl implements MemberService {
    /**
     * Now, MemberServiceImpl don't depend on the object implements MemberRepository interface.
     * Which objects are injected through constructor is decided by AppConfig.
     * MemberServiceImpl only depends on MemberRepository interface, in this way, the DIP principle is upheld.
     */
    private final MemberRepository memberRepository;

    @Autowired //Automatically inject dependency
    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public void join(Member member) {
        memberRepository.save(member);
    }

    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
