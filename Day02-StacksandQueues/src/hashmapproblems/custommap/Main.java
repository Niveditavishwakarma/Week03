package hashmapproblems.custommap;

public class Main {
    public static void main(String[] args) {

        Hashmap hashMap = new Hashmap(10);

        hashMap.insert("apple", 100);
        hashMap.insert("banana", 200);
        hashMap.insert("orange", 300);

        System.out.println("Retrieve apple: " + hashMap.retrieve("apple"));
        System.out.println("Retrieve banana: " + hashMap.retrieve("banana"));

        hashMap.delete("apple");
        System.out.println("Retrieve apple after deletion: " + hashMap.retrieve("apple"));

        System.out.println("HashMap contents:");
        hashMap.printAll();
    }
}
