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

