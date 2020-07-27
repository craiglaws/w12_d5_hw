package items.accessories;

import behaviours.IPlay;
import behaviours.ISell;
import items.Item;
import items.instruments.Instrument;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccessoryTest {

    Accessory accessory;

    @Before
    public void before(){
        accessory = new Accessory(10, 20, "Guitar strings", "Guitar");
    }

    @Test
    public void canGetAllProperties(){
        assertEquals(10, accessory.getBuyPrice(), 0.01);
        assertEquals(20, accessory.getSellPrice(), 0.01);
        assertEquals("Guitar strings", accessory.getType());
        assertEquals("Guitar", accessory.getForInstrument());
    }

    @Test
    public void doesInheritType(){
        assertEquals(true, accessory instanceof Item);
        assertEquals(true, accessory instanceof ISell);
    }

    @Test
    public void canGetMarkUp(){
        assertEquals(10, accessory.calculateMarkUp(), 0.01);
    }

}
