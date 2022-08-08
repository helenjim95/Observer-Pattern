package de.tum.in.ase.eist;

public class Update<B> extends Subject<Boolean> {

    private Rider rider;
    private PEV pev;
    private boolean isAvailable;


    public Update(PEV pev, boolean isAvailable) {
        this.pev = pev;
        this.isAvailable = isAvailable;
    }

    public void notify(PEV pev, boolean isAvailable) {
        if (isAvailable) {
            pev.unlock();
        } else {
            pev.lock();
        }
    }

    public PEV getPEV() {
        return pev;
    }

    public void setPEV(PEV pev) {
        this.pev = pev;
    }

    public boolean getAvailable() { return isAvailable; }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public Rider getRider() {
        return rider;
    }

    public void setRider(Rider rider) {
        this.rider = rider;
    }

    @Override
    Boolean getUpdate() {
        return pev.isAvailable();
    }

}
