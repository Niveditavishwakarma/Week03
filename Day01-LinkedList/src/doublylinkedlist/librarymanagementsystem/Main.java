package doublylinkedlist.librarymanagementsystem;

public class Main {
    public static void main(String[] args) {
        LibraryManagement library = new LibraryManagement();

        library.addBook("Book1", "Author1", "Genre1", 1, true, 0);
        library.addBook("Book2", "Author2", "Genre2", 2, true, 1);
        library.addBook("Book3", "Author3", "Genre3", 3, true, 2);

        System.out.println("Books in forward order:");
        library.displayBooksForward();

        System.out.println("\nBooks in reverse order:");
        library.displayBooksReverse();

        System.out.println();
        library.searchBook("Book1");
        library.updateAvailability(2, false);
        library.removeBook(1);

        System.out.println("\nBooks after updates:");
        library.displayBooksForward();

        System.out.println();
        System.out.println("Total books in library: " + library.countBooks());
    }
}


