package de.tum.in.ase.eist;

public class Update<T> extends Subject<T> {

    private Rider rider;
    private PEV pev;
    private boolean isAvailable;

    public Update() {
    }

    public void notify(PEV pev, boolean isAvailable) {
    }

    public PEV getPEV() {
        return pev;
    }

    public boolean isAvailable() { return isAvailable; }
}