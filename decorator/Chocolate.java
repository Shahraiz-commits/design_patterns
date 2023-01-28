package decorator;
/**
 * 
 * @author Shahraiz Aziz
 */
public class Chocolate extends ScoopDecorator {
    
    public Chocolate(IceCream iceCream, int numScoops) {
        super(iceCream, numScoops);
        this.flavor = "chocolate";
        this.flavorCost = 1.5;
    }
}
