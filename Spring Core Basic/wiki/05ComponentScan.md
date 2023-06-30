# ComponentScan
## Component Scan & Dependency Injection
- Until now, I had registered a Bean in the Configuration information using @Bean or XML.
- If the project grows in size, it becomes difficult to manage Beanx.
- To solve this problem, the spring provides a function called component scanning.
- Annotation can be attached to the element to be registered as a spring bean as follows.
```java
@Component
public class WantedBean {
    ...
}
```

## Search Location & Basic Scan Target
- If attaching under annotation at Configuration info class, can designate start location of search package.
```java
@ComponentScan(
    basePackages = "hello.core",
)
```
- `basePackages`:start location of search package
- `basePackageClasses`: Packages for the specified class -> start location of search
- If you do not specify anything, the package of the class with ```@ComponentScan``` becomes the starting position.

## Component Scan Target
- All include @Component annotation.

```@Component```
- register as Spring Bean

```@Controller```
- recognized as Spring MVC Controller

```@Service```
- Developers can find that this is a business logic

```@Repository```
- recognized as Spring Data Access Layer, change Data Exception to Spring Exception

```@Configuration```
- recognize class as Configuration class

## Filter
- ```includeFilters```: designate target of component scan additionally
- ```excludeFilters```: designate target excluding from component scan

## Conflict with Duplicate Registrations
### Automatic Bean Registration vs Automatic Bean Registration
- throw ConflictingBeanDefinitionException
### Manual Bean Registration vs Automatic Bean Registration
- Manual Bean Registration win!!!