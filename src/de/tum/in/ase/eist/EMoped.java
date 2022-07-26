package de.tum.in.ase.eist;

public class EMoped extends PEV {

    private PEV pev;

    public EMoped(int chargeLevel, String licensePlate) {
        super(chargeLevel, licensePlate);
        pricePerMinute = 5;
    }

    @Override
    public String toString() {
        return "E-Moped " + getLicensePlate() + " with charge level of " + getChargeLevel();
    }

    @Override
    Update getUpdate() {
        return pev.getUpdate();
    }
}
