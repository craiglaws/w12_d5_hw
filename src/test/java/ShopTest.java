import items.accessories.Accessory;
import items.instruments.Drums;
import items.instruments.Guitar;
import items.instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Guitar guitar;
    Drums drums;
    Accessory accessory;

    @Before
    public void before(){
        shop = new Shop("Ness Music");
        guitar = new Guitar(100, 199, "Fender", InstrumentType.STRINGS, false, 6, "Telecaster");
        accessory = new Accessory(10, 20, "Guitar strings", "Guitar");
        drums = new Drums(80, 150, "Tama", InstrumentType.PERCUSSION, true, 5, "Starclassic");
    }

    @Test
    public void hasName(){
        assertEquals("Ness Music", shop.getName());
    }

    @Test
    public void stockStartsEmpty(){
        assertEquals(0, shop.getStock().size());
    }

    @Test
    public void canAddToStock(){
        shop.addToStock(drums);
        assertEquals(1, shop.getStock().size());
    }

    @Test
    public void canRemoveFromStock(){
        shop.addToStock(accessory);
        shop.addToStock(guitar);
        shop.removeFromStock(accessory);
        assertEquals(1, shop.getStock().size());
    }

    @Test
    public void canGetTotalMarkUp(){
        shop.addToStock(drums);
        shop.addToStock(guitar);
        shop.addToStock(accessory);
        assertEquals(179, shop.calculateTotalMarkUp(), 0.01);
    }
}
