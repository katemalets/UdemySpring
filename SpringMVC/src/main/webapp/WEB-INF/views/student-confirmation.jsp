
<!DOCTYPE html>
<html lang="en">
<html>
  <head>
        <meta charset="UTF-8">
        <title>Student Confirmation</title>
  </head>
      <body>
            Name : ${student.firstName} ${student.lastName}
            <br>
            <!-- Country : ${student.country} -->
            Country : ${student.country}
            <br>
            Favourite Language : ${student.favouriteLanguage}
            <br>
            Operating Systems:
            <ul>
                <c:forEach var="temp" items="${student.operatingSystems}"
                <li>  ${temp} </li>
                </c:forEach>
            </ul>
      </body>
</html>
