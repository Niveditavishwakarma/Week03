package doublylinkedlist.librarymanagementsystem;

 class LibraryManagement {
     private BookNode head, tail;
     private int count;

     public LibraryManagement() {
         head = null;
         tail = null;
         count = 0;
     }

     public void addBook(String title, String author, String genre, int bookID, boolean isAvailable, int position) {
         BookNode newBook = new BookNode(title, author, genre, bookID, isAvailable);
         if (position <= 0 || head == null) {
             newBook.next = head;
             if (head != null) head.prev = newBook;
             head = newBook;
             if (tail == null) tail = head;
         }
         else if (position >= count) {
             newBook.prev = tail;
             if (tail != null) tail.next = newBook;
             tail = newBook;
             if (head == null) head = tail;
         }
         else {
             BookNode current = head;
             for (int i = 0; i < position - 1; i++) {
                 current = current.next;
             }
             newBook.next = current.next;
             newBook.prev = current;
             if (current.next != null) current.next.prev = newBook;
             current.next = newBook;
         }
         count++;
     }

     public void removeBook(int bookID) {
         BookNode current = head;
         while (current != null) {
             if (current.bookID == bookID) {
                 if (current.prev != null) current.prev.next = current.next;
                 if (current.next != null) current.next.prev = current.prev;
                 if (current == head) head = current.next;
                 if (current == tail) tail = current.prev;
                 count--;
                 return;
             }
             current = current.next;
         }
         System.out.println("Book with ID " + bookID + " not found.");
     }

     public void searchBook(String query) {
         BookNode current = head;
         boolean found = false;
         while (current != null) {
             if (current.title.equalsIgnoreCase(query) || current.author.equalsIgnoreCase(query)) {
                 System.out.println("Found Book: [Title: " + current.title + ", Author: " + current.author + ", Genre: " + current.genre + ", ID: " + current.bookID + ", Available: " + current.isAvailable + "]");
                 found = true;
             }
             current = current.next;
         }
         if (!found) System.out.println("No book found with the query: " + query);
     }

     public void updateAvailability(int bookID, boolean status) {
         BookNode current = head;
         while (current != null) {
             if (current.bookID == bookID) {
                 current.isAvailable = status;
                 System.out.println("Availability status updated for Book ID: " + bookID);
                 return;
             }
             current = current.next;
         }
         System.out.println("Book with ID " + bookID + " not found.");
     }

     public void displayBooksForward() {
         BookNode current = head;
         while (current != null) {
             System.out.println("[Title: " + current.title + ", Author: " + current.author + ", Genre: " + current.genre + ", ID: " + current.bookID + ", Available: " + current.isAvailable + "]");
             current = current.next;
         }
     }

     public void displayBooksReverse() {
         BookNode current = tail;
         while (current != null) {
             System.out.println("[Title: " + current.title + ", Author: " + current.author + ", Genre: " + current.genre + ", ID: " + current.bookID + ", Available: " + current.isAvailable + "]");
             current = current.prev;
         }
     }

     public int countBooks() {
         return count;
     }
}
