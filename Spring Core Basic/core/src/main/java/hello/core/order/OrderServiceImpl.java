package hello.core.order;

import hello.core.discount.DiscountPolicy;
import hello.core.member.Member;
import hello.core.member.MemberRepository;

public class OrderServiceImpl implements OrderService {
    private final MemberRepository memberRepository;
    private final DiscountPolicy discountPolicy;

    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }
    // private final DiscountPolicy discountPolicy = new FixDiscountPolicy(); //Fix discount
    // private final DiscountPolicy discountPolicy = new FixDiscountPolicy(); //Rate discount
    /**
     * When change discount policy, have to modify code of OrderService.
     * We separated role and implementaion.
     * But We failed to follow the OCP, DIP principles.
     * DIP: OrderServiceImpl depends on both interface and implemented class.
     * OCP: When feature is extended and modified, it affects to client code.
     * 
     * --------------------------------------------------------------------------------------------
     * 
     * Then, How can solve this problem?
     * Answer is that make client(OrderService) depend on only interface.
     * 
     * private final DiscountPolicy discountPolicy;
     * 
     * If change code like this, NPE occurs.
     * To solve this problem, somebody has to create and inject implemented object of interface instead.
     * 
     * --------------------------------------------------------------------------------------------
     * 
     * Take a performance as an example. 
     * Let's say each interface is a role, and the implementation objects are actors.
     * Actors should focus on performing their respective roles, and if the other actor performs the role well, anyone should be able to perform.
     * The role of organizing the entire performance and casting actors in charge should be a separate performance planner.
     * This performance planner is AppConfig.
     */

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);
        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
