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

