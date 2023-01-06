package classesAndObjects;

public class User {
    String username;
    String password;
    String email;
    String dateOfBirth;
    String gender;
    int phoneNumber;
    boolean isPrivate;
    int numOfFollowers;
    String lastMassage;


    /* method is functionality, action used to expose behavior of an object
   public - is access modifier
   private - is used for inside user
   static - this method can be used by all class members
   username, password = method parameters


     */
    public void login(String aidana_nugumetova, String pwd) {
        System.out.println(username + " logged in using password: " + password);


    }


    public int getNumberOfFollowers(String username) {

        return numOfFollowers;
    }

    public String getLastMassages(String username) {
        return lastMassage;
    }

    public boolean isPrivateAccount() {
        return isPrivate;

    }

    public String todaysDate() {
        return "30 November 2022";

    }

    public void likePost(String username, String post) {
        System.out.println(username + "liked " + post);


    }

    String Method1;

    public void beautifulMethod() {
        System.out.println(Method1 + "This is my first method ");

    }

    String nameOfMethod1 = "typeOfMethod";
    public String uglyMethod() {
        return "typeOfMethod";


    }

    public byte coolMethod() {
        byte c = 5;
        return c;

    }

    public short unit () {

        short u = 99;
        return  u;
    }
    public int numberOfMethod;

    public int getNumberOfMethod (){
        return numberOfMethod;

    }
    long nameOfLongMethod = 1234567;

    public long getVeryLongMethod() {
        return 1234567;
    }
    double answerOfMethod = 789.5;

    public double superMethod (){
        return 789.5;


    }

    float fur = 77.5f;

    public float furMethod (){
        return 77.5f;
    }
    char favouriteMethod = '5';
    public char myMethod (){
        return '5';

    }
    boolean isTrueMethod;

    public boolean myTrueMethod(){
        return isTrueMethod;



    }



}
