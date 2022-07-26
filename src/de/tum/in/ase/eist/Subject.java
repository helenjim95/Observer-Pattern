package de.tum.in.ase.eist;

import java.util.*;

public abstract class Subject<T> {
    private List<Observer<T>> observers = new ArrayList<>();

    private T state;

    public void subscribe(Observer<T> observer) {
        observers.add(observer);
    }

    public void unsubscribe(Observer<T> observer) {
        observers.remove(observer);
    }

    public List<Observer<T>> getObservers() { return observers;}

    public void notifyObservers(T state) {
        observers.forEach(observer -> observer.update(state));
    }

//    getUpdate should be abstract

    abstract T getUpdate();
}
