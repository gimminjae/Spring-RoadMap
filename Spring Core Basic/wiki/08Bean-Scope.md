# Bean Scope
- Scope는 번역 그대로 Bean이 존재할 수 있는 범위를 뜻한다.
- Spring Bean은 기본적으로 Singleton Scope로 생성된다.
- Spring은 기본적으로 모든 Bean을 Singleton Scope로 관리한다.

## Spring 이 지원하는 Scope
- Singleton: 기본 스코프, 스프링 컨테이너의 시작과 종료까지 유지되는 가장 넓은 범위의 스코프이다. 
- Prototype: 스프링 컨테이너는 프로토타입 빈의 생성과 의존관계 주입까지만 관여하고 더는 관리하지 않는 매우 짧은 범위의 스코프이다.
- Web Scope
    - request: 웹 요청이 들어오고 나갈때 까지 유지되는 스코프이다. 
    - session: 웹 세션이 생성되고 종료될 때 까지 유지되는 스코프이다. 
    - application: 웹의 서블릿 컨텍스트와 같은 범위로 유지되는 스코프이다.

## Bean Scope 지정 방식
- auto
```java
@Scope("prototype")
@Component
public class ExamBean {}
```
- manual
```java
@Scope("prototype")
@Bean
PrototypeBean ExamBean() {
    return new ExamBean();
}
```

## Prototype Scope
- Singleton Scope의 경우 Bean을 조회하면 Spring Container는 항상 같은 인스턴스의 Spring Bean을 반환한다.
- Prototype Scope를 Spring Container에 조회하면 Spring Container는 항상 새로운 인스턴스를 생성해서 반환한다.

### singleton bean request
singleton image
- 

### prototype bean request 1
prototype1 image
- 스프링 컨테이너에 같은 요청이 오면 항상 새로운 프로토타입 빈을 생성해서 반환한다.

### prototype bean request 2
prototype2 image

### Test
- singleton scope test: ```test/hello.core.scope.SingletonTest```
- prototype scope test: ```test/hello.core.scope.PrototypeTest```

### Prototype Bean의 특징 정리
- 스프링 컨테이너에 요청할 때 마다 새로 생성된다.
- 스프링 컨테이너는 프로토타입 빈의 생성과 의존관계 주입 그리고 초기화까지만 관여한다.
- 종료 메서드가 호출되지 않는다.
- 그래서 프로토타입 빈은 프로토타입 빈을 조회한 클라이언트가 관리해야 한다. 
- 종료 메서드에 대한 호출도 클라이언트가 직접 해야한다.