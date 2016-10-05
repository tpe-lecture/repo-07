package tpe.io.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Ein Dame-Brett.
 */
public class Board implements Serializable {

    /** Belegung des Brettes. */
    private Color[][] brett = new Color[8][8];

    /**
     * Setzt einen Stein an die gegebene Koordinate.
     *
     * @param koordinate Koordinate in "a1"-Notation.
     * @param farbe Fabe des Spielsteins.
     */
    public void set(String koordinate, Color farbe) {
        Tupel t = parseCoordinates(koordinate);
        brett[t.x][t.y] = farbe;
    }

    /**
     * Tupel von zwei int-Werten.
     */
    private static class Tupel {
        int x;
        int y;
    }

    /**
     * Wandelt textuelle Koordinaten in x- und y-Wert um.
     *
     * @param koordinate Koordinate als String.
     * @return Koordinate als Integer-Tupel.
     */
    private Tupel parseCoordinates(String koordinate) {
        char buchstabe = koordinate.toLowerCase().charAt(0);
        char zahl = koordinate.charAt(1);

        Tupel t = new Tupel();

        t.y = buchstabe - 'a';
        t.x = zahl - '1';

        if (t.x < 0 || t.x > 7) {
            throw new IllegalArgumentException();
        }

        if (t.y < 0 || t.y > 7) {
            throw new IllegalArgumentException();
        }

        return t;
    }

    /**
     * Schreibt den Inhalt des Spielfeldes in eine Datei.
     *
     * @param file Dateiname.
     * @throws IOException IO-Probleme
     */
    public void writeToFile(String file) throws IOException {
        // TODO: Board in eine Datei speichern
    }

    /**
     * Liest den Inhalt aus einer Datei.
     *
     * @param file Dateipfad.
     * @return das gelesene Spielfeld
     * @throws IOException IO-Probleme
     */
    public static Board loadFromFile(String file) throws IOException {
        // TODO: Aus einer Datei lesen
        return null;
    }

    /**
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {

        StringBuilder result = new StringBuilder();

        char y = '1';

        result.append(" ");
        for (char c : "abcdefgh".toCharArray()) {
            result.append(' ').append(c);
        }

        result.append("\n");

        for (Color[] figurs : brett) {

            result.append(y++);

            for (Color figur : figurs) {
                if (figur != null) {
                    result.append(' ')
                        .append(figur);
                }
                else {
                    result.append("  ");
                }
            }

            result.append("\n");
        }

        return result.toString();
    }
}
