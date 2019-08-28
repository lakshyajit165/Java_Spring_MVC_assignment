<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>
<html>
    <body>

    <c:forEach var="event" items="${result}">
        <p>Title: ${event.getTitle()}</p>
        <p>City: ${event.getCity()}</p>
        <p>Type: ${event.getType()}</p>
        <p>Price: ${event.getPrice()}</p>
        <hr>
    </c:forEach>
    </body>
</html>