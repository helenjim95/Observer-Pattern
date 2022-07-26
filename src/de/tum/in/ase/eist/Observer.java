package de.tum.in.ase.eist;

public interface Observer<T> {
    void update(Update<T> state);
    Update<T> getUpdate();

}
