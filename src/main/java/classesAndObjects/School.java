package classesAndObjects;

public class School {

    public static void main(String[] args) {

        Student object1 = new Student ();
        Student object2 = new Student ();

        object1.firstName = "Gulmira";
        object1.lastName = "Abdulakhat kyzy";
        object1.major = "Testing";
        object1.yearOfStudy = 2022;


        object2.lastName = "Nugumetova";
        object2.firstName = "Aidana";
        object2.major = "Testing";
        object2.age = 27;


        System.out.println(object1.firstName);
        System.out.println(object1.lastName);
        System.out.println(object1.major);
        System.out.println(object1.yearOfStudy);

        System.out.println(object2.firstName);
        System.out.println(object2.lastName);


        object1.reads();
        object1.writes();
        object1.visitClass();

        object2.writes();
        object2.reads();
        object2.visitClass();

        object1.isHomeworkDone();







    }
}
