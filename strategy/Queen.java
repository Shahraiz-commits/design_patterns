/**
 * A character called "Queen"
 * @author Shahraiz Aziz
 */
public class Queen extends Character {

    /**
     * Allows the user to assign a name for this character and creates a new instance of WeaponBehavior to determine the character's attack type
     * @param name The name to be assigned for the Queen
     */
    public Queen(String name) {
        super (name);
        weaponBehavior = new WeaponKnife();
    }
    
     /**
     * A string representation of this character
     * @return A string displaying the Queen's name
     */
    public String toString() {
        return (name + " is a beautiful Queen");
    }
    
}
