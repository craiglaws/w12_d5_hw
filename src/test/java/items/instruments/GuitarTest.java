package items.instruments;

import behaviours.IPlay;
import behaviours.ISell;
import items.Item;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar(100, 199, "Fender", InstrumentType.STRINGS, false, 6, "Telecaster");
    }

    @Test
    public void canGetAllProperties(){
        assertEquals(100, guitar.getBuyPrice(), 0.01);
        assertEquals(199, guitar.getSellPrice(), 0.01);
        assertEquals("Fender", guitar.getMake());
        assertEquals(InstrumentType.STRINGS, guitar.getType());
        assertEquals(6, guitar.getNumberOfStrings(), 0.01);
        assertEquals(false, guitar.isNew());
        assertEquals("Telecaster", guitar.getModel());
    }

    @Test
    public void doesInheritType(){
        assertEquals(true, guitar instanceof Instrument);
        assertEquals(true, guitar instanceof Item);
        assertEquals(true, guitar instanceof IPlay);
        assertEquals(true, guitar instanceof ISell);
    }

    @Test
    public void canPlay(){
        assertEquals("Rocking it on the Fender Telecaster", guitar.play());
    }

    @Test
    public void canGetMarkUp(){
        assertEquals(99, guitar.calculateMarkUp(), 0.01);
    }
}
