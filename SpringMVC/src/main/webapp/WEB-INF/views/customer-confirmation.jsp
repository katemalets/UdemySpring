<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
  <head>
        <meta charset="UTF-8">
        <title>Customer Confirmation</title>
  </head>
  <body>
      Customer confirmed : ${customer.firstName}  ${customer.lastName}
      <br><br>
      Free passes : ${customer.freePasses}
      <br><br>
      Postal Code : ${customer.postalCode}
      <br><br>
      Course Code : ${customer.courseCode}
  </body>
</html>
