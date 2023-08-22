<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "java.util.Date" %>
    <%@ page import = "java.util.Calendar" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Data</title>
</head>
<body>

<%= "<h2>Tipo Date: </h2>" %>
<p> Data: <%= new Date() %>  </p>

<%= "<h2>Tipo Calendar: </h2>" %>

<%=java.util.Calendar.getInstance().getTime()%>

</body>
</html>