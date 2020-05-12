<%--
  Created by IntelliJ IDEA.
  User: katyamalets
  Date: 07.05.2020
  Time: 21:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Book form</title>
    <style>
        form {
            margin-top: 10px;
        }

        label {
            font-size: 16px;
            width: 100px;
            display: block;
            text-align: right;
            margin-right: 10px;
            margin-top: 8px;
            margin-bottom: 8px;
        }

        input {
            width: 250px;
            border: 1px solid #666;
            border-radius: 5px;
            padding: 4px;
            font-size: 16px;
        }

        .save {
            font-weight: bold;
            width: 130px;
            padding: 5px 10px;
            margin-top: 30px;
            background: #cccccc;
        }

        table {
            border-style:none;
            width:50%;
        }

        tr:nth-child(even) {background: #ffffb8}
        tr:nth-child(odd) {background: #ffff85}

        tr {
            border-style:none;
            text-align:left;
        }

        html, body{
            margin-left:15px; margin-right:15px;
            padding:0px;
            font-family:Verdana, Arial, Helvetica, sans-serif;
        }


        #wrapper {width: 100%; margin-top: 0px; }
        #header {width: 70%; background: #ff2400; margin-top: 0px; padding:15px 0px 15px 15px;}
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
    <div id="wrapper">
        <div id="header">
            <h2>List of read books</h2>
        </div>
    </div>

    <div id="container">
        <h3>Save your new book</h3>

        <form:form action="saveBook" modelAttribute="book" method="POST">
            <form:hidden path="id"/>
            <table>
                <tbody>
                    <tr>
                        <td><label>Name : </label></td>
                        <td><form:input path="name"/></td>
                    </tr>
                    <tr>
                        <td><label>Author : </label></td>
                        <td><form:input path="author"/></td>
                    </tr>
                    <tr>
                        <td><label>Year : </label></td>
                        <td><form:input path="year"/></td>
                    </tr>
                    <tr>
                        <td> <label> Save </label></td>
                        <td><input type="submit" value="Save" class="save" ></td>
                    </tr>
                </tbody>
            </table>
        </form:form>

        <div style="clear: both;"></div>
        <p>
            <a href="${pageContext.request.contextPath}/book/list">
                Back to list...
            </a>
        </p>

    </div>
</body>
</html>
