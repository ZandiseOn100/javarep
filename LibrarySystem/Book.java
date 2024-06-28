package LibrarySystem;

public class Book {
    private String title;
    private String author;
    private boolean isBorrowed;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public boolean getIsBorrowerd(){
        return isBorrowed;
    }
    public void borrow(){
        if (!isBorrowed) {
            isBorrowed = true;
            System.out.println("You have borrowed" + title);   
        }else{
            System.out.println("The book is already borrowed");
        }
    }
    public void returnBook(){
        if (isBorrowed){
            isBorrowed = false;
            System.out.println("You have returned" + title);
        }else{
            System.out.println("The book was not borrowed.");
        }
    }
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isBorrowed=" + isBorrowed +
                '}';
    }            
}
