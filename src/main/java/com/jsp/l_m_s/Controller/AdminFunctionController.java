package com.jsp.l_m_s.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/AdminTaskServlet")
public class AdminFunctionController extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String add_librarian=req.getParameter("add_librarian");
		String add_student=req.getParameter("add_student");
		
		if(add_librarian != null) {
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("RegisterLibrarian.jsp");
			requestDispatcher.forward(req, resp);
		}else if (add_student != null) {
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("RegisterStudent.jsp");
			requestDispatcher.forward(req, resp);
		}
	}
}
