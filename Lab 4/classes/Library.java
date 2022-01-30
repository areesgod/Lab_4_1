import java.lang.reflect.Array;
import java.util.ArrayList;

public class Library {
	private ArrayList<Book> books = new ArrayList<Book>();
	private ArrayList<Student> students = new ArrayList<Student>();

	//add all necessary fields
	//add constructor
	//note: initialize required arraylists within the constructor
	
	//this method allows to add a new book to library
	//by adding a book into arraylist
	//note: it is not allowed to have the books with the same name (check for duplicates before adding a book)
	public void addBook(Book book) {
		books.add(book);
		
	}
	//this method allows to add a new student to library
	//by adding a student into arraylist
	//note: it is not allowed to have the students with the same id (check for duplicates before adding a book)
	public void addStudent(Student student) {
		students.add(student);


	}
	//this method allows to increase by one amount of a certain book in a library
	//after it returns back from a student
	public void increaseBookQuantity(/*add params here*/) {
		
	}
	//this method allows to decrease by one amount of a certain book in a library
	//if its borrowed by a student
	public void decreaseBookQuantity(/*add params here*/) {
		
	}
	//this method allows to borrow a certain book by a certain student;
	// as well as here we have to decrease amount of taken book
	public void addBookToStudent(/*add params here*/) {
		
	}
	//this method allows to return a certain book by a certain student;
	// as well as here we have to increase amount of returned book
	public void returnBookFromStudent(/*add params here*/) {
		
	}
	
	//this method allows to print info about all books in library,
	// including overall their amount and so on
	public void printBooksInformation() {
		for (int i = 0; i < books.size(); i++) {
			System.out.println(books.get(i));
		}

		
	}
	//this method allows to print info about all students in library,
	// including overall their amount and so on
	public void printStudentsInformation() {
		for (int i = 0; i < students.size(); i++) {
			System.out.println(students.get(i));
		}
		
	}
	//this method allows to show info about borrowed books of a certain student
	public void printStudentsBooks(/*add params here*/) {
		
	}
}
