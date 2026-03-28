import java.util.ArrayList;

public class Library {
    private static Library Instance;
    private ArrayList<Book> Books;
    private String Name;
    private Library() {
        this.Books = new ArrayList<>();
        this.Name = "";
    }
    public static Library getInstance() {
        if (Instance == null) {
            Instance = new Library();
        }
        return Instance;
    }

    public ArrayList<Book> getBooks() {
        return Books;
    }
    public Book getBook(String title){
        for (Book book : Books) {
            if (book.title().equals(title)){
                return book;
            }
        }
        return null;
    }
    public void setBooks(ArrayList<Book> books) {
        Books = books;
    }
    public void addBook(Book book) {
        Books.add(book);
    }
    public void removeBook(Book book) {
        Books.remove(book);
    }

    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return Name;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
