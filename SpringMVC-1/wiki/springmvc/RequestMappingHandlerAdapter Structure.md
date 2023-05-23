# RequestMappingHandlerAdapter Structure
## Q. Where is the HTTP message converter used in the spring MVC?

### Spring MVC Structure
image

> Answer is RequestMappingHandlerAdapter!!

### How RequestMappingHandlerAdapter work
image

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