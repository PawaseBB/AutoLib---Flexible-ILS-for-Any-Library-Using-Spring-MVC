package com.jsp.l_m_s.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.l_m_s.Dto.Book;

public class BookDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("bhushan");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Book saveBook(Book book) {
		entityTransaction.begin();
		entityManager.persist(book);
		entityTransaction.commit();
		
		return book;
	}
	
	public Book getBookById(int id) {
		
		return entityManager.find(Book.class, id);
	}
	
	public List<Book> getAllBooks() {
		String sql="SELECT b FROM Book b";
		Query query=entityManager.createQuery(sql);
		return query.getResultList();
	}

}
