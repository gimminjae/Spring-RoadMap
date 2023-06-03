package hello.core.member;

public class MemberServiceImpl implements MemberService {
    /**
     * Now, MemberServiceImpl don't depend on the object implements MemberRepository interface.
     * Which objects are injected through constructor is decided by AppConfig.
     * MemberServiceImpl only depends on MemberRepository interface, in this way, the DIP principle is upheld.
     */
    private final MemberRepository memberRepository;

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
