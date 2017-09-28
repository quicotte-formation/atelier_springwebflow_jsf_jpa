<%-- 
    Document   : genre_lister
    Created on : 27 sept. 2017, 15:57:26
    Author     : IB
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>
            <spring:message code="genre.list"/>
        </h1>
        <a href="genre_ajouter"><button>Nouveau</button></a>
        <br>
        <c:forEach items="${listeGenres}" var="genre">
            GENRE: ${genre.nom}
            <a href="genre_supprimer/${genre.id}"><button>Supprimer</button></a>
            <a href="genre_modifier/${genre.id}"><button>Modifier</button></a>
            <br>
        </c:forEach>
    </body>
</html>
