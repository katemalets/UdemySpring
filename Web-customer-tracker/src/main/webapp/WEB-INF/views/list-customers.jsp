<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>List Customers</title>
  </head>
  <body>
    List will be developed soon...
        <table>
            <tr>
                <th>First Name </th>
                 <th>Last Name </th>
                  <th>Email </th>
            </tr>
                <c:forEach var="customer" items="${customers}">
                <tr>
                <td>${customer.firstName}</td>
                <td>${customer.lastName}</td>
                <td>${customer.email}</td>
                </tr>
                </c:forEach>
        </table>
  </body>
</html>
