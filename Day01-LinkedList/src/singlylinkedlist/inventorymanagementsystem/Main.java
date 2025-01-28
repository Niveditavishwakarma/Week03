package singlylinkedlist.inventorymanagementsystem;

public class Main {
        public static void main(String[] args) {
            InventoryManagement inventory = new InventoryManagement();

            inventory.addAtBeginning("Laptop", 101, 50, 700.00);
            inventory.addAtEnd("Smartphone", 102, 150, 300.00);
            inventory.addAtPosition(2, "Headphones", 103, 200, 50.00);

            System.out.println("All Items in Inventory:");
            inventory.displayAllItems();

            System.out.println("\nSearch for Item by Name:");
            inventory.searchItem("Laptop");

            System.out.println("\nSearch for Item by ID:");
            inventory.searchItem("102");

            System.out.println("\nUpdate Quantity of Item with ID 103:");
            inventory.updateQuantityById(103,300);

            System.out.println("\nRemove Item with ID 102:");
            inventory.removeItemById(102);
            System.out.println();

            inventory.displayTotalInventoryValue();
            inventory.displayAllItems();
        }
    }


