<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hospitales Existentes</title>
    </head>
    <body>
        <%@page   import="Hospital.Funciones"%>
        <%
            Funciones H = new Funciones();
            out.println(H.ImprimirHospital());
        %>
    </body>
</html>
