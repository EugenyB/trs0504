<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: eugen
  Date: 05.04.2017
  Time: 10:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Students</title>
</head>
<body>
    <table>
        <thead><tr><th>id</th><th>name</th><th>rating</th></tr></thead>
        <tbody>
            <jsp:useBean id="students" scope="request" type="java.util.List"/>
            <c:forEach items="${students}" var="student">
                <tr>
                    <td>${student.id}</td>
                    <td>${student.name}</td>
                    <td>${student.rating}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
