package com.jsp.l_m_s.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/AdminServlet")
public class AdminLoginController extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String id = req.getParameter("admin_id");
		String password = req.getParameter("admin_password");
		
		String adminId = "100";
		String adminPassword = "admin@123";
		PrintWriter printWriter = resp.getWriter();
		
		if (id.equals(adminId) && password.equals(adminPassword)) {
			System.out.println("admin successfully loggedin");
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("AdminFunctions.jsp");
			requestDispatcher.forward(req, resp);

		} else {
			printWriter.write("<html><body><h1> Invalid Admin </h1></body></html>");
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("AdminLogin.jsp");
			requestDispatcher.include(req, resp);

		}
	}
}
