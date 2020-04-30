<%@ page language="java" contentType="text/html;charset=UTF-8"%>
    <%@ page pageEncoding="UTF-8"%>
    <% request.setCharacterEncoding("UTF-8");%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Process Form</title>
</head>
<body>

<p>Hiii Spring MVC</p>
<br>
<p><hr></p>
My name is : ${param.studentName}
<h1>Message : ${message}<h1>
</body>
</html>