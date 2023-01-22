import java.util.ArrayList;

public class Watchman implements Subject {
    ArrayList<Observer> observers;
    int warning;

    public Watchman() {
        observers = new ArrayList<Observer>(); 
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers){
            observer.update(warning);
        }

    }

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
