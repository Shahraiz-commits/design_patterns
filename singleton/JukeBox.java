package singleton;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/*
 * Class that manages playlist functionalities
 * @author Shahraiz Aziz
 */
public class JukeBox {
    private static JukeBox jukeBox;
    private ArrayList<Song> songs = new ArrayList<Song>();
    private Queue<String> songQueue = new LinkedList<String>();
    
    /*
     * Default constructor that initializes songs array list
     */
    private JukeBox(){
        songs = DataLoader.getSongs();
    }

    /*
     * Ensures only one instance of JukeBox is ever created
     * @return An instance of a JukeBox
     */
    public static JukeBox getInstance(){
       if(jukeBox == null) jukeBox = new JukeBox();
       return jukeBox;
    }

    /*
     * Dequeues a song from the Queue of songs and notifies the user that it is being played
     * @return A string stating that the song is being played or that the queue is empty
     */
    public String playNextSong(){
        if(hasMoreSongs()){
            String song = songQueue.remove();
            return("Let's jam to "+ song);
        }
        return("You need to add songs to the list");
    }

    /*
     * Determines if a requested song is available to be placed into the queue of songs
     * @return A string stating that a song has been added to the queue or that the song was not found
     */
    public String requestSong(String title){
        for(int i=0; i<songs.size(); i++){
            String val = songs.get(i).toString();
            if(val.toLowerCase().contains(title.toLowerCase())){
                songQueue.add(val);
                return(title + " is now number " + songQueue.size() + " on the list");
            }
             
        }
        return("Sorry we do not have the song " + title);
    }

    /*
     * Determines if the songs queue is empty or not
     * @return A boolean value stating whether the queue has additional elements
     */
    public boolean hasMoreSongs(){
        if(songQueue.isEmpty()) return false;
        return true;
    }
}
