package iterator;

/*
 * Class responsible for creating and adding each song and creating instances of iterators
 * @author Shahraiz Aziz
 */
public class Album {
    private Song[] songs = new Song[20];
    private int count = 0;
    private String name;

    /* 
     * Assigns each album a name
     * @param name The name of the album
     */
    public Album(String name){
        this.name = name;
    }

    /*
     * Takes details for each song, creates the song and then adds it to the songs array
     * @return boolean stating whether a song was successfully added
     * @param name name of the song
     * @param artist name of the artist
     * @param length duration of the song
     * @param genre The song's genre
     */
    public boolean addSong(String name, String artist, double length, Genre genre){
        Song song = new Song(name, artist, length, genre);
        if(count == 20) return false;
        else{
            songs[count] = song;
            count++;
            return true;
        }
                
    }

    /*
     * Creates an instance of the iterator
     * @return instance of the iterator
     */
    public AlbumIterator createIterator(){
        return new AlbumIterator(songs);
    }

    /*
     * Displays album name
     * @return name of the album
     */
    public String getName(){
        return this.name;
    }
}
