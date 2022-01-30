import java.util.ArrayList;

public class Student {
	private int id;
	private String name;
	private String surname;
	private String group;
	private ArrayList<Book> borrowedBooks;
	public void setter(int id,String name,String surname,String group){
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.group = group;
	}
	public Student(int id1,String name1,String surname1,String group1){
		id = id1;
		name = name1;
		surname = surname1;
		group = group1;
		borrowedBooks = new ArrayList<Book>();
	}

	public String getName() {
		return name;
	}

	public String getGroup() {
		return group;
	}

	public String getSurname() {
		return surname;
	}

	public int getId() {
		return id;
	}
	//add all necessary fields
	//add constructor
	//note: initialize an arraylist within the constructor
	//add getters and setters

	//this method allows to borrow book from a library
	//by adding book into arraylist
	//note: it is not allowed to have the same books (check for duplicates before adding a book)
	public void borrowBook(/*add params here*/) {
		
	}
	//this method allows to return book from student to library
	//by removing selected book from arraylist
	public void returnBook(/*add params here*/) {
		
	}
	
	//this method allows to print the list of borrowed books
	public void printBooks() {
		
	}
}
