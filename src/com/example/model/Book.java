package com.example.model;

public class Book implements Comparable<Book>{
	private int id;
	private String name;
	private String author;
	private String publisher;
	private float price;
	public Book() {
		// TODO Auto-generated constructor stub
	}
	public Book(int id, String name, String author, String publisher, float price) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public int compareTo(Book other) {
		return this.id - other.id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if( obj != null ) {
			Book other = (Book) obj;	//Downcasting
			if( this.id == other.id)
				return true;
		}
		return false;
	}
	@Override
	public String toString() {
		return String.format("%-5d%-50s%-30s%-30s%-10.2f", this.id, this.name, this.author, this.publisher, this.price);
	}
}
