# MVC Pattern - Limitation
Thanks to the application of the MVC pattern, the role of the controller and the role of rendering the view can be clearly distinguished.
In particular, the view is faithful to the role of drawing the screen, so the code is neat and intuitive. 
Simply take the necessary data out of the model and create a screen.
However, the controller is overlapping at first glance, and there are many unnecessary codes.

### Weakness Of MVC Controller
- Duplication Of Forward
> The code that goes to View should always be called in duplicate.
> Of course, this part can be common as a method, but the method must also be called directly at all times.

- Duplication Of ViewPath
> In each url, the common parts (prefix) are duplicate.
> Plus, if the template engine is changed to other view like thymeleaf, you have to change the total code.

- Common processing is difficult.
> As functions become more complex, more and more parts of the controller will have to be handled in common. 
> I think you can simply pull a common feature as a method, 
> but as a result, you have to call that method all the time, 
> and if you don't accidentally call it, it will be a problem. 
> And calling itself is redundant.

To solve these problems, We have to treat common feature.
We have to bring many entrances together.
Front Controller pattern can solve these problems.