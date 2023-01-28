package decorator;
/**
 * A bowl that extends ice cream and manages each bowl's properties
 * @author Shahraiz Aziz
 */
public class Bowl extends IceCream {
    public Bowl() {
        this.description = "Bowl";
    }

    /**
     * Responsible for returning a bowl's cost
     * @return Double representation of the cost of a bowl
     */
    public double getCost() {
        return 0;
    }

}
