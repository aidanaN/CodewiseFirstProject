package constructors;

public class InstagramApp {
    public static void main(String[] args) {

        InstagramUser user1 = new InstagramUser("Aidana", "Amirkhan", "myPassword");
        user1.display();


        InstagramUser user2 = new InstagramUser("John Wick", "jw2022", "jw2022!", "actor");
        user2.display();

        InstagramUser user3 = new InstagramUser("Cristiano Ronaldo", "CR7", "dfsf","Football is life", "cr.com");
        user3.display();

        user3.visitProfile(user1);
        user1.isPrivate = true;





        }


    }

