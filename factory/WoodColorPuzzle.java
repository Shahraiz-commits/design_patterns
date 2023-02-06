package factory;
/*
 * Class responsible for managing the properties of the wood color puzzle
 * @author Shahraiz Aziz
 */
public class WoodColorPuzzle extends Puzzle{
    //Default constructor that sets puzzle properties 
    public WoodColorPuzzle(){
        name = "Color Puzzle by Melissa and Doug";
        material = "wood";
        pieces.add("Red fish");
        pieces.add("Yellow fish");
        pieces.add("Green fish");
        pieces.add("Purple fish");
        pieces.add("Pink fish");
        pieces.add("Orange fish");
        pieces.add("Brown fish");
        pieces.add("White fish");
        pieces.add("Black fish"); 
    }
}
