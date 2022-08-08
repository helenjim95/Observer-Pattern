package de.tum.in.ase.eist;

public class EBike extends PEV {

    private PEV pev;

    public EBike(int chargeLevel, String licensePlate) {
        super(chargeLevel, licensePlate);
        pricePerMinute = 3;
    }

    @Override
    public String toString() {
        return "E-Bike " + getLicensePlate() + " with charge level of " + getChargeLevel();
    }

    @Override
    Boolean getUpdate() {
        return pev.getUpdate();
    }
}
