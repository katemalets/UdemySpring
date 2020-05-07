<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>List Customers</title>

      <link type="text/css" rel="stylesheet"
      href="${pageContext.request.contextPath}/resources/css/style.css"/>
        <style>
            html, body{
                margin-left:15px; margin-right:15px;
                padding:0px;
                font-family:Verdana, Arial, Helvetica, sans-serif;
            }

            table {
                border-collapse:collapse;
                border-bottom:1px solid gray;
                font-family: Tahoma,Verdana,Segoe,sans-serif;
                width:72%;
            }

            th {
                border-bottom:1px solid gray;
                background:none repeat scroll 0 0 #09c332;
                padding:10px;
                color: #FFFFFF;
            }

            tr {
                border-top:1px solid gray;
                text-align:center;
            }

            tr:nth-child(even) {background: #FFFFFF}
            tr:nth-child(odd) {background: #BBBBBB}

            #wrapper {width: 100%; margin-top: 0px; }
            #header {width: 70%; background: #09c332; margin-top: 0px; padding:15px 0px 15px 15px;}
            #header h2 {width: 100%; margin:auto; color: #FFFFFF;}
            #container {width: 100%; margin:auto}
            #container h3 {color: #000;}
            #container #content {margin-top: 20px;}

            .add-button {
                border: 1px solid #666;
                border-radius: 5px;
                padding: 4px;
                font-size: 12px;
                font-weight: bold;
                width: 120px;
                padding: 5px 10px;

                margin-bottom: 15px;
                background: #cccccc;
            }

        </style>
  </head>
  <body>

     <div id = "wrapper">
        <div id ="header">
            <h2 align="center">CRM - Customer Relationship Manager</h2>
        </div>
     </div>
     <br>
     <input type="button" value="Add Customer"
     onclick="window.location.href='showFormForAdd'; return false " class="add-button"/>
        <table>
            <tr>
                <th>First Name </th>
                <th>Last Name </th>
                <th>Email </th>

            </tr>
                <c:forEach var="customer" items="${customers}">
                    <c:url var="updateLink" value="/customer/showFormForUpdate">
                        <c:param name="customerId" value="${customer.id}"/>
                    </c:url>
                <tr>
                    <td>${customer.firstName}</td>
                    <td>${customer.lastName}</td>
                    <td>${customer.email}</td>
                    <td><a href="${updateLink}">Update</a></td>
                </tr>
                </c:forEach>
        </table>
  </body>
</html>
