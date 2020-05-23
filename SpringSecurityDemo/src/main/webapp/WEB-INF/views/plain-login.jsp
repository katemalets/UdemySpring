<%--
  Created by IntelliJ IDEA.
  User: katyamalets
  Date: 23.05.2020
  Time: 16:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>OUR IMPORTANT LOGIN PAGE</title>
</head>
<body>
<form:form action="${pageContext.request.contextPath}/authenticateTheUser"
method="POST">
    <p>
       Username: <input type="text" name="username"/>
    </p>
    <p>
       Password: <input type="password" name="password"/>
    </p>
    <input type="submit" value="Login"/>

</form:form>

</body>
</html>
