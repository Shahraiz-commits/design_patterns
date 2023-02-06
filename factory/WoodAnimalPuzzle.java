package factory;
/*
 * Class responsible for managing the properties of the wood animal puzzle
 * @author Shahraiz Aziz
 */
public class WoodAnimalPuzzle extends Puzzle{
    //Default constructor that sets puzzle properties 
    public WoodAnimalPuzzle(){
        name = "Animal Puzzle by Melissa and Doug";
        material = "wood";
        pieces.add("Horse");
        pieces.add("Sheep");
        pieces.add("Cat");
        pieces.add("Dog");
        pieces.add("Cow");
        pieces.add("Chicken");

        
    }
}
