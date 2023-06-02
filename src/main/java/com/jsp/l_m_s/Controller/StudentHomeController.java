package com.jsp.l_m_s.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(value = "/StudentHomeServlet")
public class StudentHomeController extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String borrowBook=req.getParameter("Book_Borrow_By_Student");
		String returnBook=req.getParameter("Book_Return_By_Student");
		String listOfBooks=req.getParameter("List_Of_Books_Available");
		
		if(borrowBook != null) {
			RequestDispatcher requestDispatcher=req.getRequestDispatcher(".jsp");
			requestDispatcher.forward(req, resp);
		}else if (returnBook != null) {
			RequestDispatcher requestDispatcher=req.getRequestDispatcher(".jsp");
			requestDispatcher.forward(req, resp);
		}else if (listOfBooks != null) {
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("AvailableBooksInLibrary.jsp");
			requestDispatcher.forward(req, resp);
		}
	}
}
