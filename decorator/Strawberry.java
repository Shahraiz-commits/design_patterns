package decorator;
/**
 * Extension of ScoopDecorator that manages the chocolate flavor's properties
 * @author Shahraiz Aziz
 */
public class Strawberry extends ScoopDecorator {
    
    /**
     * Sets properties of this ice cream flavor 
     * @param iceCream Instance of an IceCream
     * @param numScoops Integer representation of the number of this flavor's scoops
     */
    public Strawberry(IceCream iceCream, int numScoops) {
        super(iceCream, numScoops);
        this.flavor = "strawberry";
        this.flavorCost = 1.4;
    }
}
