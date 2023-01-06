package classesAndObjects;

public class Student {

    String firstName;
    String lastName;
    String email;
    String major;

    byte age;
    short yearOfStudy;

    // method is action, verb (to do something)

    public void reads (){
        System.out.println(firstName + " " + lastName + " is reading ");


    }

    public void writes () {
        System.out.println(firstName + " " + lastName + " is writing");

    }

    public void visitClass () {
        System.out.println( firstName + " " + lastName + " is visiting " + major);


        }

    public boolean isHomeworkDone(){
        System.out.println(firstName + " " + lastName + " completed homework") ;
        return true;



    }


}
