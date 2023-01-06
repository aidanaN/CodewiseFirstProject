package constructors;

public class Face {

    //Create instance variables
    // forget about main method
    String skinColor;
    String eyeColor;
    String noseSize;
    String shape;

    public void happy (){
        System.out.println("Happy Face!");
    }
    public void sad () {
        System.out.println("Sad Face!");
    }
    public void smile(){
        System.out.println("Smiling Face!");
    }
    public void displayFace(){
        System.out.println("Face information");
        System.out.println("Skin color: " + skinColor);
        System.out.println("Eye color: " + eyeColor);
        System.out.println("Nose size: " + noseSize);
        System.out.println("Shape of face: " + shape);
        System.out.println();
    }
// difference between class and objects
    // Class is blueprint of the object;






}
