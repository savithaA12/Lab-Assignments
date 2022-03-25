package com.bookapp.model.dao;

import java.util.*;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class BookDaoImplHib implements BookDao{

	private SessionFactory factory;
	
	public BookDaoImplHib() {
		factory=HibernateConnectionFactory.getSessionFactory();
	}

	@Override
	public List<Book> getAll() {
		Session session=factory.openSession();
		List<Book>books=session.createQuery("select b from Book b", Book.class).getResultList();
		session.close();
		return books;
	}
	
	@Override
	public void addBook(Book b) {
		Session session=factory.openSession();
		Transaction tx=session.getTransaction();
		try {
			tx.begin();
			
			session.save(b);
			
			tx.commit();
		}catch(HibernateException ex) {
			tx.rollback();
			ex.printStackTrace();
		}
		session.close();
		
	}
	@Override
	public void deleteBook(int id) {
		Session session = factory.openSession();

		Transaction tx = session.getTransaction();
		Employee employee = null;
		try {
			tx.begin();

			Book = getById(id).orElseThrow(() -> new BookNotFoundException("book not found"));
			
			session.delete(Book);
			tx.commit();
		} catch (HibernateException ex) {
			tx.rollback();
		}
		return Book;
		
	}
    @Override
	public Book updateBook(int id, Book book) {
		Session session = factory.openSession();

		Transaction tx = session.getTransaction();
		try {
			tx.begin();

			Book = getById(id).orElseThrow(() -> new BookNotFoundException("book not found"));
			
            Book.setInt(1, book.getBookPrice());
			Book.setInt(2, bookId);			
			session.update(Book);
			
			
			tx.commit();
		} catch (HibernateException ex) {
			tx.rollback();
		}
		return employee;
	}
	
}
