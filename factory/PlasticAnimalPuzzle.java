package factory;
/*
 * Class responsible for managing the properties of the plastic animal puzzle
 * @author Shahraiz Aziz
 */
public class PlasticAnimalPuzzle extends Puzzle {
    //Default constructor that sets puzzle properties 
    public PlasticAnimalPuzzle(){
        name = "Animal Puzzle by Fisher Price";
        material = "plastic";
        pieces.add("fox");
        pieces.add("elephant");
        pieces.add("Giraffe");
        pieces.add("Owl");
        pieces.add("Monkey");
    }
}
