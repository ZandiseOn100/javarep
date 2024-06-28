package LibrarySystem;
import java.util.ArrayList;


public class Library {
    private ArrayList<Book> books;

    public Library(){
        books = new ArrayList<>();
    }
    public void addBook(Book book){
        books.add(book);
        System.out.println("Added book: " + book.getTitle());
    }
    public void borrowBook(String title){
        for (Book book: books){
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.borrow();
                return;
            }
        }
        System.out.println("Book not found!");
    }

    public void returnBook(String title){
        for (Book book : books){
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.returnBook();
                return;
            }
        }
        System.out.println("Book not found");
    }

    public void viewBooks(){
        for (Book book : books){
            System.out.println(book);
        }
    }
}
