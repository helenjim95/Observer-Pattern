package de.tum.in.ase.eist;

public interface Observer<T> {
    void update(boolean state);
    boolean getUpdate();

}
