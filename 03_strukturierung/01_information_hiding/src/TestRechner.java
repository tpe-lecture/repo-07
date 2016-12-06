import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit-Test für den Rechner.
 */
public class TestRechner {

    /**
     * Testet alle Grundoperationen des Rechners.
     */
    @Test
    public void testRechner() {
        Rechner r = new Rechner();

        // 2 + 2 = 4
        assertEquals(4.0, r.addiere(2.0, 2.0), 0.0001);

        // 3 - 1 = 2
        assertEquals(2.0, r.subtrahiere(3, 1), 0.0001);

        // 3 * 3 = 9
        assertEquals(9.0, r.multipliziere(3, 3), 0.0001);

        // 2 + 2 * 2 = 6
        r.speichern(r.multipliziere(2, 2));
        r.speichern(r.addiere(2, r.getSpeicher()));
        assertEquals(6.0, r.getSpeicher(), 0.0001);
    }
}
