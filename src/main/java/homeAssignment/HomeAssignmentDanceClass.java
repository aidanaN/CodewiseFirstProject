package homeAssignment;

public class HomeAssignmentDanceClass {

    public static void main(String[] args) {

        Dancer dancer1 = new Dancer();
        Dancer dancer2 = new Dancer();

        dancer1.name = "Sammy";
        dancer1.style = "TikTok";
        dancer1.hasDanceSkills = true;

        dancer2.name = "David";
        dancer2.style = "Break-Dance";
        dancer2.hasDanceSkills = false;

        dancer1.hasFreeTime = true;
        dancer1.looksBad = true;
        dancer1.recordsTikTok(true);
        dancer1.notDancing(dancer1.looksBad);

        dancer2.hasFreeTime = false;
        dancer2.hasDesire = false;
        dancer2.goesToDanceCompetitions(false, false);


        System.out.println(dancer1.name + "s score: " + dancer1.rating);
        System.out.println(dancer2.name + "s score: " + dancer2.rating);

        if (dancer1.rating > dancer2.rating) {
            System.out.println(dancer1.name + " is the best dancer!");
        } else if (dancer1.rating > dancer2.rating) {
            System.out.println(dancer1.name + " is the best dancer!");
        } else {
            System.out.println("Ratings are equal. Both are good dancers!");
        }
    }}

        class Dancer {

            String name;
            String style;
            int age;
            boolean hasDanceSkills;
            boolean hasFreeTime;
            boolean looksBad;
            int rating = 0;
            boolean hasDesire;

            public void recordsTikTok(boolean hasFreeTime) {
                if (hasFreeTime) {
                    System.out.println(name + " records Tik-Tok when has time.");
                    rating++;
                } else {
                    System.out.println(name + " has less follower when does not post videos.");
                    rating--;
                }
            }
            public void notDancing(boolean looksBad) {
                if (looksBad){
                    System.out.println(name + " is not dancing when looking bad, but still posting some content");
                    rating += 1;
                    hasDanceSkills = true;
                } else {
                    System.out.println(name + " is not dancing on that days.");
                    rating --;
                    hasDanceSkills = false;
                }

            }
            public void goesToDanceCompetitions(boolean hasFreeTime, boolean hasDesire) {
                if (hasFreeTime  && hasDesire){
                    System.out.println(name + " is wins all competitions. ");
                    rating += 2;
                } else  {
                    System.out.println(name + " is not participating in any competitions.");
                    rating --;
                }

            }


        }















