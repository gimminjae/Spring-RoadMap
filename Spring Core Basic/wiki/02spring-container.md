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
image
- Method name is used for bean name.
- You can also grant it yourself. ex) ```@Bean(name="memberService22")```
> Bean Names should not be duplicated. 
>
>Other Beans may be ignored or errors may occur depending on the setting.

### 3. Dependency Injection
image
- inject dependency between objects by referring to the configuration information(AppConfig)