package tpe.oo.ueberladen;

/**
 * Einfache Hilfsklasse mit mathematischen Methoden.
 */
public final class Mathematik {

    /**
     * Konstruktor.
     */
    private Mathematik() {
    }
    /**
     * Liefert das Maximum zwischen zwei Zahlen.
     * @param firstValue Erste Zahl
     * @param secondValue Zweite Zahl
     * @return Erste Zahl bei Gleichheit, ansonsten Maximum
     */
    public static int max(int firstValue, int secondValue) {
        return (firstValue >= secondValue ? firstValue : secondValue);
    }

    /**
     * Liefert das Maximum dreier Zahlen.
     * @param firstValue Erste Zahl
     * @param secondValue Zweite Zahl
     * @param thirdValue Dritte Zahl
     * @return Bei Gleichheit entweder Erste oder Zweite, ansonsten Maximum
     */
    public static int max(int firstValue, int secondValue, int thirdValue) {
        int firstOrSecondMax = max(firstValue, secondValue);
        return (firstOrSecondMax >= thirdValue ? firstOrSecondMax : thirdValue);
    }

    /**
     * Liefert das Maximum von vier Zahlen.
     * @param firstValue Erste Zahl
     * @param secondValue Zweite Zahl
     * @param thirdValue Dritte Zahl
     * @param fourthValue Vierte Zahl
     * @return Bei Gleichheit das Maximum der ersten drei, ansonsten Maximum
     */
    public static int max(int firstValue, int secondValue,
            int thirdValue, int fourthValue) {
        int firstThreeMaximum = max(firstValue, secondValue, thirdValue);
        return (firstThreeMaximum >= fourthValue
                ? firstThreeMaximum : fourthValue);
    }
    // Bitte fügen Sie Ihre Methoden hier ein
}
