package tpe.oo.abstrakt;

/**
 * Diese Abstrakte Klasse erzeugt ein Objekt welches die
 * gemeinsamen Eigenschaften von Kreisen und Dreiecken hat.
 * @author David
 *
 */
abstract class Figur {

    private double flaeche;
/**
 * Konstruktor legt flaeche der Figur fest.
 */
    Figur() {
        this.flaeche = this.flaeche();
    }
/**
 * Methode, welche in der Unterklasse jeweils die Flaeche
 * des Objektes berechnet.
 * @return Gibt double-Wert zurück.
 */
    abstract double flaeche();

    /**
     * Methode gibt flaeche raus.
     * @return Wert als Double
     */
    public double getFlaeche() {
        return this.flaeche;
    }
}
