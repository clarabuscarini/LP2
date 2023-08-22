<%@page import="java.util.Scanner"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Laço de repetição</title>
</head>
<body>


<%
int resultado = 0;
int n1 = 0;

Scanner teclado = new Scanner(System.in);
out.print("Digite um valor:");
n1 = teclado.nextInt();

for(int i= 0; i<=10; i++){
	resultado = n1 * i;
    out.print(n1 + "X" + i + "=" + resultado);
    
   }

%>





</body>
</html>