package com.example.main;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;
import com.exampe.utils.*;
import com.example.model.Book;
import com.example.test.ListTest;

public class Program {
	private static Scanner sc = new Scanner(System.in);
	
	private static Book[] getBooks() {
		Book[] arr = new Book[ 10 ];
		arr[ 0 ] = new Book(1083, "The Alchemist", "Paulo Coelho", "HarperCollins", 901.14f);
		arr[ 1 ] = new Book(461, "The Da Vinci Code", "Dan Brown", "Doubleday", 1065.13f);
		arr[ 2 ] = new Book(932, "Harry Potter and the Philosopher's Stone", "J.K. Rowling", "Bloomsbury", 819.14f);
		arr[ 3 ] = new Book(1159, "The Hunger Games", "Suzanne Collins", "Scholastic Press", 737.15f);
		arr[ 4 ] = new Book(691, "The Girl with the Dragon Tattoo", "Stieg Larsson", "Norstedts Förlag", 1229.13f);
		arr[ 5 ] = new Book(115, "The Lord of the Rings", "J.R.R. Tolkien", "George Allen & Unwin", 1639.11f);
		arr[ 6 ] = new Book(574, "The Catcher in the Rye", "J.D. Salinger", "Little, Brown and Company", 983.14f);
		arr[ 7 ] = new Book(230, "The Fault in Our Stars", "John Green", "Dutton Books", 1147.13f);
		arr[ 8 ] = new Book(864, "Gone Girl", "Gillian Flynn", "Crown Publishing Group", 901.14f);
		arr[ 9 ] = new Book(383, "Pride and Prejudice", "Jane Austen", "T. Egerton, Whitehall", 655.15f);
		return arr;
	}
	
	private static void acceptRecord( int[] bookId ) {
		System.out.print("Enter book id	:	");
		bookId[ 0 ] = sc.nextInt();
	}
	private static void printRecord(Book book) {
		if( book != null )
			System.out.println( book.toString() );
		else
			System.out.println("Invalid book id");
	}
	
	private static void printRecord(boolean removedStatus) {
		if( removedStatus == true )
			System.out.println("Record is removed");
		else
			System.out.println("Invalid book id");
	}
	
	private static int mainMenuList( ) {
		System.out.println("0.Exit");
		System.out.println("1.Add Record");
		System.out.println("2.Find Record");
		System.out.println("3.Remove Record");
		System.out.println("4.Print Record[ Sorted ]");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}
	
	private static int subMenuList( ) {
		System.out.println("0.Exit");
		System.out.println("1.Compare By Id");
		System.out.println("2.Compare By Name");
		System.out.println("3.Compare By Author");
		System.out.println("4.Compare By Publisher");
		System.out.println("5.Compare By Price");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}
	public static void main(String[] args) {
		int choice;
		int[] bookId = new int[ 1 ];
		
		ListTest test = new ListTest();
		test.setBookList( new ArrayList<Book>( ) );
		
		//test.setBookList( new Vector<Book>() );
		//test.setBookList( new LinkedList<Book>() );
		
		while( ( choice = Program.mainMenuList( ) ) != 0 ) {
			switch( choice ) {
			case 1:
				Book[] books = Program.getBooks();
				test.addRecord( books );
				break;
			case 2:
				Program.acceptRecord( bookId ) ;
				Book book =  test.findRecord( bookId[ 0 ] );
				Program.printRecord( book );
				break;
			case 3:
				Program.acceptRecord( bookId ) ;
				boolean removedStatus = test.removeRecord( bookId[ 0 ] );
				Program.printRecord(removedStatus);
				break;
			case 4:
				while( ( choice = Program.subMenuList( ) ) != 0 ) {
					Comparator<Book> comparator = null;
					switch( choice ) {
					case 1:
						comparator = new CompareById();
						break;
					case 2:
						comparator = new CompareByName();
						break;
					case 3:
						comparator = new CompareByAuthor();
						break;
					case 4:
						comparator = new CompareByPublisher();
						break;
					case 5:
						comparator = new CompareByPrice();
						break;
					
					}
					test.printRecord(  comparator );
				}
				
				break;
			}
		}
	}
}
