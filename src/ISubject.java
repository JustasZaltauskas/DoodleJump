public interface ISubject {
    void attach(IObserver o);
    void detach(IObserver o);
    void notifyObservers(int number);
}
