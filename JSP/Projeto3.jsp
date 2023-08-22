<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cálculo - JSP</title>
</head>
<body>

<%= "<h1> Temperaturas </h1>" %>

<%! 
double valor1 = 10;
double valor2 = (valor1 * 1.8) + 32  ;
%>
<%= "<p>Por favor, inisira o valor em ºC:</p>" %>
<%= "<p>10</p>" %>
<p> O valor em F é: <%= valor2 %></p>


</body>
</html>