<%--
  Created by IntelliJ IDEA.
  User: katyamalets
  Date: 23.05.2020
  Time: 14:01
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<html>
    <head>
        <title>Home Page</title>
    </head>

        <body>
            <h3> <i> My first security app </i> </h3>
            <hr>
            Username: <security:authentication property="principal.username"/>
            <br>
            Role's: <security:authentication property="principal.authorities"/>
            <hr>
                <p>Hi, my sweet home c:<br>
                I am missing ...</p>
            <hr>
            <p><a href="${pageContext.request.contextPath}/leaders"> very secret info </a>
                (Only for managers)
            </p>
            <p><a href="${pageContext.request.contextPath}/systems"> very secret info </a>
                (Only for admins)
            </p>
                    <form:form action="${pageContext.request.contextPath}/logout" method="POST">
                        <input type="submit" value="Logout"/>
                    </form:form>
        </body>
</html>
