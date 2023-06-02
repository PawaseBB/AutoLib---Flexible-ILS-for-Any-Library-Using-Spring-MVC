package com.jsp.l_m_s.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/LibrarianFunctionServlet")
public class LibrarianFunctionController extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String register_librarian=req.getParameter("register_librarian");
		String login_Librarian=req.getParameter("login_Librarian");
		
		if(register_librarian != null) {
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("RegisterLibrarian.jsp");
			requestDispatcher.forward(req, resp);
		}else if (login_Librarian != null) {
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("LibrarianLogin.jsp");
			requestDispatcher.forward(req, resp);
		}
	}
}
