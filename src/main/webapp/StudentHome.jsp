<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Student Home</title>
	<style>
		.container{
			width: 35%;
			border: 1px solid black;
			margin: auto;
			padding: 20px;
			font-size: 20px;
		}
		#StudentHome table tr td input{
			font-size: 20px;
		}
	</style>
</head>
<body>
	<div class="container">
		<h2>Student Home</h2>
		
		<form id="StudentHome" action="StudentHomeServlet" method="post">
		<table>
			<tr>
				<td><input type="submit" name="Book_Borrow_By_Student" value="Borrow Book"></td>
			</tr>

			<tr>
				<td><input type="submit" name="Book_Return_By_Student" value="Return Book"></td>
			</tr>
			<tr>
				<td><input type="submit" name="List_Of_Books_Available" value="List Of Books Available"></td>
			</tr>
			
		</table>
		</form>
	</div>
</body>
</html>