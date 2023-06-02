package com.jsp.l_m_s.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.l_m_s.Dto.Student;
import com.jsp.l_m_s.Service.StudentService;
@WebServlet(value = "/RegisterStudentServlet")
public class AddStudentController extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name=req.getParameter("student_name");
		String password=req.getParameter("student_password");
		String email=req.getParameter("student_email");
		String phone_no=req.getParameter("student_phone_no");
		
		Student student=new Student();
		student.setName(name);
		student.setPassword(password);
		student.setEmail(email);
		student.setPhone(phone_no);
		
		StudentService studentService=new StudentService();
		Student s=studentService.createStudent(student);
		
		 if(s!=null) {
	    	 RequestDispatcher requestDispatcher = req.getRequestDispatcher("StudentRegisterSuccessfull.jsp");
	 		requestDispatcher.forward(req, resp);

	     }else {
	    	 RequestDispatcher requestDispatcher = req.getRequestDispatcher("RegisterStudent.jsp");
		 		requestDispatcher.forward(req, resp);

	     }
	}
}
