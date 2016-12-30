<%--
  Created by IntelliJ IDEA.
  User: huang
  Date: 2016/11/23
  Time: 15:56
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page session="false" %>

<html>
    <head>
        <title>Spitter</title>
        <link rel="stylesheet"
              type="text/css"
              href="<c:url value="/resources/style.css" />" >
    </head>
    <body>
        <h1>Welcome to Spitter</h1>

        <a href="<c:url value="/spittles" />">Spittles</a>
        <a href="<c:url value="/spitter/register" />">Register</a>
    </body>
</html>
