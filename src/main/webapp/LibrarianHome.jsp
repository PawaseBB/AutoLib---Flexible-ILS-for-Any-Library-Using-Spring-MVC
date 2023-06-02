<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Librarian Home</title>
	<style>
		.container{
			width: 35%;
			border: 1px solid black;
			margin: auto;
			padding: 20px;
			font-size: 20px;
		}
		#LibrarianTasks table tr td input{
			font-size: 20px;
		}
	</style>
</head>
<body>
	<div class="container">
		<h2>Librarian Home</h2>
		
		<form id="LibrarianTasks" action="LibrarianHomeServlet" method="post">
		<table>
			<tr>
				<td><input type="submit" name="insertBook" value="Add Book In Library"></td>
			</tr>
			<tr>
				<td><input type="submit" name="removeBook" value="Remove Book From Library"></td>
			</tr>
			<tr>
				<td><input type="submit" name="bookIssueHistory" value="Book Issued History"></td>
			</tr>
			<tr>
				<td><input type="submit" name="bookReturnHistory" value="Book Return History"></td>
			</tr>
			<tr>
				<td><input type="submit" name="listOfBook" value="List of Books Available"></td>
			</tr>
		
		</table>
		</form>
	</div>
</body>
</html>