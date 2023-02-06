package factory;
/*
 * Class reponsible for creating an instance of plastic puzzles
 * @author ShahraIz Aziz
 */
public class FisherPriceStore extends ToyStore {
     /*
     * Class that creates an instance of a puzzle according to the needed type
     * @param type A string stating the type of puzzle to be created
     */
    public Puzzle createPuzzle(String type){
        if(type.equalsIgnoreCase("color")){
            PlasticColorPuzzle puzzle;
            return puzzle = new PlasticColorPuzzle();
        } else if(type.equalsIgnoreCase("animal")){
            PlasticAnimalPuzzle puzzle;
            return puzzle = new PlasticAnimalPuzzle();
        } else return null;
    }

}