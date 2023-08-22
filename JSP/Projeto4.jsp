<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tabela de conversão</title>
</head>
<body>
<table>


   <tr>
   
   <th>ºC</th>
   <th>ºF</th>
   
   </tr>
   
   <%
   
   for (double i = -20; i <= 120; i+= 0.5){
	   double f = (i * 9/5) + 32;
   
   
   %>
   
   <tr>
   
   <td><%= i %></td>
   <td><%= f %></td>
   
   </tr>
   
   <%
   }
   
   %>

</table>
</body>
</html>