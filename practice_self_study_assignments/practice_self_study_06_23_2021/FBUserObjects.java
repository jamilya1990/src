package practice_self_study_assignments.practice_self_study_06_23_2021;

public class FBUserObjects {
    public static void main(String[] args) {
        FacebookUser user1 = new FacebookUser("jamilya", "jamilya123");
        System.out.println(user1);

        FacebookUser user2 = new FacebookUser("adam123", "321989238", "Adam James", 12, 4000);
        System.out.println(user2);

        user1.sendFriendRequest(user2);

        System.out.println(user2);

        user1.post("This is my first post");
        user1.post("2nd post");

        System.out.println(user1.getAllPosts().toString());
    }
}
