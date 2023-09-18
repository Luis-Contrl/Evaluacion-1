<%-- 
    Document   : index
    Created on : 18-09-2023, 01:24:30
    Author     : User
--%>

<%@page import="modelo.Calcular"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Calculadora de Interes Simple</h1>
        <form action="Servletindex" method="POST">
            <table>
                <tr>
                    <td>Capital</td><td><input type="text" placeholder="ejemplo: 100000" name="valor"/></td> 
                </tr>                 
                 <tr>
                    <td>Plazo en años</td><td><input type="text" placeholder="ejemplo: 3" name="cantidad"/></td> 
                </tr>
                 <tr>
                    <td>Ingresar Interes Unico 10%</td>
                        <td>
                            <input type="text" placeholder="ejemplo: 10" name="intere"/>
                        </td> 
                </tr>
                <tr>
                    <td><button type="submit">Calcular</button></td> 
                </tr>             
            </table>
            <br/>
            <%
                Calcular obj = new Calcular();
                obj=(Calcular)request.getAttribute("ObjetoJava");
                if(obj!=null){
                    out.print("Interes simple producido: $"+obj.getInteresGenerado()+"<br/>");
                }
            %>
        </form>
    </body>
</html>
