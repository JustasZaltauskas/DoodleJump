package units.observer;/*
* Player class.
* Description: Subject saves observers list.
*
* Author: Mantvydas Zakarevičius
 */

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<IObserver> observers;
    private int state;

    public Subject() {
        observers = new ArrayList<>();
    }

    public void addObserver(IObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    public void notifyAllObservers() {
        for (IObserver observer: observers) {
            observer.update();
        }
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }
}
