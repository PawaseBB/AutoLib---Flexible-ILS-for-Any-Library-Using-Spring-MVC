package com.jsp.l_m_s.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.l_m_s.Dto.Book;
import com.jsp.l_m_s.Dto.Student;

public class StudentDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("bhushan");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	public Student createStudent(Student student) {

		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();
		return student;
	}
	
	public Student getStudentById(int id) {
		
		return entityManager.find(Student.class, id);
	}
	
	public List<Student> getAllStudents() {
		String sql = "select s from Student s";
		Query query = entityManager.createQuery(sql);
		List<Student> students = query.getResultList();
		return students;
	}
	public void removeStudent(Student student) {
		if (student != null) {
			entityTransaction.begin();
			entityManager.remove(student);
			entityTransaction.commit();
		} 
	}
	
	public boolean borrowBook(Student student,List <Book> book) {
		for(Book b:book) {
			if(student!=null && b!=null) {  
				entityTransaction.begin();
				entityManager.merge(student);
				entityManager.merge(b);
				entityTransaction.commit();
				System.out.println("Book Borrowed");
			}
			return true;	       
		}
		return false;
		}
	
	public boolean returnBook(Student student,List <Book> book) {
		
		for(Book b: book) {
			if(b!=null && student!=null) {
				
				entityTransaction.begin();
				entityManager.merge(b);
				entityManager.merge(student);
				entityTransaction.commit();
				System.out.println("Returned");
			} 
			return true;
		} 
	    return false;
	
	}
}
