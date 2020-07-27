package items.accessories;

import items.Item;

public class Accessory extends Item {

    private String type;
    private String forInstrument;

    public Accessory(double buyPrice, double sellPrice, String type, String forInstrument) {
        super(buyPrice, sellPrice);
        this.type = type;
        this.forInstrument = forInstrument;
    }

    public String getType() {
        return type;
    }

    public String getForInstrument() {
        return forInstrument;
    }
}
