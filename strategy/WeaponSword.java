/**
 * A weapon called "Sword" to be used by the "King" character
 * @author Shahraiz Aziz
 */
import java.util.Random;

public class WeaponSword implements WeaponBehavior{

     /**
     * Randomly picks an integer from 0 - 2 and uses the value to pick an attack for the character
     * @return The string representation of a randomly picked attack from a pool of three attacks
     */
    public String attack(){
        Random r = new Random();
        int num = r.nextInt(3);
        if (num == 0){
            return("Lunge and strike with sword");
        } else if (num == 1){
            return("Fancy turn and slice with sword");
        } else {
            return("Jam opponents blade with sword");
        }

    }
    
}