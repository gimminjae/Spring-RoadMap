# MVC Pattern - Intro
### Too Many Roles
If One Servlet or JSP plays a role to work business logic and render view, it's too many.
As a result, it will cause difficult maintenance.
When modifying business logic, there is also a UI code, and when modifying the UI, there is also a business logic.
it's so bad.

### Life Cycle Of Change
The real problem is that the life cycle of change is different between the two. 
For example, modifying some UI and modifying business logic are very likely to occur differently, and most of them do not affect each other. 
Managing parts with different life cycles in this way with one code is not good for maintenance.

### MVC - Model View Controller
MVC is that divides one servlet or JSP into controller and view.
> Controller
> - accept HTTP request, confirm parameter and execute business logic
> - look up the result data to be delivered on the view and put it in the model
> - 
> Model
> - put data to be printed on the view
> - thanks to model, View doesn't have to know business logic or data access and focus on work rendering view
> 
> View
> - focus on work drawing screen by using data in model
> - create HTML

### Before View 
<img width="246" alt="스크린샷 2023-05-13 오전 1 42 41" src="https://github.com/gimminjae/Spring-RoadMap/assets/97084128/f9199dc5-c50c-4f3f-b9cd-6c2935ef29dc">

### MVC 1
<img width="318" alt="스크린샷 2023-05-13 오전 1 36 58" src="https://github.com/gimminjae/Spring-RoadMap/assets/97084128/79a7246c-dcff-4a6f-80aa-383682b3d4f2">

### MVC 2
<img width="492" alt="스크린샷 2023-05-13 오전 1 41 37" src="https://github.com/gimminjae/Spring-RoadMap/assets/97084128/196065e8-54b9-49a7-9517-983d2e75baa7">
