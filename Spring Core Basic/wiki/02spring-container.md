# Spring Container

## Spring Container Generation Process
### 1. Create Spring Container
```java
ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class)
```
- In general, ApplicationContext is Spring Container.
- ApplicationContext is interface.
- Spring Container can be XML or Java class.
- The existing AppConfig was to create spring containers using Java class.

### 2. Resister Spring Bean
<img width="753" alt="스크린샷 2023-06-08 오전 6 39 50" src="https://github.com/gimminjae/Spring-RoadMap/assets/97084128/6591d10c-a98c-412b-812f-241bd744b24d">

- Method name is used for bean name.
- You can also grant it yourself. ex) ```@Bean(name="memberService22")```
> Bean Names should not be duplicated. 
>
>Other Beans may be ignored or errors may occur depending on the setting.

### 3. Dependency Injection
<img width="506" alt="스크린샷 2023-06-08 오전 6 53 35" src="https://github.com/gimminjae/Spring-RoadMap/assets/97084128/f321b2a1-56bb-46ae-a082-6d75f04330f6">

- inject dependency between objects by referring to the configuration information(AppConfig)
