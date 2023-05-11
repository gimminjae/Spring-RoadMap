### Limitation of Servlet and JSP
When develop with Servlet, it's so dirty and complex because Html Code was mixed with Java Code.
Thanks to JSP, We can get clear Html Work generates View, in the middle apply Java Code to part of needed to change dynamicly.

But We have a few problems.

Let's see JSP file to save member.
Half of the code is business logic to save member, The other half is to show View with Html Code.
If You look closely at code, so various code as well as JavaCode are exposed.
JSP plays too many roles. 
The larger the size of the project, the worse it will be.

### Appearance of MVC Pattern
Business logic should be handled elsewhere like a servlet, and JSP should focus on drawing views in HTML to suit its purpose. 
In the past, developers all had similar concerns, so MVC patterns emerged. 
Let's refactory the project by applying the MVC pattern ourselves.