/**
 * A set of characters with randomly generated attack sequences
 * @author Shahraiz Aziz
 */

 /**
  * Abstract class that uses its children classes and an interface to set up the program
  */
public abstract class Character {
    protected String name;

    /*An instance of the interface to be used */
    protected WeaponBehavior weaponBehavior;

    /**
     * Sets the name for a character
     * @param name The name to be assigned to the character
     */
   public Character(String name) {
    this.name = name;
   }

   /**
    * Returns an attack sequence
    * @return A string representation of the type of attack 
    */
   public String attack() { 
    return (weaponBehavior.attack());
   }

   /**
    * Sets a new value for a character's weapon behavior
    * @param wb The new weapon behavior to be assigned to a character
    */
   public void setWeaponBehavior(WeaponBehavior wb) {
    this.weaponBehavior = wb; 
   }

   public abstract String toString();
}