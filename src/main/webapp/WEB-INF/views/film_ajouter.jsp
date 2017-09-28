<%-- 
    Document   : film_ajouter
    Created on : 28 sept. 2017, 12:40:48
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
        <h1>Hello World!</h1>
        <form:form modelAttribute="film">
            <form:input path="titre"/>
            <form:select items="${genres}" itemLabel="nom" itemValue="id" path="genre.id"/>
        </form:form>
    </body>
</html>
