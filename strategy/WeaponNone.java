/**
 * Implementation of a weapon behavior that causes a character to lose their weapon
 * @author Shahraiz Aziz
 */
import java.util.Random;

public class WeaponNone  implements WeaponBehavior{

    /**
     * Randomly picks an integer from 0 - 1 and uses the value to pick a character dialogue from a pool of two choices
     * @return A string indicating that the character has lost their weapon
     */
    public String attack(){
        Random r = new Random();
        int num = r.nextInt(2);
        if (num == 0){
            return ("Oh no! I lost my weapon");
        } else {
            return("No one let's me have a weapon");
        }

    }
    
}