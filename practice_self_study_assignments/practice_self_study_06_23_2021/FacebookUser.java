package practice_self_study_assignments.practice_self_study_06_23_2021;

import java.util.ArrayList;

public class FacebookUser extends SocialMediaTask{
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumberOfFriends() {
        return numberOfFriends;
    }

    public void setNumberOfFriends(int numberOfFriends) {
        this.numberOfFriends = numberOfFriends;
    }

    public ArrayList<String> getPosts() {
        return posts;
    }

    public void setPosts(ArrayList<String> posts) {
        this.posts = posts;
    }

    public String getPersonalURL() {
        return personalURL;
    }

    public void setPersonalURL(String personalURL) {
        this.personalURL = personalURL;
    }

    //•Create a class for a facebook user which inherits the Social Media class and has additional instance variables: username, password, full name, age, number of friends, and posts (ArrayList of Post)
    // •Encapsulate all the variables.
    private String username;
    private String password;
    private String fullName;
    private int age;
    private int numberOfFriends;
    private ArrayList<String> posts;
   // private String personalURL;
    //•Set the platform for "Facebook" using static block
    static {
        platform="Facebook";
    }
    //•Create a constructor that will create aFacebook user by taking username and password.
    // -If the password contains the username then it is not a valid password and should not be saved.
    // In this case Print “Password contained username.
    // Default password created: ‘password’” and set the password for the user to the default value.
    // -Create and assign the user's person url by using 'facebook.com/' and adding their username
    // -Create an empty ArrayList of Posts
    public FacebookUser(String username, String password){
        if(password.contains(username)){
            System.out.println("Password contain username. Default password created: 'password'.");
            setPassword("password");
        }else{
            this.password=password;
        }
        setPersonalURL("https://facebook.com/"+username);
        setPosts(new ArrayList<>());
    }
    //•Overload the constructor to accept username, password, and the user’s name.
    // -If the name entered has any characters that are not letters from the alphabet, then the name is invalid.
    // In this case print “invalid name” and assign the name value to be ‘no name’
    public FacebookUser(String username, String password, String fullName){
        setFullName(fullName);
        for (int i = 0; i < fullName.length(); i++) {

            if(!Character.isLetter(fullName.charAt(i))){
                System.out.println("invalid name");
                setFullName("no name");
                break;
            }

        }
    }
    //•Overload the constructor to accept username, password, the user’s name, age and number of friends.
    // -Only store the age and number of friends into the variables if they are valid numbers.
    // The age cannot be a negative number and the number of friends cannot be negative or more than 5000.
    // If they are invalid print “Invalid (age/number of friends) and keep the values as the default of 0.
    public FacebookUser(String username, String password, String fullName, int age, int numberOfFriends){
        if(age>=0){
            setAge(age);
        }else{
            setAge(0);
            System.out.println("Invalid age");
        }
        if(numberOfFriends>=0 && numberOfFriends<=5000){
            setNumberOfFriends(numberOfFriends);
        }else{
            setNumberOfFriends(0);
            System.out.println("Invalid number of friends");
        }
    }
    //•Implement all methods coming from Social Media class

    //oDirect messaging(String username, String message)
    // -print =message sent to username
    @Override
    public void directMessaging(String username, String message) {
        System.out.println(message +" sent to "+username);
    }
//oPost(String body)
// -Should be added to theArrayList of Posts of the user
    @Override
    public void post(String body) {
        posts.add(body);
    }
//Notifications()
// -Checks the current time.
// If the time is between 8 am -5 pm print "Notification", otherwise print "Sleep mode"
    @Override
    public void notifications() {

    }


}
 