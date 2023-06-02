package com.jsp.l_m_s.Service;

import java.util.List;

import com.jsp.l_m_s.Dao.StudentDao;
import com.jsp.l_m_s.Dto.Book;
import com.jsp.l_m_s.Dto.Student;

public class StudentService {
	StudentDao studentDao=new StudentDao();
	
	public Student createStudent(Student student) {
		
		return studentDao.createStudent(student);
		
	}
   
	public Student getStudentById(int id) {
		
		return studentDao.getStudentById(id);
	}
	
	public void removeStudent(int id) {
		Student student = studentDao.getStudentById(id);

		if (student != null) {
			studentDao.removeStudent(student);
		} else {
			return;
		}
	}
	public boolean borrowBook(Student student,List <Book> book) {
		
		return studentDao.borrowBook(student, book);
		
	}
	public boolean returnBook(Student student,List <Book> book) {
		return studentDao.returnBook(student, book);
	}
	
}
