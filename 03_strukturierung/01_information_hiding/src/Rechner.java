
/**
 * Ein einfacher Taschenrechner.
 */
public class Rechner {


    /** Speicher des Taschenrechners. */
    private double speicher;

    /**
     * Addiert zwei Wert und schreibt das Ergebnis
     * in die Variable {@code wert}.
     *
     * @param a erster Operand.
     * @param b zweiter Operand.
     */
    public double addiere(double a, double b) {
        return a + b;
    }

    /**
     * Subtrahiert zwei Wert und schreibt das Ergebnis
     * in die Variable {@code wert}.
     *
     * @param a erster Operand.
     * @param b zweiter Operand.
     */
    public double subtrahiere(double a, double b) {
        return a - b;
    }

    /**
     * Multipliziert zwei Wert und schreibt das Ergebnis
     * in die Variable {@code wert}.
     *
     * @param a erster Operand.
     * @param b zweiter Operand.
     */
    public double multipliziere(double a, double b) {
        return a * b;
    }

    /**
     * Speichert einen Wert in der Variable {@speicher}.
     */
    public void speichern(double a) {
        speicher = a;
    }

    /**
     * Gibt den Wert des Speichers zurück.
     * @return
     */
    public double getSpeicher() {
        return speicher;
    }
}
