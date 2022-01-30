
public class Book {
    private String title;
    private String author;
    private String isbn;
    private int year;
    private int quantity;

    public void setter(String title,String author,String isbn,int year,int quantity){
        this.author = author;
        this.isbn = isbn;
        this.title = title;
        this.year = year;
        this.quantity = quantity;
    }
    public Book(String title1,String author1,String isbn1,int year1,int quantity1){
        author = author1;
        title = title1;
        isbn = isbn1;
        year = year1;
        quantity = quantity1;
    }


    public int getQuantity() {
        return quantity;
    }

    public int getYear() {
        return year;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                ", year=" + year +
                ", quantity=" + quantity +
                '}';
    }
    //add all necessary fields
	//add constructor
    //add getters and setters
    //add toString method
}
