# Total Structure Of Spring MVC
Spring MVC is a structure similar to FrontController-v5 I made.
## MVC I made vs Spring MVC
### MVC Framework I made (FrontController - v5)
<img width="666" alt="스크린샷 2023-05-19 오후 4 49 34" src="https://github.com/gimminjae/Spring-RoadMap/assets/97084128/060668d6-4533-41c0-8ad6-7ca5b3079afe">

### Spring MVC
<img width="679" alt="스크린샷 2023-05-20 오전 1 18 04" src="https://github.com/gimminjae/Spring-RoadMap/assets/97084128/7c213371-5a90-42b6-880f-38195d41c1b6">

### Order of Operation
1. Select Handler : Select the handler (controller) mapped to the request URL via handler mapping.
2. Select the handler adapter: Select the handler adapter that can run the handler.
3. Run the handler adapter: Run the handler adapter.
4. Run Handler: Handler adapter runs Handler.
5. Return ModelAndView: The handler adapter converts the information returned by the handler into ModelAndView I return it.
6. Call ViewResolver: Find ViewResolver and run.
7. Return View: The ViewResolver changes the logical name of the view to a physical name, and the view object responsible for rendering is the
   I return it.
8. Render View: Through View, render View.

## DispatcherServlet Structure
### DispatcherServlet Diagram
<img width="1068" alt="스크린샷 2023-05-20 오전 1 24 50" src="https://github.com/gimminjae/Spring-RoadMap/assets/97084128/04edbd58-222e-4fbe-a12b-5ef857719c75">

- DispatcherServlet extends HttpServlet and works as Servlet
- Spring Boot registers DispatcherServlet as Servlet, mapping all path

### Request Flow
- When the servlet is called, the service() provided by the HttpServlet is called.
- Spring MVC did override the service() at FrameworkServlet, parent of DispatcherServlet.
- Starting with FrameworkServlet.service(), several methods are called, and DispatchServlet.doDispatch() is called.

### DispatcherServlet.doDispatch()
1. select the Handler
2. select the HandlerAdapter
3. run the HandlerAdapter
4. run the Handler through the HandlerAdapter
5. return ModelAndView
6. call method render() of the View
    
    render()

    - find View through ViewResolver
    - return View
    - rendering view

