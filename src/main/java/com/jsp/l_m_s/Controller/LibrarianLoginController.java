package com.jsp.l_m_s.Controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/LibrarianLoginServlet")
public class LibrarianLoginController extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name= req.getParameter("librarian_name");
		String password=req.getParameter("librarian_password");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/l_m_s","root","root");
			PreparedStatement ps= con.prepareStatement("SELECT * FROM librarian WHERE name = ? AND password = ?");
			
			ps.setString(1, name);
			ps.setString(2, password);
			
			ResultSet rs= ps.executeQuery();
			
			if(rs.next()) {
				RequestDispatcher requestDispatcher = req.getRequestDispatcher("LibrarianHome.jsp");
				requestDispatcher.forward(req, resp);
			}else {
				RequestDispatcher requestDispatcher = req.getRequestDispatcher("InvalidData.jsp");
				requestDispatcher.forward(req, resp);
			}
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
