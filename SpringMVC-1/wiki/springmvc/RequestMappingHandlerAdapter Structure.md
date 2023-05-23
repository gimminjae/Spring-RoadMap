# RequestMappingHandlerAdapter Structure
## Q. Where is the HTTP message converter used in the spring MVC?

### Spring MVC Structure
<img width="679" alt="스크린샷 2023-05-20 오전 1 18 04" src="https://github.com/gimminjae/Spring-RoadMap/assets/97084128/b0ac24e2-33d8-426a-ac6b-8a032098b053">


> Answer is RequestMappingHandlerAdapter!!

### How RequestMappingHandlerAdapter work
<img width="742" alt="스크린샷 2023-05-23 오후 10 57 01" src="https://github.com/gimminjae/Spring-RoadMap/assets/97084128/073b5da9-82f6-4f16-a113-e6f597897912">

### ArgumentResolver(actually is HandlerMethodArgumentResolver)
The Controller based on Annotation can use a wide variety of parameters,
such as HttpServletRequest, Model, @RequestParam, @ModelAttribute, @RequestBody and HttpEntity.

**Why that we can use these parameters is thanks to ArgumentResolver.**

The RequestMappingHandlerAdapter, which processes an annotation-based controller, 
calls this ArgumentResolver to generate the values (objects) of various parameters required by the controller (handler).

And when all the values of the parameter are ready, call the controller and hand over the value.

### How ArgumentResolver work
It calls `supportParameters()`, checks Whether the corresponding parameter is supported.
If supports, it calls `resolveArgument()` to generate actual Object.
Then, this Object is delivered when Controller is called.
