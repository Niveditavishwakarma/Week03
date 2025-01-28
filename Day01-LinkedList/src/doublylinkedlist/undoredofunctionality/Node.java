package doublylinkedlist.undoredofunctionality;

 class Node {
     String text;
     Node next;
     Node prev;

     public Node(String text) {
         this.text = text;
         this.next = null;
         this.prev = null;
     }
}
