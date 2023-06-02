<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Library Management System</title>
	<style>
		.container{
			width: 35%;
			border: 1px solid black;
			margin: auto;
			padding: 20px;
			font-size: 20px;
		}
		#homepage table tr td input{
			font-size: 20px;
		}
	</style>
</head>
<body>
	<div class="container">
		<h2>Library Management System</h2>
		
		<form id="homepage" action="HomeServlet" method="post">
		<table>
			<tr>
				<td> </td>
				<td><input type="submit" name="admin" value="Admin"></td>
			</tr>
			<tr>
				<td> </td>
				<td><input type="submit" name="librarian" value="Librarian"></td>
			</tr>
			
			<tr>
				<td></td>
				<td><input type="submit" name="student" value="Student"></td>
			</tr>
			
			
		</table>
		</form>
	</div>
</body>
</html>