package factory;
/*Class responsible for creating puzzles
 *@author Shahraiz Aziz 
 */
public abstract class ToyStore{
    protected String orderPuzzle(String type){
        Puzzle puzzle = createPuzzle(type);
        return(puzzle.assemble() + puzzle.boxPuzzle());
    }

    protected abstract Puzzle createPuzzle(String type);
}