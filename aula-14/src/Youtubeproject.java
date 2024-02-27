public class Youtubeproject {
    public static void main(String[] args) throws Exception {
        
        Video v[] = new Video[3];

        v[0] = new Video("First impression");
        v[1] = new Video("Second");
        v[2] = new Video("third impression");

        Viewer viewer[] = new Viewer[2];

        viewer[0] = new Viewer("Hideki",18,"M","hedeki123");
        viewer[1] = new Viewer("Toranaga",45,"M","sengoku");

        System.out.println(viewer[1].toString());

        
        System.out.println(v[0].getLikes());
    }
}
