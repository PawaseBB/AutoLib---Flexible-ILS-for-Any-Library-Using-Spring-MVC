package com.jsp.l_m_s.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.l_m_s.Dto.Librarian;
import com.jsp.l_m_s.Service.LibrarianService;
@WebServlet(value = "/RegisterLibrarianServlet")
public class AddLibrarianController extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name=req.getParameter("librarian_name");
		String password=req.getParameter("librarian_password");
		String email=req.getParameter("librarian_email");
		String phone_no=req.getParameter("librarian_phone_no");
		
		Librarian librarian=new Librarian();
		librarian.setName(name);
		librarian.setPassword(password);
		librarian.setEmail(email);
		librarian.setPhone(phone_no);
		
		LibrarianService librarianService=new LibrarianService();
		Librarian l=librarianService.createLibrarian(librarian);
	       
	       if(l!=null) {
		    	 RequestDispatcher requestDispatcher = req.getRequestDispatcher("LibrarianRegisterSuccessfull.jsp");
		 		requestDispatcher.forward(req, resp);

		     }else {
		    	 RequestDispatcher requestDispatcher = req.getRequestDispatcher("RegisterLibrarian.jsp");
			 		requestDispatcher.forward(req, resp);

		     }
	}
}
