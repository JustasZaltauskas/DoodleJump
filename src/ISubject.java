import java.util.ArrayList;
import java.util.List;

public interface ISubject {
    List<IObserver> observers = new ArrayList<>();
    void attach(IObserver o);
    void detach(IObserver o);
    void notifyObservers(int number);
}
