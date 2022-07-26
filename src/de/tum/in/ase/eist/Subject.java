package de.tum.in.ase.eist;

import java.util.*;

public abstract class Subject<T> {
    // TODO realize observer pattern
    private List<Observer<T>> observers = new ArrayList<>();

    private Model model;

    public void subscribe(Observer<T> observer) {
        observers.add(observer);
    }

    public void unsubscribe(Observer<T> observer) {
        observers.remove(observer);
    }

    public void notifyObservers(T newState) {
        observers.forEach(observer -> observer.update(newState));
    }
}
