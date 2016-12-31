<%--
  Created by IntelliJ IDEA.
  User: huang
  Date: 2016/12/30
  Time: 22:01
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/style.css" />">
</head>
<body>
    <h1>Register</h1>

    <form method="POST">
        First Name: <input type="text" name="firstName" /><br/>
        Last Name: <input type="text" name="lastName" /><br/>
        Username: <input type="text" name="username" /><br/>
        Password: <input type="password" name="password" /><br/>

        <input type="submit" value="Register" />
    </form>
</body>
</html>
