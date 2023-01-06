package practice;

public class Platform {
    public static void main(String[] args) {
        YouTubeVideo video = new YouTubeVideo();
        System.out.println(video.views);
        video.watch();
        video.watch();
        video.watch();
        System.out.println(video.views);

        video.like();
        System.out.println(video.likes);

        video.comment("Helpfull video");
        video.comment("No, i do not like it");
        System.out.println(video.comments);

        video.makePrivate();
        System.out.println(video.isPrivate);


    }

}
