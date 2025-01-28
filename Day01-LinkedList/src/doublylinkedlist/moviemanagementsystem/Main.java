package doublylinkedlist.moviemanagementsystem;

public class Main {
    public static void main(String[] args) {
        MovieManagementSystem system = new MovieManagementSystem();

        // Adding movies with Hindi names
        system.addAtBeginning("Ek Kahani", "Adityaa", 1995, 8.9);
        system.addAtEnd("shole", "Ramanand", 1975, 9.0);
        system.addAtEnd("3 idiots", "Rajkumar", 2009, 8.4);
        system.addAtPosition(2, "table no. 21", "Shimit", 2007, 8.1);

        System.out.println("Movies in forward order:");
        system.displayForward();

        System.out.println("\nMovies in reverse order:");
        system.displayReverse();

        System.out.println("\nSearching for movies by Director:");
        system.searchByDirector("Rajkumar");

        System.out.println();
        system.updateRating("shole", 9.5);

        system.removeByTitle("Ek Kahani");

        System.out.println("\nMovies after removal:");
        system.displayForward();
    }
}
