
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:forEach var="artworks" items="${artworks}">
            <c:if test="${artworks.actistid == param.id}">               
                <h1>Artworks By: ${artist.firstname} ${artist.surname}</h1>
                    <img src="${artworks.image}" width="50" leanth="50">
                    <p> ${artworks.title}</p>
            </c:if>
        </c:forEach>
    </body>
</html>
