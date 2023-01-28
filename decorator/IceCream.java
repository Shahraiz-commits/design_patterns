package decorator;
/**
 * An abstract class responsible for holding each icecream's description
 * @author Shahraiz Aziz
 */
public abstract class IceCream {
    protected String description;

    /**
     * Returns a concatenated string containing ice cream description
     * @return String representation of the collective description of an ice cream's elements
     */
    public String toString() {
        return (description);
    } 

    public abstract double getCost();

}
