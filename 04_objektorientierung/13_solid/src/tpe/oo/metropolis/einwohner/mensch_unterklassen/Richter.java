package tpe.oo.metropolis.einwohner.mensch_unterklassen;

import tpe.oo.metropolis.einwohner.Mensch;
import tpe.oo.metropolis.einwohner.mutant_unterklassen.Schurke;
import waehrung.Metro_Dollar;

public class Richter extends Mensch {

    private boolean ist_korrupt;
    //TODO: Muss noch implementiert werden
    public Richter(String name, int alter, Metro_Dollar einkommen, boolean korrupt){
        super(name, alter, einkommen);
        this.ist_korrupt = korrupt;
    }
    //TODO: Muss noch implementiert werden
    public void verurteilen(Schurke angeklakter){
    }

}
