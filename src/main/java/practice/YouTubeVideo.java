package practice;

public class YouTubeVideo {

    /*
   instance variables
     */
    /* Pseudo code:
        a. Method signature: void, watch, method parameters -> no parameters;
        b. add 1 to current views
     */

    String title;
    String comments;
    int views;
    int likes;
    boolean isPrivate;

    public void watch() {
        views++; // views = views + 1;

    }
    public void like(){
        likes++;

    }
    public void comment (String newComment){
        comments = comments + "\n" + newComment;

    }


    public void makePrivate() {
        isPrivate = true;

    }





}

