import java.util.ArrayList;
public class User {
    private String username;
    /* Very similar to what we did in the Playlist class in which we are
    * creating an arraylist of that can only store instances of the
    * Playlist class so that we can make the differnt types of genres of
    * music that the user wants to listen to*/
    private ArrayList<Playlist> playlists;
    /*This is my constructor that will create an instiaciate the username
    * and the arraylist of called playlists so that we can use it later on*/

    public User(String username) {
        this.username = username;
        this.playlists = new ArrayList<>();
    }
/* This is my createPlaylist method that takes in parameters which are
* the name of the song and the type of genre of the song. I create an
* object that is called playlist which will have the name and genre of
* song and then I will add it to my arraylist of playlists which will have
* all the arrays the user has created.
* */
    public void createPlaylist(String name, String type) {
        Playlist playlist = new Playlist(name, type);
        playlists.add(playlist);
    }
    /* This method removes the specific playlist object that you are passing as
    * an arguement that we or the user would add. */

    public void deletePlaylist(Playlist playlist) {
        playlists.remove(playlist);
    }
//This method simply appends the song from the song class to the certain playlist that is
    //being passed through the arguement
    public void addSongToPlaylist(Playlist playlist, Song song) {
        playlist.addSong(song);
    }
//This does the same as the addSongToPlaylist method but it removes the song instead through the parameter
    public void removeSongFromPlaylist(Playlist playlist, Song song) {
        playlist.removeSong(song);
    }
}