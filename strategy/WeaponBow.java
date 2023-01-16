/**
 * A weapon called "Bow" to be used by the "Knight" character
 * @author Shahraiz Aziz
 */
import java.util.Random;

public class WeaponBow implements WeaponBehavior {

    /**
     * Randomly picks an integer from 0 - 1 and uses the value to pick an attack for the character
     * @return The string representation of a randomly picked attack from a pool of two attacks
     */
    public String attack() {
        Random r = new Random();
        int num = r.nextInt(2);
        if (num == 0){
            return("Draw and loose an arrow");
        } else{
            return("Shoot arrow high in the sky");
        }

    }
    
}