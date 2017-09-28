<%-- 
    Document   : genre_ajouter
    Created on : 27 sept. 2017, 16:44:10
    Author     : IB
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Nouveau genre</h1>
        <form:form modelAttribute="genre">
            <form:input path="nom" placeholder="Nom du genre"/>
            <input type="submit"/>
        </form:form>
    </body>
</html>
