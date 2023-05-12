# HttpServletRequest

### HttpServletRequest's Role
Developers can directly parse and use the HTTP request message, but it will be very inconvenient.
The servlet parses the HTTP request message on behalf of the developer so that the developer can use the HTTP request message conveniently.
And the result is put into the HttpServletRequest object and provided. Using HttpServletRequest, the following HTTP request message can be conveniently retrieved.

### HTTP Request Message
```
POST /save HTTP/1.1
Host: localhost:8080
Content-Type: application/x-www-form-urlencoded
username=kim&age=20
```
- Start Line
  - HTTP Method
  - Url
  - Query String
  - Schema, Protocol
- Header
- Body
  - form
  - message body

### HttpServletRequest's Additional Features

- Temporary storage function
  - A temporary storage function that is maintained from the start to the end of the corresponding HTTP request.
  ```
    Save: request.setAttribute(name, value)
    Query: request.getAttribute(name)
  ```

- Session management function
    ```
    request.getSession(create: true)
    ```
  
