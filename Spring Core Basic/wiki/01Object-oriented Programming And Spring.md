# What is Spring?

## Spring Ecosystem
- Spring Framework
- Spring Boot
- Spring Data
- Spring Session
- Spring Security
- Spring Rest Docs
- Spring Batch
- Spring Cloud
....

## Spring Framework
- Core Tech: Spring DI Container, AOP, event..
- Web Tech: Spring MVC, Spring WebFlux
- Data Access Tech: Transaction, JDBC, ORM, XML
- Tech Integration: cache, Email, Remote Access, Scheduling
- Test: Test Support based on Spring
- Language: Java, Kotlin, Groovy
- Recently, through the Spring Boot, we can use tech of Spring Framework

## Spring Boot
- Support that can use conveniently Spring Framework
- Built-in Tomcat Server
- Convenient Build ( Gradle, Maven )
- Automatical Configuration about Spring and 3rd party
- Simple Configuration

## Why made Spring?
- Spring is the Framework based on Java.
- The biggest Feature of Java is that it is Object Oriented Language.
- Spring is framework that can maximize the most powerful feature of Object Oriented Language.

## The Feature of Object Orientation
- Abstraction
- Encapsulation
- Inheritance
- **Polymorphism**

## Object Oriented Programming
Object-oriented programming aims to identify computer programs as a group of objects that can send and receive messages and process data, away from the view of computer programs as a list of instructions.

Object-oriented programming makes programs flexible and easy to change.

## Polymorphism
The core of object orientation is polymorphism.

#### Feature Of Polymorphism
- You can change an object instance implementing the interface flexibly at the time of execution.
- Without change of client, You can change Implementation capabilities of the server flexibly.
- Separation of roles and implementation
- Ex)

    Driver and Car

    The driver can drive regardless of the type of car. 

    image

## Separation of roles(interface) and implementation(implemented Object)
- The client only needs to know the role (interface) of the target.
- The client don't have to know internal structure of implementation target.
- The client is not affected by internal changes to the implementation target.
- The client is also not affected by changes in the implementation target itself.
- Role: interface / Implementation: Object or Class that implement interface.
- flexible to change
- scalable design

Like the picture below, although MemberService don't know internal structure of MemberRepository, MemberService can use method 'save()' of MemberRepository.

image

## SOLID - 5 Principle for Great Object-oriented Design

### SRP - Single responsibility principle
- One Class should have only one responsibility.
- **An important criterion is change.**
- If there is less ripple effect when there is a change, it follows SRP well.

### **OCP - Open/closed principle**
- Software elements should be open to extention, not change.

### LSP - Liskov substitution principle
- An object in a program should be able to be converted into a subtype instance without breaking the program's accuracy

### ISP - Interface segregation principle
- Multiple interfaces for a particular client are better than one universal interface.

### **DIP - Dependency inversion principle**
- Dependency Injection is one of ways that follow this principle 'Depend on abstraction, not Implementation'
- Simply, this means that should depend on interface, not implementation class.

## Back to Spring
- Polymorphism alone cannot abide by the OCP and DIP principles.
- Spring supports Polymorphism, abiding by OCP and DIP through tech below.
- Spring supports Polymorphism, OCP and DIP through technology below.
    - DI(Dependency Injection)
    - DI Container
