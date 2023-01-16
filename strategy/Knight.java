/**
 * A character called "Knight"
 * @author Shahraiz Aziz
 */
public class Knight extends Character {

    /**
     * Allows the user to assign a name for this character and creates a new instance of WeaponBehavior to determine the character's attack type
     * @param name The name to be assigned for the Knight
     */
    public Knight(String name) {
        super (name);
        weaponBehavior = new WeaponBow();
    }
    
    /**
     * A string representation of this character
     * @return A string displaying the knight's name
     */
    public String toString() {
        return (name + " is a valiant Knight");
    }
    
}
