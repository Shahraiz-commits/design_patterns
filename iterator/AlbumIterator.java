package iterator;
import java.util.Iterator;

/*
 * Class responsible for iterating through the song array
 * @author Shahraiz Aziz
 */
public class AlbumIterator implements Iterator{
    private Song[] song;
    private int position = 0;

    /*
     * Accepts an array of songs to use for iteration
     * @param songs An instance of an array containing songs
     */
    public AlbumIterator(Song[] songs){
        this.song = songs;
    }

    /*
     * Checks whether the next element can be iterated to
     * @return boolean that states whether the array has another element to iterate to
     */
    public boolean hasNext(){
        return song[position] != null && position < song.length;
    }

    /*
     * Iterates to the next song 
     * @return An instance of a song
     */
    public Song next(){
        if(!hasNext()) return null;
        Song currentSong = song[position];
        position++;
        return currentSong;
    }
}