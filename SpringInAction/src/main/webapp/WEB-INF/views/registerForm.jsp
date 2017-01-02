<%--
  Created by IntelliJ IDEA.
  User: huang
  Date: 2016/12/30
  Time: 22:01
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false" pageEncoding="utf-8" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/style.css" />">
</head>
<body>
    <h1>Register</h1>

    <%--<form method="POST">--%>
        <%--First Name: <input type="text" name="firstName" /><br/>--%>
        <%--Last Name: <input type="text" name="lastName" /><br/>--%>
        <%--Username: <input type="text" name="username" /><br/>--%>
        <%--Password: <input type="password" name="password" /><br/>--%>
        <%--email: <input type="email" name="email" /><br/>--%>

        <%--<input type="submit" value="Register" />--%>
    <%--</form>--%>

    <sf:form method="post" commandName="spitter"> <!-- 通过 commandName 来构建针对某个模型对象的上下文信息:  这样就需要模型中必须有一个 key 为 spitter 的对象，否则表单不能正常渲染 -> 需要去 SpitterController 中进行修改 -->
        <sf:errors path="*" element="div" cssClass="errors" />
        First Name: <sf:input path="firstName" cssClass="error"/><br/>
            <sf:errors path="firstName" />
        Last Name: <sf:input path="lastName" cssClass="error"/><br/>
            <sf:errors path="lastName" />
        Email: <sf:input path="email" cssClass="error"/><br/>
            <sf:errors path="email" />
        Username: <sf:input path="username" cssClass="error"/><br/>
            <sf:errors path="username" />
        Password: <sf:password path="password" cssClass="error"/><br/>
            <sf:errors path="password" />
        <input type="submit" value="Register" />
    </sf:form>
</body>
</html>
