# Front Controller Pattern
### Before FrontController
<img width="500" alt="스크린샷 2023-05-14 오후 11 15 55" src="https://github.com/gimminjae/Spring-RoadMap/assets/97084128/f0e8c4ba-e604-4c82-9332-429a3e8e206e">

### After applying FrontController
<img width="492" alt="스크린샷 2023-05-14 오후 11 17 32" src="https://github.com/gimminjae/Spring-RoadMap/assets/97084128/9b1eed1b-49e5-466b-9f9b-41af29c07592">

### Feature Of FrontController Pattern
- Single FrontController Servlet accepts request of client.
- FrontController finds Controller of the request and then calls the Controller.
- Other than the front controller, the servlet is not required for the rest of the controller

> DispatcherServlet is implemented as FrontController Pattern.
