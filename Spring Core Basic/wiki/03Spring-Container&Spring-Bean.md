# Spring Container & Spring Bean
## BeanFactory & ApplicationContext
<img width="285" alt="스크린샷 2023-06-12 오후 5 39 47" src="https://github.com/gimminjae/Spring-RoadMap/assets/97084128/73d487d4-5948-4d0d-943c-5d5858dbb50d">

### BeanFactory
- It's the top interface of the spring container.
- It's responsible for managing and selecting spring beans.

### ApplicationContext
- inherits BeanFactory
- additional function ApplicationContext provides

    <img width="743" alt="스크린샷 2023-06-12 오후 5 43 10" src="https://github.com/gimminjae/Spring-RoadMap/assets/97084128/d9a5f787-4775-410d-926f-4734d9d15f5c">

    - MessageSource
    - EnvironmentCapable
    - ApplicationEventPublisher
    - ResourceRoader

## Various Configuration Formats - Class, XML
<img width="524" alt="스크린샷 2023-06-12 오후 5 46 31" src="https://github.com/gimminjae/Spring-RoadMap/assets/97084128/c9187e66-f51d-4f48-b534-1d2ff2675f0c">

- Java Class Configuration based on Annotaion

    The way we've been doing it
- XML

    It has not been used very well lately.
