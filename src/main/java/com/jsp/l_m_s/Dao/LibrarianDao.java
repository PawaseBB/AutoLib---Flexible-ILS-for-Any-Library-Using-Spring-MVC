package com.jsp.l_m_s.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.l_m_s.Dto.Librarian;

public class LibrarianDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("bhushan");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	public Librarian createLibrarian(Librarian librarian) {
		entityTransaction.begin();
		entityManager.persist(librarian);
		entityTransaction.commit();
		return librarian;
	}
	
	public Librarian getByIdLibrarian(int id) {
		return entityManager.find(Librarian.class, id);
	}

	public void removeLibrarian(Librarian librarian) {
		if (librarian != null) {
			entityTransaction.begin();
			entityManager.remove(librarian);
			entityTransaction.commit();
		} else
			return;
	}
	
	public List<Librarian> getAllLibrarians() {
		String sql = "select l from Librarian l";
		Query query = entityManager.createQuery(sql);
		List<Librarian> librarians = query.getResultList();
		return librarians;
	}
	

}
