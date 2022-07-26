package de.tum.in.ase.eist;

import java.util.*;

public abstract class Subject<T> {
    // TODO realize observer pattern
    private List<Observer<T>> observers = new ArrayList<>();

    private Update<T> state;

    public void subscribe(Observer<T> observer) {
        observers.add(observer);
    }

    public void unsubscribe(Observer<T> observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        observers.forEach(observer -> observer.update(state));
    }

    public Update<T> getUpdate() {
        return state;
    }
}
