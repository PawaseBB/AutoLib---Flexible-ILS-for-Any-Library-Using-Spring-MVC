package com.jsp.l_m_s.Service;

import java.util.List;

import com.jsp.l_m_s.Dao.LibrarianDao;
import com.jsp.l_m_s.Dto.Librarian;

public class LibrarianService {
	LibrarianDao librarianDao = new LibrarianDao();
	
	public Librarian createLibrarian(Librarian librarian) {
		return librarianDao.createLibrarian(librarian);
	}
	
	public Librarian getByIdLibrarian(int id) {
		return librarianDao.getByIdLibrarian(id);
	}
	
	public List<Librarian> getAllLibrarians() {
		return librarianDao.getAllLibrarians();
	}
	
	public void removeLibrarian(int id) {
		Librarian librarian = librarianDao.getByIdLibrarian(id);

		if (librarian != null) {
			librarianDao.removeLibrarian(librarian);
		} else
			return;
	}	
}
