/**
 * A class implementing subject that manages each observer's status
 * @author Shahraiz Aziz
 */
import java.util.ArrayList;

public class Watchman implements Subject {
    ArrayList<Observer> observers;
    int warning;

    //Default constructor responsible for initializing an array list
    public Watchman() {
        observers = new ArrayList<Observer>(); 
    }

    /**
     *Adds an observer to the array list to register them
     * @param observer An instance of type Observer 
     */
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * Removes an observer from the array list
     * @param observer An instance of type Observer
     */
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    //Updates the warning value for all observers
    public void notifyObservers() {
        for (Observer observer : observers){
            observer.update(warning);
        }

    }

    /**
     * Outputs a message depending on the warning value and then calls on notifyObservers()
     * @param warning An int type that determines the level of danger for observers
     */
    public void issueWarning(int warning) {
        this.warning = warning;
        if(warning == 1) {
            System.out.println("WARNING:  1 trumpet was played!");
        } else if(warning == 2) {
            System.out.println("WARNING:  2 trumpets were played!");
        }
        notifyObservers();
    }

}
