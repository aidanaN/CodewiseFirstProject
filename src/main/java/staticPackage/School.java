package staticPackage;

import mentoring.Codewise;

public class School {
    public static void main(String[] args) {

        Teacher teacher1 = new Teacher();
        Teacher teacher2 = new Teacher();
        Teacher teacher3 = new Teacher();
        Teacher teacher4 = new Teacher();

        teacher1.name = "Nickola Tesla";
        teacher1.hasDegree = true;
        teacher1.age = 45;
        teacher1.salary = 4900;
        teacher1.workplace = "Codewise";

        Teacher.workplace = "Columbian";



        teacher2.name = "Albert Einstein";
        teacher2.hasDegree = false;
//        teacher2.age = 56;
//        teacher2.salary = 4500;




        System.out.println(teacher1.name);
        System.out.println(teacher1.age);
        System.out.println(teacher2.age);
        System.out.println(teacher2.workplace); //Codewise
        System.out.println(teacher1.city);

        teacher2.workplace = "Harvard";
        System.out.println(teacher1.workplace); // Harvard

        Teacher.city = "NY";
        Teacher.year = 2022;

        System.out.println(Teacher.city);








    }







}
