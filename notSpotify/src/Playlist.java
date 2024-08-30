import java.util.ArrayList;

public class Playlist {
    /*I have to add this variable to this class because I am going make
    * another constuctor later in this class with two parameters
    * because in the createPlaylist method in the User class it is being
    * created with 2 parameters therefore I need to add this variable for
    * the constructor with 2 parameters allowing me to create a playlist  */
    private String type;
    private String name;
    //Here I am declaring an ArrayList that can only store instances of the Song class
    //Which defines what exactly a Song is with the title, duration, and artist
    private ArrayList<Song> songs;
    public Playlist(String name) {
        this.name = name;
        this.songs = new ArrayList<>();
    }

    /*This constructor is to provide PopPlaylist and the other playlists with
    * a default constructor since when we extend to other classes the super, which
    * is the PlayList class cannot have a parameter in the constructor. With two
    * constructors we can extend to other classes and still instanciate the name
    * and songs*/
    public Playlist() {
        this.name = name;
        this.songs = new ArrayList<>();
    }
    /* Here is my constructor with 2 parameters. I need this constructor
    * like I said ealier because the createPlaylist method in the User class
    * takes two parameters and when we instiate the Playlist class in the User class
    * we need this construcor to allow us to create a playlist */
    public Playlist(String name, String type) {
        this.name = name;
        this.type = type;
    }
/* This method adds a song to the playlist. It does this by adding an object
* of the Song class that we already made. The parameter when calling the methodis carrying the song that
* the user would create so that's how it knows what song to add to the arraylist */
    public void addSong(Song song) {
        songs.add(song);
    }
    /* This method is the ideology in terms of how we know which song is being removed
    * However, this function simply removes the first instance where that song
    * appears in our arraylist*/

    public void removeSong(Song song) {
        songs.remove(song);
    }
    /* In this method to play all the songs in the Array I used the special for loop
    * for arrayLists that allows me to loop of the array. Then simple I printed out
    * the title of the artist, and the artist to act like the song is playing */

    public void playAllSongs() {
        for (Song song : songs) {
            System.out.println("Now Playing the next song " + song.getTitle() + " by the artist, " + song.getArtist());
        }
    }
//Getters and Setters to instiate the name of the songs
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public void setSongs(ArrayList<Song> songs) {
        this.songs = songs;
    }
}