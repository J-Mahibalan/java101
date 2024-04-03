package mahiapp;

import java.util.ArrayList;
import java.util.List;

public class FriendFinder {
    public static void main(String[] args) {
        List<FriendshipCriteria<String, String>> friends = new ArrayList<>();
        friends.add(new FriendshipCriteria<>("Goku", "Chennai"));
        friends.add(new FriendshipCriteria<>("Rishi", "Vadakku"));
        friends.add(new FriendshipCriteria<>("Shivaraman", "Veravadakku"));

        String targetLocation = "Veravadakku"; // Example: Find friends in this location

        for (FriendshipCriteria<String, String> friend : friends) {
            if (friend.getAttribute().equalsIgnoreCase(targetLocation)) {
                System.out.println(friend.getName() + " is a Vadakku.");
            }
        }
    }
}
