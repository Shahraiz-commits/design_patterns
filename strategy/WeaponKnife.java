/**
 * A weapon called "Knife" to be used by the "Queen" character
 * @author Shahraiz Aziz
 */
import java.util.Random;

public class WeaponKnife implements WeaponBehavior {

    /**
     * Randomly picks an integer from 0 - 2 and uses the value to pick an attack for the character
     * @return The string representation of a randomly picked attack from a pool of three attacks
     */
    public String attack() {
        Random r = new Random();
        int num = r.nextInt(3);
        if (num == 0){
            return("Slice with knife");
        } else if (num == 1){
            return("Jab with a knife");
        } else{
            return("Sneak up on opponent with knife");
        }

    }
    
}