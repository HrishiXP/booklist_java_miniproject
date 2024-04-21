package com.exampe.utils;

import java.util.Comparator;
import com.example.model.Book;

public class CompareByPrice implements Comparator<Book>{
	@Override
	public int compare(Book b1, Book b2) {
		return (int) (b1.getPrice() - b2.getPrice());
	}
}
