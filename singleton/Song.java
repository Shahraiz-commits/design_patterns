package singleton;

/*
 * Class responsible for initializing each song
 * @author Shahraiz Aziz
 */
public class Song {
    private String title;
    private String artist;

    /*
     * Takes in the required properties of each song and assigns it to the current instance of the song
     * @param title The title of the song
     * @param artist The artist for the song
     */
    public Song(String title, String artist){
        this.title = title;
        this.artist = artist;
    }

    /*
     * Responsible for returning a string that states the properties of each song
     * @return A string representation of the song's properties
     */
    public String toString(){
        return(title + " by " + artist);
    }
}
