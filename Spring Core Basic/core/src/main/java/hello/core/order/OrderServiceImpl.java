package hello.core.order;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicy;
import hello.core.member.Member;
import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService {
    private final MemberRepository memberRepository = new MemoryMemberRepository();

    // private final DiscountPolicy discountPolicy = new FixDiscountPolicy(); //Fix discount
    private final DiscountPolicy discountPolicy = new FixDiscountPolicy(); //Rate discount
    /**
     * When change discount policy, have to modify code of OrderService.
     * We separated role and implementaion.
     * But We failed to follow the OCP, DIP principles.
     * DIP: OrderServiceImpl depends on both interface and implemented class.
     * OCP: When feature is extended and modified, it affects to client code.
     */

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);
        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
