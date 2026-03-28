import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello! Welcome to Library CLI");
        System.out.println("This helps you manage you Library!");
        System.out.println("------------------------------------------------");
        while(true){
            System.out.println("1. Add Book (Add)");
            System.out.println("2. Read Book (Read)");
            System.out.println("3. Remove Book (Remove)");
            System.out.println("4. Exit");
            System.out.print("What do you want to do?: ");
            String task = new Scanner(System.in).nextLine();
            if (task.equals("Add")){
                System.out.print("Please enter the Book's title: ");
                String title = new Scanner(System.in).nextLine();

                System.out.print("Please enter the Book's author: ");
                String author = new Scanner(System.in).nextLine();

                System.out.print("Please enter the Book's description: ");
                String description = new Scanner(System.in).nextLine();

                System.out.print("Please enter the Book's publisher: ");
                String publisher = new Scanner(System.in).nextLine();

                System.out.print("Please enter the Book's genre: ");
                String genre = new Scanner(System.in).nextLine();
                Library.getInstance().addBook(new Book(title, author, description, publisher, genre));

                System.out.println("Book added successfully!");
            }
            else if (task.equals("Read")){
                System.out.print("Please enter the Book's title: ");
                String title = new Scanner(System.in).nextLine();

                Book book = Library.getInstance().getBook(title);

                if (book == null){
                    System.out.println("Book not found!");
                }
                else{
                    System.out.println(book);
                    System.out.println("Book's title: " + book.title());
                    System.out.println("Book's author: " + book.author());
                    System.out.println("Book's description: " + book.description());
                    System.out.println("Book's publisher: " + book.publisher());
                    System.out.println("Book's genre: " + book.genre());
                }
            }
            else if (task.equals("Remove")){
                System.out.print("Please enter the Book's title: ");
                String title = new Scanner(System.in).nextLine();
                Book book = Library.getInstance().getBook(title);
                if (book == null){
                    System.out.println("Book not found!");
                }
                else{
                    Library.getInstance().removeBook(book);
                    System.out.println("Book removed successfully!");
                }
            }
            else if (task.equals("Exit")){
                System.out.println("Bye!");
                System.exit(0);
            }
            else {
                System.out.println("Invalid input!");
            }
            System.out.println("-------------------------------------------------");
        }
    }
}
