package singlylinkedlist.inventorymanagementsystem;

class InventoryManagement {
    private Item head;

    public InventoryManagement() {
        this.head = null;
    }

    public void addAtBeginning(String itemName, int itemId, int quantity, double price) {
        Item newItem = new Item(itemName, itemId, quantity, price);
        newItem.next = head;
        head = newItem;
    }

    public void addAtEnd(String itemName, int itemId, int quantity, double price) {
        Item newItem = new Item(itemName, itemId, quantity, price);
        if (head == null) {
            head = newItem;
        } else {
            Item temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newItem;
        }
    }

    public void addAtPosition(int position, String itemName, int itemId, int quantity, double price) {
        if (position == 1) {
            addAtBeginning(itemName, itemId, quantity, price);
            return;
        }

        Item newItem = new Item(itemName, itemId, quantity, price);
        Item temp = head;
        int count = 1;

        while (count < position - 1 && temp != null) {
            temp = temp.next;
            count++;
        }

        if (temp != null) {
            newItem.next = temp.next;
            temp.next = newItem;
        } else {
            System.out.println("Position out of range.");
        }
    }

    public void removeItemById(int itemId) {
        if (head == null) {
            System.out.println("The inventory is empty.");
            return;
        }

        if (head.itemId == itemId) {
            head = head.next;
            System.out.println("Item with ID " + itemId + " removed.");
            return;
        }

        Item temp = head;
        while (temp.next != null && temp.next.itemId != itemId) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
            System.out.println("Item with ID " + itemId + " removed.");
        } else {
            System.out.println("Item with ID " + itemId + " not found.");
        }
    }

    public void updateQuantityById(int itemId, int newQuantity) {
        Item temp = head;
        while (temp != null) {
            if (temp.itemId == itemId) {
                temp.quantity = newQuantity;
                System.out.println("Item with ID " + itemId + " updated with new quantity: " + newQuantity);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item with ID " + itemId + " not found.");
    }

    public void searchItem(String searchTerm) {
        Item temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.itemName.equals(searchTerm) || Integer.toString(temp.itemId).equals(searchTerm)) {
                System.out.println("Item Found: Name=" + temp.itemName + ", ID=" + temp.itemId +
                        ", Quantity=" + temp.quantity + ", Price=" + temp.price);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("Item not found.");
        }
    }

    public void displayTotalInventoryValue() {
        if (head == null) {
            System.out.println("The inventory is empty.");
            return;
        }

        double totalValue = 0;
        Item temp = head;

        while (temp != null) {
            totalValue += temp.quantity * temp.price;
            temp = temp.next;
        }

        System.out.println("Total Inventory Value: " + totalValue);
    }

    public void displayAllItems() {
        if (head == null) {
            System.out.println("The inventory is empty.");
            return;
        }

        Item temp = head;
        while (temp != null) {
            System.out.println("Item Name: " + temp.itemName + ", ID: " + temp.itemId +
                    ", Quantity: " + temp.quantity + ", Price: " + temp.price);
            temp = temp.next;
        }
    }
}





