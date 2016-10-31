package tpe.oo.abstrakt;

/**
 * Flächenberechnung.
 */
public final class Geometer {

    /** Keine Instanzen. */
    private Geometer() {
        // keine Objekte
    }

    /**
     * Hauptmethode.
     *
     * @param args Kommandozeilenargumente
     */
    public static void main(String[] args) {
//        Kreis[] kreise = new Kreis[5];
//        Dreieck[] dreiecke = new Dreieck[5];
        Figur[] dreieckUndKreise = new Figur[10];

        dreieckUndKreise[0] = new Kreis(10.0);
        dreieckUndKreise[1] = new Kreis(5.5);
        dreieckUndKreise[2] = new Kreis(3.3);
        dreieckUndKreise[3] = new Kreis(7.2);
        dreieckUndKreise[4] = new Kreis(8.0);

        dreieckUndKreise[5] = new Dreieck(4.0, 3.0);
        dreieckUndKreise[6] = new Dreieck(2.0, 1.0);
        dreieckUndKreise[7] = new Dreieck(5.0, 8.0);
        dreieckUndKreise[8] = new Dreieck(2.0, 7.2);
        dreieckUndKreise[9] = new Dreieck(14.0, 3.8);

        double gesamtflaeche = 0.0;

        for (Figur figur : dreieckUndKreise) {
            gesamtflaeche += figur.flaeche();
        }

//        for (Dreieck dreieck : dreieckUndKreise) {
//            gesamtflaeche += dreieck.flaeche();
//        }

        System.out.printf("Die Fläche beträgt: %.2f", gesamtflaeche);
    }
}
