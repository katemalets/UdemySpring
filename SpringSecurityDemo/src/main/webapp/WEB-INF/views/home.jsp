<%--
  Created by IntelliJ IDEA.
  User: katyamalets
  Date: 23.05.2020
  Time: 14:01
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Home Page</title>
    </head>

        <body>
            <h3> <i> My first security app </i> </h3>
            <hr>
                <p>Hi, my sweet home c:<br>
                I am missing ...</p>
                    <form:form action="${pageContext.request.contextPath}/logout" method="POST">
                        <input type="submit" value="Logout"/>
                    </form:form>
        </body>
</html>
