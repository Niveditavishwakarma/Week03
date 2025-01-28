package singlylinkedlist.socialmedia;

public class Main {
    public static void main(String[] args) {
        UserList userList = new UserList();

        userList.addUser(1, "John", 25);
        userList.addUser(2, "Alice", 22);
        userList.addUser(3, "Bob", 28);

        userList.addFriendConnection(1, 2);
        userList.addFriendConnection(1, 3);

        userList.displayUserFriends(1);

        userList.countUserFriends(1);

        userList.removeFriendConnection(1, 2);
        userList.displayUserFriends(1);

        userList.findMutualFriends(1, 2);
        userList.findMutualFriends(1, 3);
    }
}
