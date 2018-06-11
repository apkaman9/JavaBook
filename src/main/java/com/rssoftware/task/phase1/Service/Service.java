package com.rssoftware.task.phase1.Service;

import java.util.List;

import com.rssoftware.task.phase1.Entity.Book;

public interface Service {
	 public String addBook(Book book);
	    public List<Book> searchByBookName(String bookname);
	    public List<Book> searchByCategory(String category);
	    public String deleteBook(String bookId);
}
