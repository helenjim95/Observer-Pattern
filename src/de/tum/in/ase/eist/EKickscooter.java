package de.tum.in.ase.eist;

public class EKickscooter extends PEV {

    private PEV pev;

    public EKickscooter(int chargeLevel, String licensePlate) {
        super(chargeLevel, licensePlate);
        pricePerMinute = 2;
    }

    @Override
    public String toString() {
        return "E-Kickscooter " + getLicensePlate() + " with charge level of " + getChargeLevel();
    }

    @Override
    Boolean getUpdate() {
        return pev.getUpdate();
    }
}
