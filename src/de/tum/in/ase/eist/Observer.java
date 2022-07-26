package de.tum.in.ase.eist;

public interface Observer<T> {
    void update(T state);
    T getUpdate();

}
