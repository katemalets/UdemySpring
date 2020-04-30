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
          <!-- Country(select from jsp) : <form:select path="country"> -->
           <!--             <form:option value="Brazil" label="Brazil"/> -->
           <!--             <form:option value="Belarus" label="Belarus"/> -->
            <!--            <form:option value="Russia" label="Russia"/> -->
             <!--           <form:option value="France" label="France"/> -->
            <!--        </form:select> -->
                    <br>

           Country :
                        <form:select path="country">
                            <form:options items="${student.countryOptions}"/>
                        </form:select>
                        <br>
           Favourite language :
                         Java <form:radiobutton path="favouriteLanguage" value="Java"/>
                         C++ <form:radiobutton path="favouriteLanguage" value="C"/>
                         JS <form:radiobutton path="favouriteLanguage" value="JS"/>
                         CSS <form:radiobutton path="favouriteLanguage" value="CSS"/>
                         Python <form:radiobutton path="favouriteLanguage" value="Python"/>
                        <br>
          <input type="submit" value="Submit"/>
      </form:form>
  </body>
</html>
