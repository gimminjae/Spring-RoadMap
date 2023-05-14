# Front Controller Pattern
### Before FrontController

### After applying FrontController

### Feature Of FrontController Pattern
- Single FrontController Servlet accepts request of client.
- FrontController finds Controller of the request and then calls the Controller.
- Other than the front controller, the servlet is not required for the rest of the controller

> DispatcherServlet is implemented as FrontController Pattern.