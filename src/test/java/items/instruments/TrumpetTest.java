package items.instruments;

import behaviours.IPlay;
import behaviours.ISell;
import items.Item;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet trumpet;

    @Before
    public void before(){
        trumpet = new Trumpet(55, 75, "Bach", InstrumentType.BRASS, true, 3, "C");
    }

    @Test
    public void canGetAllProperties(){
        assertEquals(55, trumpet.getBuyPrice(), 0.01);
        assertEquals(75, trumpet.getSellPrice(), 0.01);
        assertEquals("Bach", trumpet.getMake());
        assertEquals(InstrumentType.BRASS, trumpet.getType());
        assertEquals(3, trumpet.getNumberOfValves(), 0.01);
        assertEquals(true, trumpet.isNew());
        assertEquals("C", trumpet.getKey());
    }

    @Test
    public void doesInheritType(){
        assertEquals(true, trumpet instanceof Instrument);
        assertEquals(true, trumpet instanceof Item);
        assertEquals(true, trumpet instanceof IPlay);
        assertEquals(true, trumpet instanceof ISell);
    }

    @Test
    public void canPlay(){
        assertEquals("Jazzy!!!", trumpet.play());
    }

    @Test
    public void canGetMarkUp(){
        assertEquals(20, trumpet.calculateMarkUp(), 0.01);
    }
}
