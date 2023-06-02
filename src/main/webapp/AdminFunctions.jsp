<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Admin Task</title>
	<style>
		.container{
			width: 35%;
			border: 1px solid black;
			margin: auto;
			padding: 20px;
			font-size: 20px;
		}
		#adminTasks table tr td input{
			font-size: 20px;
		}
	</style>
</head>
<body>
	<div class="container">
		<h2>Task for Admin</h2>
		
		<form id="adminTasks" action="AdminTaskServlet" method="post">
		<table>
			<tr>
				<td> </td>
				<td><input type="submit" name="add_librarian" value="AddLibrarian"></td>
			</tr>
			<tr>
				<td> </td>
				<td><input type="submit" name="add_student" value="AddStudent"></td>
			</tr>
			
			
		</table>
		</form>
	</div>
</body>
</html>