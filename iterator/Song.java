package iterator;

/*
 * Class responsible for setting details for each song
 * @author Shahraiz Aziz
 */
public class Song {
    private String name;
    private String artist;
    private double length;
    private Genre genre;

    /*
     * Class that assigns the properties of each song
     * @param name name of the song
     * @param artist Name of the artist
     * @param length duration of the song
     * @param genre The song's genre
     */
    public Song(String name, String artist, double length, Genre genre){
        this.name = name;
        this.artist = artist;
        this.length = length;
        this.genre = genre;
    }

    /*
     * Displays each song along with its details
     * @return A string representation of each song and it's properties
     */
    public String toString(){
        return(name+" by "+artist+" category: "+genre+" length: "+length+" min");
    }
}
