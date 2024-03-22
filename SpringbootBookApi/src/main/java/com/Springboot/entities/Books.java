package com.Springboot.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Books {
	
	@Id
	private int bookId;
	private String bookTitle;
	private String bookAuther;
	
	public Books() {
		super();
	}
	public Books(int bookId, String bookTitle, String bookAuther) {
		super();
		this.bookId = bookId;
		this.bookTitle = bookTitle;
		this.bookAuther = bookAuther;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getBookAuther() {
		return bookAuther;
	}
	public void setBookAuther(String bookAuther) {
		this.bookAuther = bookAuther;
	}
	@Override
	public String toString() {
		return "Books [bookId=" + bookId + ", bookTitle=" + bookTitle + ", bookAuther=" + bookAuther + "]";
	}
	
	
	

}
