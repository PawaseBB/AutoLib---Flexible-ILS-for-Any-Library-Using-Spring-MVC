package com.jsp.l_m_s.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(value = "/LibrarianHomeServlet")
public class LibrarianHomeController extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String insertBook=req.getParameter("insertBook");
		String removeBook=req.getParameter("removeBook");
		String bookIssueHistory=req.getParameter("bookIssueHistory");
		String bookReturnHistory=req.getParameter("bookReturnHistory");
		String listOfBook=req.getParameter("listOfBook");
		
		if(insertBook != null) {
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("InsertBook.jsp");
			requestDispatcher.forward(req, resp);
		}else if (removeBook != null) {
			RequestDispatcher requestDispatcher=req.getRequestDispatcher(".jsp");
			requestDispatcher.forward(req, resp);
		}else if (bookIssueHistory != null) {
			RequestDispatcher requestDispatcher=req.getRequestDispatcher(".jsp");
			requestDispatcher.forward(req, resp);
		}else if (bookReturnHistory != null) {
			RequestDispatcher requestDispatcher=req.getRequestDispatcher(".jsp");
			requestDispatcher.forward(req, resp);
		}else if (listOfBook != null) {
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("AvailableBooksInLibrary.jsp");
			requestDispatcher.forward(req, resp);
		}
	}
}
