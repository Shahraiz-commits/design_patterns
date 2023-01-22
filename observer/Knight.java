/**
 * Knight character
 * @author Shahraiz Aziz
 */
public class Knight implements Observer{
    Subject watchman;

    /**
     * Uses an instance of the watchman class to register this character as an observer
     * @param watchman an instance of the Watchman class
     */
    public Knight(Subject watchman) {
        this.watchman = watchman;
        watchman.registerObserver(this);
    }

    /**
     * Uses the warning parameter to determine which dialogue to output for this character
     * @param warning An int type that determines the level of danger for the warning
     */
    public void update(int warning) {
        if (warning == 1) {
            System.out.println("Knight: Helps everyone get home safe");
        } else if (warning == 2) {
            System.out.println("Knight: Prepares for battle");       
        }

    }

}