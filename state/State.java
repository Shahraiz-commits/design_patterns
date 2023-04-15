package state;

/**
 * Abstract class responsible for overseeing the functionality of the different states 
 * @author Shahraiz Aziz
 */
public abstract class State {
    protected Package pkg;
    protected int quantity;

    /**
     * Default constructor that initializes the variables pkg and quantity
     * @param pkg An instance of type Package
     * @param quantity The number of items in the current instance of Package
     */
    public State(Package pkg, int quantity){
        this.pkg = pkg;
        this.quantity = quantity;
    }

    public abstract String getStatus();
    public abstract String getETA();
    public abstract String delay();

    
    /** 
     * Takes two arguments and returns the correct one based on the quantity of the items in the order
     * @param singular The string to be used if there is only one item
     * @param plural The string to be used if the items are more than 1
     * @return One of the two arguments
     */
    protected String getVerb(String singular, String plural){
        if(quantity == 1) return singular;
        return plural;
    }

}
