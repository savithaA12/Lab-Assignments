package com.bookapp.service;

import java.util.List;

import com.bookstore.dao.BookDao;
import com.bookstore.dao.BookDaoImpl;


public class BookServiceImpl implements BookService {
	private BookDao bookDao;
	
	
	public BookServiceImpl() {
		bookDao=new BookDaoImplJdbc();
	}

	@Override
	public List<Book> getAllBooks() {
		return bookDao.getAllBooks();
	}

	@Override
	public Book getBookById(int id) {
		return bookDao.getBookById(id);
	}

	@Override
	public Book addBook(Book book) {
		return bookDao.addBook(book);
	}

	@Override
	public void deleteBook(int id) {
		bookDao.deleteBook(id);
	}

	@Override
	public void updateBook(int id, Book book) {
		bookDao.updateBook(id, book);
	}

	
}
