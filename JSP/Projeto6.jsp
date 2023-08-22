<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    float resultado = 0;
    float n1 = 0;
   
    
    if(request.getMethod() == "POST"){
    	n1 = Float.parseFloat(request.getParameter("n1"));
    }
    
    for(int i= 0; i<=10; i++){
     resultado = (n1 * i++);
    }
    
    
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP</title>
</head>
<body>
<h1>Tabuada</h1>

 <form method="post">
 
  Insira o valor desejado:<br>
  <input type="submit" required name="n1" value="<%= n1 %>"><br>
  
  <h2>Tabuada:</h2>
  <%= resultado %>
  
 
 </form>

</body>
</html>