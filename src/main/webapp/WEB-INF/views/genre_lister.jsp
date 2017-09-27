<%-- 
    Document   : genre_lister
    Created on : 27 sept. 2017, 15:57:26
    Author     : IB
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Liste genres</h1>
        <c:forEach items="${listeGenres}" var="genre">
            GENRE: ${genre.nom}
            <br>
        </c:forEach>
    </body>
</html>
