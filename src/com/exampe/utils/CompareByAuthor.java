package com.exampe.utils;
import java.util.Comparator;
import com.example.model.Book;

public class CompareByAuthor implements Comparator<Book>{
	@Override
	public int compare(Book b1, Book b2) {
		return b1.getAuthor().compareTo(b2.getAuthor());
	}
}
