# Singleton Container

## Web Application & Singleton
- Spring appeared in order to support online service.
- Most Spring Application are Web.
- A lot of Users requests to Web Application at same time.

### Pure DI Container without Spring

<img width="599" alt="스크린샷 2023-06-13 오후 3 18 50" src="https://github.com/gimminjae/Spring-RoadMap/assets/97084128/5e2d6e10-aa98-482a-b8b0-817191634093">

- Pure DI Container we made without Spring creates object newly whenever a request comes.
- => There is a great waste of memory.
- To solve this problem, there is Singleton pattern.

## Singleton Pattern
- It's the design pattern that ensures that only one instance of the class is created.
### EX) hello.core.singleton.SingletonService / SingletonTest
- new operator is blocked by private.
- whenever call getInstance(), Container returns same object instance.

### Problems of Singleton Pattern
- The code itself, which implements a single tone pattern, is heavily loaded.
- The client relies on a specific class. It violates the DIP.
- Client depends on implemented class. So, it is likely to violate the OCP principle.
- Test is difficult.
- It's difficult to modify or initialize internal attributes.
- It's difficult to create child class using private constructor.
- Eventually, there is less flexibility.
- It's called as anti pattern too.

## Spring Singleton Container
- Spring Container manages basically object instance as singleton.
- Spring Container can keep objects singleton, solving all problems of singleton pattern.
- Dirty codes for singleton pattern don't have to go in.
- Free from DIP, OCP, Test and private constructor.

### After Spring Singleton Container
<img width="611" alt="스크린샷 2023-06-13 오후 3 20 10" src="https://github.com/gimminjae/Spring-RoadMap/assets/97084128/e975a246-b275-4841-a501-cb3f4b6800ef">

### Problem of Singleton Container
Singleton objects should not be designed to be stateful because multiple clients share one instance of the same object.
- There should not be fields that depend on a particular client.
- There should not be a field that can change the value.
- It should be possible to read only if possible.
- Setting a shared value in the Spring Bean's field can cause a really big error!!!

> **Let's always design the spring bean stateless.**

## @Configuration & Bytecode Manipulation
- Spring Container calls each @Bean and creates Spring Bean.
### Q. If looking at AppConfig, shouldn't memberRepository() be called a total of three times as follows?
1. Spring Container calls memberRepository attached @Bean annotation in order to register it at Spring Bean.
2. Call of memberRepository at memberService()
3. Call of memberRepository() at orderService()
- By the way, if looking at log, Each is called only once.

### CGLIB
- Since @Configuration was pasted to AppConfig, not only @Beans of AppConfig but also AppConfig itself is registered as Bean.
```java
@Test
  void configurationDeep() {
    ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

    //AppConfig is registered as Bean too.
    AppConfig bean = ac.getBean(AppConfig.class);

    System.out.println("bean = " + bean.getClass());
    //print: bean = class hello.core.AppConfig$$EnhancerBySpringCGLIB$$bd479d70
}
```
- In the above test, you can see that CGLIB is attached to AppConfig and some other classes are newly created.
> This is not a class We created, but a random other class where Spring inherited the AppConfig class using a byte code manipulation library called CGLIB, and registered that other class as Spring Bean!

image

- This other class made by Spring CGLIB ensure singleton.
- For each method with @Bean, if there is already a spring bean, it returns the existing bean, and if there is no spring bean, the code that generates, registers it as a spring bean, and returns it is dynamically created.

### What happens if you don't apply @Configuration, just @Bean?
- If don't apply @Configuration, just @Bean, it's registered as Bean, but it don't ensure singleton.
- Always use @Configuration for spring setup information.