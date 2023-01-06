package constructors;

public class Software {

    public static void main(String[] args) {

        Face face1 = new Face();
        Face face2 = new Face();
        Face face3 = new Face();

        face1.skinColor = "red";
        face1.shape = "oval";
        face1.noseSize = "medium";
        face1.eyeColor = "brown";

        face1.displayFace();
        face2.displayFace();
        face3.displayFace();

    }
}
