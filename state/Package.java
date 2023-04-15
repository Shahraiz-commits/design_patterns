package state;

/**
 * Class that handles all of the states of the order
 * @author Shahraiz Aziz
 */
public class Package {

    private String name;
    private int quantity;
    private State state;
    private State orderedState;
    private State inTransitState;
    private State deliveredState;

    /**
     * Default constructor that initializes the variables name and quantity
     * @param name The name of the package
     * @param quantity The number of items in the package
     */
    public Package(String name, int quantity){
        this.name = name;
        this.quantity = quantity;
    }

    
    /** 
     * Assigns the state variable to the ordered state 
     * @return The status of the item that was ordered
     */
    public String order(){
        orderedState = new OrderedState(this, quantity);
        state = orderedState;
        return orderedState.getStatus() + "\n" + orderedState.getETA();
    }

    
    /** 
     * Assigns the state variable to the in-transit state
     * @return The status of the item in transit
     */
    public String mail(){
        inTransitState = new InTransitState(this, quantity);
        state = inTransitState;
        return inTransitState.getStatus() + "\n" + inTransitState.getETA();

    }

    
    /** 
     * Assigns the state variable to the received state
     * @return The status of the delivered item
     */
    public String received(){
        deliveredState = new DeliveredState(this, quantity);
        state = deliveredState;
        return deliveredState.getStatus();

    }

    
    /** 
     * Informs the user of the delay in their order
     * @return The state of the delay
     */
    public String delay(){
        return state.delay();
    }

    
    /** 
     * Returns the name of the package
     * @return the name of the package
     */
    public String getName(){
        return name;
    }
}
