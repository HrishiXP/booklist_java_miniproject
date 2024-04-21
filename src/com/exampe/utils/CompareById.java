package com.exampe.utils;

import java.util.Comparator;
import com.example.model.Book;
public class CompareById implements Comparator<Book>{
	@Override
	public int compare(Book b1, Book b2) {
		return b1.getId() - b2.getId();
	}
}