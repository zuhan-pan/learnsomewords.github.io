<%-- 
    Document   : artistSum
    Created on : Mar 23, 2020, 10:20:48 PM
    Author     : Harry
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Summary of Artist Information</h1>
        <table border="1">
            <thead>
                <tr>
                    <th>Surname</th>
                    <th>First Name</th>
                    <th>Nationality</th>
                    <th>Birth Year</th>
                </tr>
            </thead>
            <tbody>                
            <c:forEach var="artists" items="${artists}">
                <tr>
                    <td><c:out value="${artists.firstname}"/></td> 
                    <td><c:out value="${artists.surname}"/></td>
                    <td><c:out value="${artists.nationality}"/></td>
                    <td><c:out value="${artists.birthYear}"/></td>                                          
                    <td>
                        <form action="listArtist.jsp"> 
                            <input type="hidden" name="id" value="${artists.id}"> 
                            <input type="submit" value="Detail">
                        </form>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
