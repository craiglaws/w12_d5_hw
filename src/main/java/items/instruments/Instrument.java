package items.instruments;

import behaviours.IPlay;
import items.Item;

public abstract class Instrument extends Item implements IPlay {

    private String make;
    private InstrumentType type;
    private boolean isNew;

    public Instrument(double buyPrice, double sellPrice, String make, InstrumentType type, boolean isNew) {
        super(buyPrice, sellPrice);
        this.make = make;
        this.type = type;
        this.isNew = isNew;
    }

    public String getMake() {
        return make;
    }

    public InstrumentType getType() {
        return type;
    }

    public boolean isNew() {
        return isNew;
    }
}


