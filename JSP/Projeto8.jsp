<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Jsp</title>
</head>
<body>
 

<form method="post">

Digite um número:<br>
<input name = "n1">
<input type = "submit">
</form><br>

<%
int n1 = 0;
int resultado = 0; 

for(int i= 0; i<=10; i++){
	resultado = n1 * i;
	 out.print(n1 + "X" + i + "=" + resultado+"<br>");
}

%>






</body>
</html>