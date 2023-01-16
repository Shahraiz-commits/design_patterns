/**
 * A character called "King"
 * @author Shahraiz Aziz
 */

public class King extends Character {

    /**
     * Allows the user to assign a name for this character and creates a new instance of
     * WeaponBehavior to determine the character's attack type
     * @param name The name to be assigned for the King
     */
    public King(String name) {
        super (name);
        weaponBehavior = new WeaponSword();
    }
    
    /**
     * A String representation of this character
     * @return A string displaying the king's name
     */
    public String toString() {
        return (name + " is a noble King");
    }
    
}
