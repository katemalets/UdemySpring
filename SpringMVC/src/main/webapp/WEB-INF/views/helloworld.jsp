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
<p>Name: <%= request.getParameter("studentName") %></p>
My name is : ${param.studentName}
</body>
</html>