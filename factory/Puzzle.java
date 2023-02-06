package factory;
import java.util.ArrayList;
/*
 * Class that manages properties of puzzles using children classes
 * @author Shahraiz Aziz
 */
public abstract class Puzzle {
    protected String name;
    protected String material;
    protected ArrayList<String> pieces = new ArrayList<>();  
    
    /*
     * Returns a description of the way a puzzle is assembled
     * @return String description of the current puzzle
     */
    public String assemble(){
        String str = formatter();
        return("putting together a "+ name + "\nThis puzzle is made out of "+ material +
        "\nAdding the following pieces:\n" + str);
    }

    /*
     * Formats the elements in the arraylist so that they are outputted as a list
     * @return formatted string
     */
    private String formatter(){
        String str = "";
        for(int i=0; i<pieces.size(); i++){
            str = str + "\n- " + pieces.get(i);
        }
        return str;
    }

    /*
     * Tells the user that a puzzle is being packed
     * @return String stating that a puzzle is being packed
     */
    public String boxPuzzle(){
        return("\nPutting the "+ name + " in a box");
    }

}
