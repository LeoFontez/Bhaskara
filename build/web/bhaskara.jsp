<%@page import="br.bhaskara.Bhaskara"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calcular Bhaskara</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js" integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf" crossorigin="anonymous"></script>
        <style>
            .tempo-card{
                padding-top: 100px;
                width: 400px;
                margin: 0 auto !important;
            }
        </style>
    </head>
    <body>
        <h1>Calcular Bhaskara</h1>
        <hr>
        <%
            int a, b, c;
            a = Integer.parseInt(request.getParameter("xA"));
            b = Integer.parseInt(request.getParameter("xB"));
            c = Integer.parseInt(request.getParameter("xC"));
            Bhaskara bhaskara = new Bhaskara();
            bhaskara.setA(a);
            bhaskara.setB(b);
            bhaskara.setC(c);
            
        %>
   
        <strong>Equação: </strong>
        <p><%=a%>x² + <%=b%>x + <%=c%> = 0</p>
        <%
            if (a == 0) {
        %>
        <h3>O valor de A não pode ser 0!</h3>
        <%
            } else {
        %>
        <strong>Resultado: </strong>
        <ul>
            <li><strong>Delta = </strong><%= bhaskara.calcularDelta() %></li>
            <li><strong>Raiz Positiva = </strong><%= (bhaskara.calcularDelta() <= 0) ? "Delta não tem raiz!" : bhaskara.getX1() %></li>
            <li><strong>Raiz Nevativa = </strong><%= (bhaskara.calcularDelta() <= 0) ? "Delta não tem raiz!" : bhaskara.getX2() %></li>
        </ul>
        <% } %>
        <br>
        <a  type="submit" href="index.html" value="Novo Calculo">Novo Calculo</a>
    </body>
</html>