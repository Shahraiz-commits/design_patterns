package factory;
/*
 * Class reponsible for creating an instance of wood puzzles
 * @author ShahraIz Aziz
 */
public class MelissaAndDougStore extends ToyStore {
    /*
     * Class that creates an instance of a puzzle according to the needed type
     * @param type A string stating the type of puzzle to be created
     */
    public Puzzle createPuzzle(String type){
        if(type.equalsIgnoreCase("color")){
            WoodColorPuzzle puzzle;
            return puzzle = new WoodColorPuzzle();
        } else if(type.equalsIgnoreCase("animal")){
            WoodAnimalPuzzle puzzle;
            return puzzle = new WoodAnimalPuzzle();
        } else return null;
    }

}