package constructors;

public class InstagramUser {

    String name;
    String username;
    String password;
    String bio;
    String link;
    boolean isPrivate;


    public InstagramUser (String name, String username, String password){
        this.name =name;
        this.username = username;
        this.password = password;
        this.link = "www.instagram.com";
        this.isPrivate = false;
        this.bio = "Love wins";


    }
    public InstagramUser (String name, String username, String password, String bio){
       this(name, username, password);
       this.bio = bio;


    }
    public InstagramUser (String name, String username, String password, String bio, String link){
        this(name, username,password,bio);
        this.link = link;
    }

    public void display (){
        System.out.println("User details");
        System.out.println("Name "+ this.name);
        System.out.println("Username: " + this.name);
        System.out.println("Password: " + this.password);
        System.out.println("Bio: " + this.bio);
        System.out.println("Link: " + this.link);
        System.out.println("Is private: " + isPrivate);
        System.out.println();


    }
    public void postStory (String message){
        System.out.println(this.name + " just posted a story" + message);

    }
    public void visitProfile (InstagramUser user) {
        if (user.isPrivate == true){
        System.out.println("The user is private.Can't display profile details");
    }
    else {
        System.out.println("Profile visit success.");
        System.out.println("Visited profile:" + user.name);
    }


    }




}
