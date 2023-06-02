<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Student Login</title>

<style>
		.container{
			width: 35%;
			border: 1px solid black;
			margin: auto;
			padding: 20px;
			font-size: 20px;
		}
		#studentlogin table tr td input{
			font-size: 20px;
		}
	</style>
</head>
<body>
	<div class="container">
		<h2>Student Login</h2>
		
		<form id="studentlogin" action="StudentLoginServlet" method="post">
		<table>
			<tr>
				<td>Enter Student Name : </td>
				<td><input type="text" name="student_name" placeholder="Enter student Name"></td>
			</tr>
			<tr>
				<td>Enter Password : </td>
				<td><input type="password" name="student_password" placeholder="Enter Password"></td>
			</tr>
			
			<tr>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td> </td>
				<td>
					<button type="submit">Submit</button>
					<button type="reset">Reset</button>
				</td>
			</tr>
			
		</table>
		</form>
	</div>
</body>
</html>