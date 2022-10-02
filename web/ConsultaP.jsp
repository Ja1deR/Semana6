<%@page   import="Hospital.Funciones"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pacientes Existentes</title>
    </head>
    <body>
        <%@page   import="Hospital.Funciones"%>
        <%
            Funciones P = new Funciones();
            out.println(P.ImprimirPacientes());
        %>
    </body>
</html>
