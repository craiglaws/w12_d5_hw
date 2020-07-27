package items.instruments;

import behaviours.IPlay;
import behaviours.ISell;
import items.Item;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumTest {

    Drums drums;

    @Before
    public void before(){
        drums = new Drums(80, 150, "Tama", InstrumentType.PERCUSSION, true, 5, "Starclassic");
    }

    @Test
    public void canGetAllProperties(){
        assertEquals(80, drums.getBuyPrice(), 0.01);
        assertEquals(150, drums.getSellPrice(), 0.01);
        assertEquals("Tama", drums.getMake());
        assertEquals(InstrumentType.PERCUSSION, drums.getType());
        assertEquals(5, drums.getKitSize(), 0.01);
        assertEquals(true, drums.isNew());
        assertEquals("Starclassic", drums.getModel());
    }

    @Test
    public void doesInheritType(){
        assertEquals(true, drums instanceof Instrument);
        assertEquals(true, drums instanceof Item);
        assertEquals(true, drums instanceof IPlay);
        assertEquals(true, drums instanceof ISell);
    }

    @Test
    public void canPlay(){
        assertEquals("Thrashing it on the Tama Starclassic", drums.play());
    }

    @Test
    public void canGetMarkUp(){
        assertEquals(70, drums.calculateMarkUp(), 0.01);
    }
}
