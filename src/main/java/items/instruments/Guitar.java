package items.instruments;

public class Guitar extends Instrument {

    private int numberOfStrings;
    private String model;

    public Guitar(double buyPrice, double sellPrice, String make, InstrumentType type, boolean isNew, int numberOfStrings, String model) {
        super(buyPrice, sellPrice, make, type, isNew);
        this.numberOfStrings = numberOfStrings;
        this.model = model;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String getModel() {
        return model;
    }

    public String play(){
        return "Rocking it on the " + getMake() + " " + this.model;
    }
}
