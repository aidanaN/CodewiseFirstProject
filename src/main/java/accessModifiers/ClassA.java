package accessModifiers;

public class ClassA {


       public  String name = "John Doe";
        private int age = 32;



       private boolean isOld = false;

      public void sayHi(){
           System.out.println("hi");

    }
    public void sayBye(){
        System.out.println("bye");

    }

    protected String city = "Washington";


      protected void sayHello(){
          System.out.println("hello");
      }

    public static void main(String[] args) {
        ClassA obj = new ClassA();
        obj.sayBye();
        System.out.println(obj.age);
    }

    /*
    create 2 private veriables, 1 private method
    create 2 default variables, 1 default method
    create 2 protected veriables, 1 protected method
    in class#2


     */
}
