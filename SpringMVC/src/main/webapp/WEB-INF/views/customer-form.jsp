<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
  <head>
        <meta charset="UTF-8">
        <title>Customer Registration</title>
            <style>
                .errors{color:red}
            </style>
  </head>
  <body>
  <i>Input information about yourself. * required </i>
      <br>
      <br>
        <form:form action="processForm" modelAttribute="customer">
            First name : <form:input path="firstName"/>
                <br>
                <br>
            Last name* : <form:input path="lastName"/>
            <form:errors path="lastName" cssClass="errors"/>
                <br>
                <br>
            <input type="submit" value="Submit"/>
        </form:form>
  </body>
</html>
