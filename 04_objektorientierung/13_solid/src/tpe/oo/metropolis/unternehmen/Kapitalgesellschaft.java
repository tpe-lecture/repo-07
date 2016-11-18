package tpe.oo.metropolis.unternehmen;

import tpe.oo.metropolis.einwohner.mensch_unterklassen.Buerger;
import waehrung.Metro_Dollar;
import tpe.oo.metropolis.steuern.Gewerbesteuerpflichtig;
import tpe.oo.metropolis.steuern.Koerperschaftsteuerpflichtig;

public class Kapitalgesellschaft extends Unternehmen {

    private Buerger[] gesellschafter;

    //TODO: Muss noch implementiert werden
    public Kapitalgesellschaft(String name, Metro_Dollar gewinn){
        super(name, gewinn);
    }
    //TODO: Muss mit Körperschaftsteuer und Gewerbesteuer implementiert werden
    public Metro_Dollar zahleSteuern(){
        int steuerlast = berechneGewerbesteuer().getWert() + berechneKoerperschaftsteuer().getWert();
        setGewinn(steuerlast * -1);

        return new Metro_Dollar(steuerlast);
    }

    public Metro_Dollar berechneGewerbesteuer() {
        int gewinnAlsInt = super.getGewinn().getWert();

        return new Metro_Dollar((int)(gewinnAlsInt * 0.15));
    }

    public Metro_Dollar berechneKoerperschaftsteuer() {
        int gewinnAlsInt = super.getGewinn().getWert();

        return new Metro_Dollar((int)(gewinnAlsInt * 0.15));
    }

}
