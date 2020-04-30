<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
  <head>
    <meta charset="UTF-8">
    <title>Student form</title>
  </head>
  <body>
  <form:form action="processForm" modelAttribute="student">
  First name : <form:input path="firstName"/>
  <br>
  Last name : <form:input path="lastName"/>
  <br>
  <input type="submit" value="Submit"/>
  </form:form>
  </body>
</html>
