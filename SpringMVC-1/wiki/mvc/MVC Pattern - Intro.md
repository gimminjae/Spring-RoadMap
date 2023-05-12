# MVC Pattern - Intro
### Too Many Roles
If One Servlet or JSP plays a role to work business logic and view rendering, it's too many.
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
![스크린샷 2023-05-13 오전 1.33.31.png](..%2F..%2F..%2F..%2F..%2F..%2F..%2F..%2Fvar%2Ffolders%2Fbm%2Fqyr7vjg51vb_41t7vjsz3bqc0000gn%2FT%2FTemporaryItems%2FNSIRD_screencaptureui_hAEesN%2F%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202023-05-13%20%EC%98%A4%EC%A0%84%201.33.31.png)
### MVC 1
![스크린샷 2023-05-13 오전 1.36.58.png](..%2F..%2F..%2F..%2F..%2F%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202023-05-13%20%EC%98%A4%EC%A0%84%201.36.58.png)
### MVC 2
![스크린샷 2023-05-13 오전 1.39.20.png](..%2F..%2F..%2F..%2F..%2F..%2F..%2F..%2Fvar%2Ffolders%2Fbm%2Fqyr7vjg51vb_41t7vjsz3bqc0000gn%2FT%2FTemporaryItems%2FNSIRD_screencaptureui_BSU7ac%2F%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202023-05-13%20%EC%98%A4%EC%A0%84%201.39.20.png)