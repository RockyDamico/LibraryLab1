public class Library {
    // Add the missing implementation to this class

    //Create constructor for Library
    public Library(String string) {

    }

    //Create constructor for "addBook"
    private void addBook(Book book) {
    }

    //create constructor for "borrow book"
    private void borrowBook(String string) {
    }

    //Constructor for Library opening hours
    private static void printOpeningHours() {
        System.out.println("Both libraries are open daily from 9am to 5pm.");
    }

    //Constuctor for library addresses
    private void printAddress() {
        System.out.println("Libraries are located at:" + "\n" + "10 Main St. and" + "\n" + "228 Liberty St.");
    }

    //Constuctor for available books
    private void printAvailableBooks() {
    }

    //Constuctor for returning a book
    private void returnBook(String string) {
    }  

    public static void main(String[] args) {
        // Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");

        // Add four books to the first library
        System.out.println("Adding books to library.");
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));

        // Print opening hours and the addresses
        System.out.println("Library hours:");
        printOpeningHours();
        System.out.println();

        // System.out.println("Library addresses:");
        firstLibrary.printAddress();
        // secondLibrary.printAddress();
        System.out.println();

        // Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();

        // Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of available from the first library
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
    } 
} 


