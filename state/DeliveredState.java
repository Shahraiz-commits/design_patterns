package state;

/**
 * Class responsible for overseeing the functionality of the delivered state 
 * @author Shahraiz Aziz
 */
public class DeliveredState extends State {

    /**
     * Default constructor that initializes the variables pkg and quantity
     * @param pkg An instance of type Package
     * @param quantity The number of items in the current instance of Package
     */
    public DeliveredState(Package pkg, int quantity){
        super(pkg, quantity);
    }

    /** 
     * Method that returns the package status
     * @return String that informs the user of the current status of the package
     */
    public String getStatus(){
        String verb = getVerb("is", "are");
        return "The " + pkg.getName() + " " + verb + " here for you";
    }

     /** 
     * Method that returns the package ETA
     * @return String representation of the ETA of the package
     */
    public String getETA(){
        String verb = getVerb("is", "are");
        return "The " + pkg.getName() + " " + verb + " here";
    }
    
    /** 
     * Informs the user that the package is delivered
     * @return String that informs the user that the package was already delivered
     */
    public String delay(){
        String verb = getVerb("has", "have");
        return "The " + pkg.getName() + " " + verb + " already been delivered";
    }
}
