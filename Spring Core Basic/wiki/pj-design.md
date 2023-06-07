
# Business Requirements And Architecture(Design)
### Member
- join and select
- Roles of member are normal and VIP
- DB is decided yet.
### Order And Discount Policy
- Member can order item.
- Discount Policy is applied according to member grade.
- Discount Policy: All VIP can get a fixed discount of 1,000 won.
- Discount Policy can be changed at a high probability.
### Advise
We can't wait for the Member Data and Discount Policy to be decided.

We will design to change Implement Object at any time.

# Member Domain Design
### Member Domain Relation
<img width="709" alt="스크린샷 2023-06-02 오전 6 37 43" src="https://github.com/gimminjae/Spring-RoadMap/assets/97084128/e859c8a6-f1d6-4771-98fe-0a54a5d5cf5e">

### Member Class Diagram
<img width="573" alt="스크린샷 2023-06-02 오전 6 37 47" src="https://github.com/gimminjae/Spring-RoadMap/assets/97084128/ee3dd129-9125-4133-ba52-1ee204f2b4c4">

### Member Object Diagram
<img width="651" alt="스크린샷 2023-06-02 오전 6 37 53" src="https://github.com/gimminjae/Spring-RoadMap/assets/97084128/3b23d15e-5dac-4fb4-a4fe-571862311132">

# Order Domain Design
### Total
<img width="785" alt="스크린샷 2023-06-02 오후 5 33 06" src="https://github.com/gimminjae/Spring-RoadMap/assets/97084128/3b142b36-742c-46de-bda3-4b1ffd699f21">

# Total Logic
<img width="777" alt="스크린샷 2023-06-04 오전 7 25 06" src="https://github.com/gimminjae/Spring-RoadMap/assets/97084128/e620c035-8f76-44e0-a5e9-6de23719dec6">

# AppConfig post-deployment structure
<img width="695" alt="스크린샷 2023-06-07 오전 6 52 09" src="https://github.com/gimminjae/Spring-RoadMap/assets/97084128/2d0fa105-1922-41eb-8974-03c98892f13d">
In this process, three of the five principles of good object-oriented design were applied.

- SRP

     - Client objects are only responsible for executing.
     - AppConfig is responsible for creating and linking implementation objects.
- OCP
    - You only need to modify the code of AppConfig when changing the dependencies between objects or expanding the function.
- DIP
    - We make client code depend on interface and AppConfig inject implemented object to client code.


# IoC(Inversion of Control)
Previously, client implementation objects created, connected, and executed necessary implementation objects on their own.

After the appearance of AppConfig, the implementation object only plays the role of executing its own logic, and the control flow of the program is now the role of AppConfig.

AppConfig will have all the rights to the control flow for the program.

In this way, managing the control flow of the program externally is called IoC (Inversion of Control).

# DI(Dependency Injection)
Dependencies should be considered by dividing static dependencies and dynamic dependencies.

- static dependency

    For example, OrderServiceImpl depends on the MemberRepository, DiscountPolicy interface.

    It is not known what objects will actually be implemented.

- dynamic dependencies

    At the application runtime, the actual implementation object is created externally and delivered to the client, and the actual dependence of the client and the server is connected is called dependency injection.

# Spring Container
ApplicationContext is called Spring Container

Previously, developers used AppConfig to create objects and inject dependency themselves, but spring containers replace them.

The spring container recognizes class with @Configuration as configuration information and registers the return object of the methods with @Bean in it as spring bean in the spring container. At this time, the name of the bean becomes the method name.