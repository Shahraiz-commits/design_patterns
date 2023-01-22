/**
 * An interface to be implemented by the Watchman class to manage observers
 * @author Shahraiz Aziz
 */
public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
}
