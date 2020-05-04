
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
            <c:forEach var="artist" items="${artists}">
                     <c:if test="${artist.id == param.id}">
                    <h1>${artist.id} ${artist.firstname} ${artist.surname}</h1>
                    <img src="${artist.photo}" width="50" length="50">
                    <p> ${artist.biography}</p>
                    
                    <form action="listArtworks.jsp"> 
                            <input type="hidden" name="id" value="${artist.id}"> 
                            <input type="submit" value="Artworks">
                    </form>
                     </c:if>
            </c:forEach>
    </body>
</html>

