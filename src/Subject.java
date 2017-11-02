import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<IObserver> observers;

    private Subject() { observers = new ArrayList<>(); }

    public void addObserver(IObserver observer) { observers.add(observer); }

    public void removeObserver(IObserver observer) { observers.remove(observer); }

}
