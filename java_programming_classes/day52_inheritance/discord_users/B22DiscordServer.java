package java_programming_classes.day52_inheritance.discord_users;

public class B22DiscordServer {
    public static void main(String[] args) {
        User user1 = new User();
        user1.setName("Jamilya");
        user1.setRole("Teacher");
        user1.setId(12345);

        Admin admin1 = new Admin();
        admin1.setRole("Admin1");
        admin1.setName("Sonya");
        admin1.setId(8989);

        Admin admin2 = new Admin("Gulia", 1231);
        System.out.println(admin2.toString());


    }
}
