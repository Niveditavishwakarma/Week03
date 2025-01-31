package hashmapproblems.custommap;
import java.util.LinkedList;
public class Hashmap {
    static class Node {
        String key;
        int value;

        Node(String key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private LinkedList<Node>[] table;
    private int size;

    public Hashmap(int size) {
        this.size = size;
        table = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            table[i] = new LinkedList<>();
        }
    }

    private int hash(String key) {
        return Math.abs(key.hashCode()) % size;
    }

    public void insert(String key, int value) {
        int index = hash(key);
        LinkedList<Node> list = table[index];


        for (Node node : list) {
            if (node.key.equals(key)) {
                node.value = value;
                return;
            }
        }

        list.add(new Node(key, value));
    }

    public Integer retrieve(String key) {
        int index = hash(key);
        LinkedList<Node> list = table[index];

        for (Node node : list) {
            if (node.key.equals(key)) {
                return node.value;
            }
        }
        return null;
    }

    // Delete the key-value pair
    public boolean delete(String key) {
        int index = hash(key);
        LinkedList<Node> list = table[index];

        for (Node node : list) {
            if (node.key.equals(key)) {
                list.remove(node);
                return true;
            }
        }
        return false;
    }

    public void printAll() {
        for (int i = 0; i < size; i++) {
            LinkedList<Node> list = table[i];
            for (Node node : list) {
                System.out.println(node.key + ": " + node.value);
            }
        }

    }
}


