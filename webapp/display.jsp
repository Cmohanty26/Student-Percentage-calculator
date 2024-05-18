<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Percentage</title>
</head>
<body>
<h1>Student Result dash board </h1>
<table border="1">
<tr>
<th>Student Name:</th>
<td><%out.println(request.getParameter("tbName")); %></td>
</tr>
<tr>
<th>Mobile Number:</th>
<td><%out.println(request.getParameter("tbMobile")); %></td>
</tr>
<tr>
<th>Result:</th>
<td><%out.println(request.getAttribute("final_result")); %></td>
</tr>

</table>
</body>
</html>