package doublylinkedlist.moviemanagementsystem;

 class MovieManagementSystem {
     private Movie head;

     public MovieManagementSystem() {
         this.head = null;
     }

     public void addAtBeginning(String title, String director, int year, double rating) {
         Movie newMovie = new Movie(title, director, year, rating);
         if (head != null) {
             head.prev = newMovie;
         }
         newMovie.next = head;
         head = newMovie;
     }

     public void addAtEnd(String title, String director, int year, double rating) {
         Movie newMovie = new Movie(title, director, year, rating);
         if (head == null) {
             head = newMovie;
             return;
         }
         Movie current = head;
         while (current.next != null) {
             current = current.next;
         }
         current.next = newMovie;
         newMovie.prev = current;
     }

     public void addAtPosition(int position, String title, String director, int year, double rating) {
         if (position == 1) {
             addAtBeginning(title, director, year, rating);
             return;
         }
         Movie newMovie = new Movie(title, director, year, rating);
         Movie current = head;
         int count = 1;
         while (current != null && count < position - 1) {
             current = current.next;
             count++;
         }
         if (current != null) {
             newMovie.next = current.next;
             newMovie.prev = current;
             if (current.next != null) {
                 current.next.prev = newMovie;
             }
             current.next = newMovie;
         } else {
             System.out.println("Invalid position.");
         }
     }

     public void removeByTitle(String title) {
         Movie current = head;
         while (current != null) {
             if (current.title.equals(title)) {
                 if (current.prev != null) {
                     current.prev.next = current.next;
                 } else {
                     head = current.next;
                 }
                 if (current.next != null) {
                     current.next.prev = current.prev;
                 }
                 return;
             }
             current = current.next;
         }
         System.out.println("Movie not found.");
     }

     public void searchByDirector(String director) {
         Movie current = head;
         while (current != null) {
             if (current.director.equals(director)) {
                 System.out.println("Movie found: " + current.title);
             }
             current = current.next;
         }
     }

     public void searchByRating(double rating) {
         Movie current = head;
         while (current != null) {
             if (current.rating == rating) {
                 System.out.println("Movie found: " + current.title);
             }
             current = current.next;
         }
     }

     public void displayForward() {
         Movie current = head;
         while (current != null) {
             System.out.println("Title: " + current.title + ", Director: " + current.director +
                     ", Year: " + current.yearOfRelease + ", Rating: " + current.rating);
             current = current.next;
         }
     }

     public void displayReverse() {
         if (head == null) {
             return;
         }
         Movie current = head;
         // Move to the last node
         while (current.next != null) {
             current = current.next;
         }

         while (current != null) {
             System.out.println("Title: " + current.title + ", Director: " + current.director +
                     ", Year: " + current.yearOfRelease + ", Rating: " + current.rating);
             current = current.prev;
         }
     }

     public void updateRating(String title, double newRating) {
         Movie current = head;
         while (current != null) {
             if (current.title.equals(title)) {
                 current.rating = newRating;
                 System.out.println("Rating updated for: " + current.title);
                 return;
             }
             current = current.next;
         }
         System.out.println("Movie not found.");
     }
}
