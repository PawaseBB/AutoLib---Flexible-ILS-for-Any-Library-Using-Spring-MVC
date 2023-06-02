package com.jsp.l_m_s.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.l_m_s.Dto.Book;
import com.jsp.l_m_s.Service.BookService;
@WebServlet(value = "/InsertBookServlet")
public class InsertBookController extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name=req.getParameter("book_name");
		String authorName=req.getParameter("author_name");
		String isbn=req.getParameter("isbn_no");
		
		Book book=new Book();
		book.setBookName(name);
		book.setBookAuthor(authorName);
		book.setIsbn(isbn);
		
		BookService bookService=new BookService();
		Book b=bookService.saveBook(book);
		
		if(b != null) {
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("InsertBookSuccessfull.jsp");
			requestDispatcher.forward(req, resp);
		}else {
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("InsertBook.jsp");
			requestDispatcher.forward(req, resp);
		}
	
	}
}
