<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 12/2/2020
  Time: 9:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<html>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
      integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<link href="static/css/CustomloginPage.css" rel="stylesheet" type="text/css" >
<head>
    <title>Logout</title>
</head>
<body class="login_background">

<form action="logout" method="POST">
    <div class="col-4 container login_fix_">
        <center>
            <h1>Logout:</h1>
        </center>

        <input type="hidden" name="${_csrf.parameterName}"
                 value="${_csrf.token}"/>

        <button type="submit" class="btn btn-primary">Logout</button>
    </div>
</form>

</body>
</html>
