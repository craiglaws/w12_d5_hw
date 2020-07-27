package items.instruments;

public class Trumpet extends Instrument {

    private int numberOfValves;
    private String key;

    public Trumpet(double buyPrice, double sellPrice, String make, InstrumentType type, boolean isNew, int numberOfValves, String key) {
        super(buyPrice, sellPrice, make, type, isNew);
        this.numberOfValves = numberOfValves;
        this.key = key;
    }

    public int getNumberOfValves() {
        return numberOfValves;
    }

    public String getKey() {
        return key;
    }

    public String play(){
        return "Jazzy!!!";
    }
}
