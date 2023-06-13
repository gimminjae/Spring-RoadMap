# Singleton Container

## Web Application & Singleton
- Spring appeared in order to support online service.
- Most Spring Application are Web.
- A lot of Users requests to Web Application at same time.

### Pure DI Container without Spring

    iamge

- Pure DI Container we made without Spring creates object newly whenever a request comes.
- => There is a great waste of memory.
- To solve this problem, there is Singleton pattern.

