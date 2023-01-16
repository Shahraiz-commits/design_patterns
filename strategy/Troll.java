/**
 * A character called "Troll"
 * @author Shahraiz Aziz
 */
public class Troll extends Character {

    /**
     * Allows the user to assign a name for this character and creates a new instance of WeaponBehavior to determine the character's attack type
     * @param name The name to be assigned for the Troll
     */
    public Troll(String name) {
        super (name);
        weaponBehavior = new WeaponAxe();
    }
    
     /**
     * A string representation of this character
     * @return A string displaying the Troll's name
     */
    public String toString() {
        return (name + " is a funny Troll");
    }
    
}
