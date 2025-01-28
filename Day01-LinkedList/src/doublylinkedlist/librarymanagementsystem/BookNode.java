package doublylinkedlist.librarymanagementsystem;

 class BookNode {
    String title, author, genre;
    int bookID;
    boolean isAvailable;
    BookNode next, prev;

    public BookNode(String title, String author, String genre, int bookID, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.bookID = bookID;
        this.isAvailable = isAvailable;
        this.next = null;
        this.prev = null;
    }
}
