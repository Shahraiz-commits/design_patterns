package factory;
/*
 * Class responsible for managing the properties of the plastic color puzzle
 * @author Shahraiz Aziz
 */
public class PlasticColorPuzzle extends Puzzle{
    //Default constructor that sets puzzle properties 
    public PlasticColorPuzzle(){
        name = "Color Puzzle by Fisher Price";
        material = "plastic";
        pieces.add("Green Dog");
        pieces.add("Orange Dog");
        pieces.add("Blue Dog");
        pieces.add("Red Dog");
        pieces.add("Yellow Dog");
        pieces.add("Brown Dog");
    }
}