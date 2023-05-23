# Http Message Converter
### @ResponseBody Usage Principle
<img width="619" alt="스크린샷 2023-05-23 오후 10 34 44" src="https://github.com/gimminjae/Spring-RoadMap/assets/97084128/a3ffd2ac-38a4-442a-b6cf-5d5daed67004">


- Usage Of `@ResponseBody`
- Return directly content at body of Http.
- Instead of viewResolver, HttpMessageConverter works.
- Basic String: StringHttpMessageConverter
- Basic Object: MappingJackson2HttpMessageConverter

### Spring MVC applies Http Message Converter in this case
- Http Request: `@RequestBody`, `HttpEntity(RequestEntity)`
- Http Response: `@ResponseBody`, `HttpEntity(ResponseEntity)`

### HttpMessageConverter is used at both Http Request and Http Response
- `canRead()`, `canWrite()`: Check message converter supports corresponding class, media type
- `read()`, `write()`: Feature that read and write message through MessageConverter

### Several Example of MessageConverter
- ByteArrayHttpMessageConverter
- StringHttpMessageConverter
- MappingJackson2HttpMessageConverter
- ...

### Read HttpRequest Data
1. HTTP request comes, and the controller uses the `@RequestBody`, `HttpEntity` parameter.
2. Call `canRead()` to see if the message converter can read the message.

   (@RequestBody's class, HttpRequest's Content-Type)
3. If the `canRead()` condition is satisfied, call `read()` to create and return an object.

### Create HttpResponse Data
1. The Controller returns data as `@ResponseBody` and `HttpEntity`
2. Call `canWrite()` to see if the message converter can write a message.

   (class type that is returned, HttpRequest's Accept media type)
3. If the `canWrite()` condition is satisfied, call `write()` to generate data in the HTTP response message body.
