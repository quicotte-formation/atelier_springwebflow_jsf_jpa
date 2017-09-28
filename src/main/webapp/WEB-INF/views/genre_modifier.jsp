<%-- 
    Document   : genre_modifier
    Created on : 28 sept. 2017, 11:56:36
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
        <h1>Modif genre</h1>
        <form:form modelAttribute="genreAModifier">
            <form:input placeholder="Genre" path="nom"/>
            <input type="submit" value="Modifier"/>
        </form:form>
    </body>
</html>
