package state;

/**
 * Class responsible for overseeing the functionality of the ordered state 
 * @author Shahraiz Aziz
 */
public class OrderedState extends State {
    
    private int days = 2;
    
    /**
     * Default constructor that initializes the variables pkg and quantity
     * @param pkg An instance of type Package
     * @param quantity The number of items in the current instance of Package
     */
    public OrderedState(Package pkg, int quantity){
        super(pkg, quantity);
    }

    
    /** 
     * Method that returns the package status
     * @return String that informs the user of the current status of the package
     */
    public String getStatus(){
        String verb = getVerb("was", "were");
        return "The " + pkg.getName() + " " + verb + " ordered";
    }

    
    /** 
     * Method that returns the package ETA
     * @return String representation of the ETA of the package
     */
    public String getETA(){
        return "The " + pkg.getName() + " will be shipped within " + days + " business days";
    }
    
    
    /** 
     * Increments the days variable by 2
     * @return String that informs the user that there has been a delay and then shows that delay
     */
    public String delay(){
        days+=2;
        return "The " + pkg.getName() + " experienced a slight delay in manufacturing.\nThe " + pkg.getName() + " will be shipped within " + days + " business days";
    }
}
