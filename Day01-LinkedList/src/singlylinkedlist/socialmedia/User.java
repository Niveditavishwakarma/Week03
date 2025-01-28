package singlylinkedlist.socialmedia;
import java.util.ArrayList;
import java.util.List;
class User {
    int userId;
    String name;
    int age;
    List<Integer> friends;
    User next = null;

    public User(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friends = new ArrayList<>();
    }

    public void addFriend(int friendId) {
        if (!friends.contains(friendId)) {
            friends.add(friendId);
        }
    }

    public void removeFriend(int friendId) {
        friends.remove(Integer.valueOf(friendId));
    }

    public void displayFriends() {
        if (friends.isEmpty()) {
            System.out.println(name + " has no friends.");
        } else {
            System.out.print(name + "'s friends: ");
            for (int friendId : friends) {
                System.out.print(friendId + " ");
            }
            System.out.println();
        }
    }

    public int countFriends() {
        return friends.size();
    }
}
