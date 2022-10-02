<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Medicos Existentes</title>
    </head>
    <body>
        <%@page   import="Hospital.Funciones"%>
        <%
            Funciones M = new Funciones();
            out.println(M.ImprimirMedicos());
        %>
    </body>
</html>
