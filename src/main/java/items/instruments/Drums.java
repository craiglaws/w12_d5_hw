package items.instruments;

public class Drums extends Instrument {

    private int kitSize;
    private String model;

    public Drums(double buyPrice, double sellPrice, String make, InstrumentType type, boolean isNew, int kitSize, String model) {
        super(buyPrice, sellPrice, make, type, isNew);
        this.kitSize = kitSize;
        this.model = model;
    }

    public int getKitSize() {
        return kitSize;
    }

    public String getModel() {
        return model;
    }

    public String play(){
        return "Thrashing it on the " + getMake() + " " + this.model;
    }
}
