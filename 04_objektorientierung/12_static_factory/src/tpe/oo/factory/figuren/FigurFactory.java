package tpe.oo.factory.figuren;

import java.util.Random;
import de.smits_net.games.framework.board.Board;

/**
 * Diese Klasse hat nur eine Methode, welche dazu da ist
 * lauter Lady´s, Ninja´s und Wizard´s zu produzieren.
 * @author David
 *
 */
public class FigurFactory {

   /**
    * Das ist die erwähnte Methode, welche die Figuren
    * erzeugt und ausspuckt.
    * @param board board
    * @return Zufällige Figur vom Typ Figur.
    */
    public static Figur createFigur(Board board) {

        Random rnd = new Random();
        int random = rnd.nextInt(3);

        switch (random) {
            case 0 : return new Lady(board);
            case 1 : return new Ninja(board);
            default : return new Wizard(board);
        }
    }

}
