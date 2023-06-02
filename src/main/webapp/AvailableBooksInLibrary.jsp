<%@page import="org.hibernate.internal.build.AllowSysOut"%>
<%@page import="com.jsp.l_m_s.Dto.Book"%>
<%@page import="java.util.List"%>
<%@page import="com.jsp.l_m_s.Service.BookService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Available Books in Library</title>
</head>
<body>
	<%
		BookService bookService = new BookService();
		List<Book> books = bookService.getAllBooks();
	%>
	<table border="2px" cellpadding=22px>
		<tr>
			<th>Book Name</th>
			<th>Book Author</th>
		</tr>
		<%
			for (Book b : books) {
		%>
		<tr>
			<td><%=b.getBookName()%></td>
			<td><%=b.getBookAuthor()%></td>
		</tr>

		<%
		}
		%>
	</table>

</body>
</html>