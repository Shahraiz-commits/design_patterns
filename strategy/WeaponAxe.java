/**
 * A weapon called "Axe" to be used by the "Troll" character
 * @author Shahraiz Aziz
 */
import java.util.Random;

public class WeaponAxe implements WeaponBehavior {

    /**
     * Randomly picks an integer from 0 - 1 and uses the value to pick an attack for the character
     * @return The string representation of a randomly picked attack from a pool of two attacks
     */
    public String attack() {
        Random r = new Random();
        int num = r.nextInt(2);
        if (num == 0) {
            return("Swing an axe");
        } else {
            return("Twirl an axe");
        }

    }
    
}