package de.tum.in.ase.eist;

public class Model extends Subject {

    private Rider rider;
    private PEV pev;
    private boolean isAvailable;

    public Model() {
    }

    public void notify(PEV pev, boolean isAvailable) {
    }

    public PEV getPEV() {
        return pev;
    }

    public boolean isAvailable() { return isAvailable; }
}
