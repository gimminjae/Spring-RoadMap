<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<!-- Use relative path, [present url + /save] -->
<form action="save" method="post">
    username: <input type="text" name="username"/>
    age: <input type="text" name="age"/>
    <button type="submit">send</button>
</form>
</body>
</html>

<!--
If there is a JSP in path /WEB-INF, cannot call the JSP directly from the outside.
-->