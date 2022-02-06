<%-- 
    Document   : arithmeticcalculator
    Created on : Feb 4, 2022, 1:19:13 PM
    Author     : guryu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form action="arithmetic" method="post">
        <label>First: </label>
        <input type="text" name="num1" value=${finalnum1}>
        <br>
        <label>Second: </label>
        <input type="text" name="num2" value=${finalnum2}>
        <br>
        <input type="submit" value="+" name="but">
        <input type="submit" value="-" name="but">
        <input type="submit" value="*" name="but">
        <input type="submit" value="%" name="but">
        <br><br>
        <label>Result: ${finalout}</label>
         
        </form>
        <a href="http://localhost:8084/Calculators/age">Age Calculator</a>
        
        
    </body>
</html>
