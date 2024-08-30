//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Playlist myPlaylist = new Playlist("Country");
        User user = new User("Chase");

        Song mySong = new Song("Tight fittin jeans", "Conway Twitty", 3.45);
        Song mySong2 = new Song("American Way", "Hank Williams", 2.5);
        user.addSongToPlaylist(myPlaylist, mySong2);
        user.addSongToPlaylist(myPlaylist, mySong);
        myPlaylist.playAllSongs();

        System.out.println("Songs in " + myPlaylist.getName() + ":");
        for (Song song : myPlaylist.getSongs()) {
            System.out.println(song.getTitle() + " by " + song.getArtist() + " " + song.getDuration() + "min");
        }

        // Create a new Playlist
        Playlist myPlaylist2 = new Playlist("Rock");
        user.createPlaylist("Rock", "Rock");
        Song mySong3 = new Song("Future Days", "Pearl Jam", 3.45);
        Song mySong4 = new Song("Welcome to the Jungle", "AeroSmith", 2.5);
        user.addSongToPlaylist(myPlaylist2, mySong3);
        user.addSongToPlaylist(myPlaylist2, mySong4);
        System.out.println("Songs in " + myPlaylist2.getName() + ":");
        for (Song song : myPlaylist2.getSongs()) {
            System.out.println(song.getTitle() + " by " + song.getArtist() + " " + song.getDuration() + "min");
        }


        user.removeSongFromPlaylist(myPlaylist2, mySong3);


        System.out.println("Songs in " + myPlaylist2.getName() + ":");
        for (Song song : myPlaylist2.getSongs()) {
            System.out.println(song.getTitle() + " by " + song.getArtist()+ song.getDuration() + "min");
        }

    }
}