package singlylinkedlist.socialmedia;
import java.util.ArrayList;
import java.util.List;
 class UserList {
     User head;

     public void addUser(int userId, String name, int age) {
         User newUser = new User(userId, name, age);
         if (head == null) {
             head = newUser;
         } else {
             User temp = head;
             while (temp != null) {
                 if (temp.userId == userId) {
                     System.out.println("User already exists.");
                     return;
                 }
                 if (temp.next == null) {
                     temp.next = newUser;
                     return;
                 }
                 temp = temp.next;
             }
         }
     }

     public User findUserById(int userId) {
         User temp = head;
         while (temp != null) {
             if (temp.userId == userId) {
                 return temp;
             }
             temp = temp.next;
         }
         return null;
     }

     public User findUserByName(String name) {
         User temp = head;
         while (temp != null) {
             if (temp.name.equals(name)) {
                 return temp;
             }
             temp = temp.next;
         }
         return null;
     }

     public void addFriendConnection(int userId1, int userId2) {
         User user1 = findUserById(userId1);
         User user2 = findUserById(userId2);

         if (user1 != null && user2 != null) {
             user1.addFriend(userId2);
             user2.addFriend(userId1);
         } else {
             System.out.println("One or both users not found.");
         }
     }

     public void removeFriendConnection(int userId1, int userId2) {
         User user1 = findUserById(userId1);
         User user2 = findUserById(userId2);

         if (user1 != null && user2 != null) {
             user1.removeFriend(userId2);
             user2.removeFriend(userId1);
         } else {
             System.out.println("One or both users not found.");
         }
     }

     public void findMutualFriends(int userId1, int userId2) {
         User user1 = findUserById(userId1);
         User user2 = findUserById(userId2);

         if (user1 != null && user2 != null) {
             List<Integer> mutualFriends = new ArrayList<>();
             for (int friendId1 : user1.friends) {
                 if (user2.friends.contains(friendId1)) {
                     mutualFriends.add(friendId1);
                 }
             }
             if (mutualFriends.isEmpty()) {
                 System.out.println("No mutual friends found.");
             } else {
                 System.out.print("Mutual friends: ");
                 for (int friendId : mutualFriends) {
                     System.out.print(friendId + " ");
                 }
                 System.out.println();
             }
         } else {
             System.out.println("One or both users not found.");
         }
     }

     public void displayUserFriends(int userId) {
         User user = findUserById(userId);
         if (user != null) {
             user.displayFriends();
         } else {
             System.out.println("User not found.");
         }
     }

     public void countUserFriends(int userId) {
         User user = findUserById(userId);
         if (user != null) {
             System.out.println(user.name + " has " + user.countFriends() + " friends.");
         } else {
             System.out.println("User not found.");
         }
     }
 }


