package de.tum.in.ase.eist;

import java.util.*;

public abstract class Subject<T> {
    private List<Observer<T>> observers = new ArrayList<>();

    private boolean state;

    public void subscribe(Observer<T> observer) {
        observers.add(observer);
    }

    public void unsubscribe(Observer<T> observer) {
        observers.remove(observer);
    }

    public List<Observer<T>> getObservers() { return observers;}

//    Take no parameter
    public void notifyObservers() {
        observers.forEach(observer -> observer.update(getUpdate()));
    }

//    Should be abstract
    abstract boolean getUpdate();
}
