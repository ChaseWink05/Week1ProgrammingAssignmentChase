public class Song {
    //These are the required variables as required
    private String title;

    private String artist;

    private double duration;
    /* This is my constructor, here I am passing the parameters with the variables
    * so that way no matter what title or artist or duration that is passed it
    * will always work since the conditions are the same, meaning the certain
    * variables that is required to make a "song"*/
    public Song(String title, String artist, double duration){
        this.title = title;
        this.artist = artist;
        this.duration = duration;

    }
    //Getters and Setters to intialize the variables which allows me to modify
    // the variables that make a song if need be in a way that won't cause the program to break
    public String getTitle() {

        return title;
    }

    public void setTitle(String title) {

        this.title = title;
    }
    public String getArtist() {

        return artist;
    }

    public void setArtist(String artist) {

        this.artist = artist;
    }
    public double getDuration() {

        return duration;
    }

    public void setDuration(double duration) {

        this.duration = duration;
    }


}
