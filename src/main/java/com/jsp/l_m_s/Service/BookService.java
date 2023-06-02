package com.jsp.l_m_s.Service;

import java.util.List;

import com.jsp.l_m_s.Dao.BookDao;
import com.jsp.l_m_s.Dto.Book;


public class BookService {
	BookDao bookDao=new BookDao();
	public Book saveBook(Book book) {
	
	  return bookDao.saveBook(book);
	}
	
	public Book getBookById(int id) {
		
		return bookDao.getBookById(id);
	}
	public List<Book> getAllBooks() {
		return bookDao.getAllBooks();
	}
}
