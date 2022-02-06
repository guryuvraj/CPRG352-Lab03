<%-- 
    Document   : agecalculator
    Created on : Feb 4, 2022, 12:09:35 PM
    Author     : guryu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form action="age" method="post">
            <label>Enter your age: </label>
            <input type="text" name="age_field">
            <br>
            <input type="submit" value="Age next birthday">
            <br><label> ${finalAge}</label>
        </form>
       
        <a href="http://localhost:8084/Calculators/arithmetic">Arithmetic Calculator</a>
    </body>
</html>
