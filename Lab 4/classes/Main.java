import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Library> Students = new ArrayList<Library>();
		ArrayList<Library> Books = new ArrayList<Library>();


		//create a scanner
		
		//create an instance of library class

		//declare required variables
		Library library = new Library();
		int choice = -1;
		
		while (choice != 0) {
			System.out.println("Welcome to the AITU Library");
			System.out.println("1. Add book");
			System.out.println("2. Add student");
			System.out.println("3. Give book to student");
			System.out.println("4. Return book from student");
			System.out.println("5. Print books information");
			System.out.println("6. Print students information");
			System.out.println("7. Print student's books");
			System.out.println("0. Exit");
			
			choice = in.nextInt();
			
			switch (choice) {
				case 1:
					System.out.println("Book:");
					System.out.println("Title:");
					String title = in.next();
					System.out.println("Author:");
					String author = in.next();
					System.out.println("ISBN:");
					String isbn = in.next();
					System.out.println("Year:");
					int year = in.nextInt();
					System.out.println("Quantity:");
					int quantity = in.nextInt();
					Book book = new Book(title,author,isbn,year,quantity);
					library.addBook(book);

				//here you have to add an opportunity to create an instance of a book
				//and then you have to call corresponding method from library object in order to add created book

					break;
				case 2:
					System.out.println("Id:");
					int id = in.nextInt();
					System.out.println("Name:");
					String name = in.next();
					System.out.println("Surname:");
					String surname = in.next();
					System.out.println("Group:");
					String group = in.next();
					Student student = new Student(id,name,surname,group);
					library.addStudent(student);
				// same as for case 1, but for "student" object

					break;
				case 3:
				//here you have to call corresponding method for adding a certain book for a certain student
					break;
				case 4:
				//here you have to call corresponding method for returning a certain book from a certain student
					break;
				case 5:

					library.printBooksInformation();
				//here you have to call method in order to print info about all books in library
					break;
				case 6:
					library.printStudentsInformation();
				//here you have to call method in order to print info about all students in library
					break;
				case 7:
				//here you have to call method in order to print info about books borrowed by a certain student
					break;
			}
		}
	}
}
