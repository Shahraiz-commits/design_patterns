package state;

/**
 * Class responsible for overseeing the functionality of the in-transit state 
 * @author Shahraiz Aziz
 */
public class InTransitState extends State {
    
    private int days = 5;

    /**
     * Default constructor that initializes the variables pkg and quantity
     * @param pkg An instance of type Package
     * @param quantity The number of items in the current instance of Package
     */
    public InTransitState(Package pkg, int quantity){
        super(pkg, quantity);
    }

    /** 
     * Method that returns the package status
     * @return String that informs the user of the current status of the package
     */
    public String getStatus(){
        String verb = getVerb("is", "are");
        return "The " + pkg.getName() + " " + verb + " out for delivery";
    }

    /** 
     * Method that returns the package ETA
     * @return String representation of the ETA of the package
     */
    public String getETA(){
        return "The " + pkg.getName() + " should arrive within " + days + " days";
    }
    
    /** 
     * Increments the days variable by 3
     * @return String that informs the user that there has been a delay and then shows that delay
     */
    public String delay(){
        days+=3;
        String verb = getVerb("has", "have");
        return "The " + pkg.getName() + " " + verb + " experienced a delay in shipping.\nThe " + pkg.getName() + " should arrive within " + days + " days";
    }
}
