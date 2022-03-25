package com.bookstoreapp.model.dao;

import java.sql.*;
import java.util.*;

import com.bookstoreapp.factory.ConnectionFactory;
import com.bookstoreapp.model.exception.bookNotFoundException;

public class BookDaoImpl implements BookDao{

	private Connection connection;
	
	public BookDaoImpl() {
		connection=JdbcConnectionFactory.getConnection();
	}
	@Override
	public List<Book> getAllBooks() {

		try {
			PreparedStatement pstmt = connection.prepareStatement("select * from books");
			ResultSet rs = pstmt.executeQuery();
			
		while (rs.next()) {
				tempBook = new Book(rs.getInt("id"), 
						rs.getString("title"),
						rs.getString("author"), 
						rs.getDouble("price"));

				books.add(tempBook);
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
			
		return books;
	}

	@Override
	public Book addBook(Book book) {
		
		try {
			String add_book_query=
			"insert into books(isbn, title, author, pubDate, price) values(?,?,?,?,?)";
			PreparedStatement pstmt=connection.prepareStatement(add_book_query, 
					Statement.RETURN_GENERATED_KEYS);
			
			pstmt.setString(2, book.getTitle());
			pstmt.setString(3, book.getAuthor());
			pstmt.setDouble(5, book.getPrice());
			
			int noOfRowsEffected=pstmt.executeUpdate();
			
			if(noOfRowsEffected>0) {
				ResultSet rs=pstmt.getGeneratedKeys();
				rs.next();
				book.setId(rs.getInt(1));
			}	
		} catch (SQLException ex) {
			ex.printStackTrace();
			throw new DataAccessException(ex.getMessage());
		}
		
		return book;
	}

	@Override
	public Book delBook(int id) {
		
		Book bookToBeDeleted = getBookById(id);
		try {
			String delete_book_by_id="delete from books where id=?";
			PreparedStatement pstmt= connection.prepareStatement(delete_book_by_id);
			pstmt.setInt(1, id);
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return bookToBeDeleted;
	}

	@Override
	public Book updateBook(int id, double price) {
		Book bookToBeUpdated = getBookById(id);// if book is not found it throws the ex: BookNotFoundEx
		
		try {
			String update_book_query=
			"update books set price=? where id=?";
			PreparedStatement pstmt=connection.prepareStatement(update_book_query);
			pstmt.setDouble(1, price);
			pstmt.setInt(2, id);
			int noOfRowsEffected=pstmt.executeUpdate();
			
		} catch (SQLException ex) {
			ex.printStackTrace();
			throw new DataAccessException(ex.getMessage());
		}
		bookToBeUpdated.setPrice(price);
		
		return bookToBeUpdated;
	}

	@Override
	public Book getBookById(int id) {
		Book book=null;
		try {
			String get_book_by_id="select * from books where id=?";
			PreparedStatement pstmt= connection.prepareStatement(get_book_by_id);
			pstmt.setInt(1, id);
			ResultSet rs=pstmt.executeQuery();
			if(rs.next()) {
				book=new Book(rs.getInt("id"), rs.getString("isbn"), rs.getString("title"),
						rs.getString("author"), rs.getDouble("price"));
			}else {
				throw new BookNotFoundException("book with id "+ id +" is not found");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return book;
	}

	


}
