package decorator;
/**
 * An abstract class that manages the properties of each ice cream scoop
 * @author Shahraiz Aziz
 */
public abstract class ScoopDecorator extends IceCream {
    protected IceCream iceCream;
    protected int numScoops;
    protected String flavor;
    protected double flavorCost;
    
    /**
     * Initializes an ice cream and its number of scoops
     * @param iceCream An instance of IceCream
     * @param numScoops An integer representation of the number of scoops of an ice cream
     */
    public ScoopDecorator(IceCream iceCream, int numScoops) {
        this.iceCream = iceCream; 
        this.numScoops = numScoops;
    }

    /**
     * Delivers a string representation of the properties of an ice cream
     * @return A concatenated string containing description of a previously made icecream and
     * the properties of the current ice cream
     */
    public String toString() {
        if(this.numScoops == 1) {
            return (this.iceCream.toString() + ", " + "a scoop of " + this.flavor + " ice cream");
        } else {
            return (this.iceCream.toString() + ", " + this.numScoops + " scoops of " + this.flavor + " ice cream");
        }

    }

    /**
     * Computes the cost of the current scoops of ice cream and adds it to the total cost
     * @return Double representation of the total cost of an ice cream
     */
    public double getCost() {
        return iceCream.getCost() + (this.flavorCost * this.numScoops);
    }

}
