<%@page import="br.bhaskara.Bhaskara"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calcular Bhaskara</title>
    </head>
    <body>
        <h1>Calcular Bhaskara</h1>
        <hr>
        <%
            float a, b, c, delta, x;

            a = Float.parseFloat(request.getParameter("a"));
            b = Float.parseFloat(request.getParameter("b"));
            c = Float.parseFloat(request.getParameter("c"));
            delta = Float.parseFloat(request.getParameter("delta"));
            x = Float.parseFloat(request.getParameter("x"));

            Bhaskara bhaskara = new Bhaskara();

            bhaskara.setA(a);
            bhaskara.setB(b);
            bhaskara.setC(c);
            bhaskara.setDelta(delta);
            bhaskara.setX(x);

        %>
        <strong>Dado Informados: </strong>
        <ul>
            <li><strong>Defina o valor de a: </strong><%= a%></li>
            <li><strong>Defina o valor de b: </strong><%= b%></li>
            <li><strong>Defina o valor de c: </strong><%= c%></li>   
        </ul>
        <hr>
        <strong>Calculo de Delta: </strong>
        <ul>
            <li><strong>Delta: </strong><%=String.format("%.2f", bhaskara.calcularDelta())%></li>
            <li><strong>x1: </strong><%= bhaskara.getDelta()%></li>

        </ul>
    </body>
</html>
