package com.example.test;
import java.util.Comparator;
import java.util.List;

import com.example.model.Book;

public class ListTest{
	private List<Book> bookList;	//null
	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}
	
	public void addRecord(Book[] books) {
		if( this.bookList != null ) {
			if( books != null ) {
				for (Book book : books) {
					this.bookList.add(book);
				}
			}
		}
	}
	
	public Book  findRecord(int bookId) {
		if( this.bookList != null ) {
			Book key = new Book();
			key.setId(bookId);	
			
			if( this.bookList.contains(key)) {
				int index = this.bookList.indexOf(key);
				Book book = this.bookList.get(index);
				return book;
			}
		}
		return null;
	}
	
	
	public boolean removeRecord(int bookId) {
		if( this.bookList != null ) {
			Book key = new Book();
			key.setId(bookId);	
			
			if( this.bookList.contains(key)) {
				this.bookList.remove(key);
				return true;
			}
		}
		return false;
	}
	
	public void printRecord(Comparator<Book> comparator) {
		if( this.bookList != null ) {
			this.bookList.sort(comparator);
			for (Book book : this.bookList) {
				System.out.println( book.toString());
			}
		}
	}	
	
}

