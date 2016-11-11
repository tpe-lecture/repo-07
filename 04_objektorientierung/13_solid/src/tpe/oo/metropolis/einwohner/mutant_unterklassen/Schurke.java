package tpe.oo.metropolis.einwohner.mutant_unterklassen;

import faehigkeiten.Superkraft;
import tpe.oo.metropolis.einwohner.Mutant;
import waehrung.Metro_Dollar;
import tpe.oo.metropolis.steuern.Koerperschaftsteuer;
import tpe.oo.metropolis.steuern.Einkommensteuer;

public class Schurke extends Mutant{
    
    private Superkraft schwaeche;
    //TODO: Muss noch implementiert werden
    public Schurke(){
    }
    //TODO: Muss noch implementiert werden
    public void kaempfe(){
    }
    //TODO: Muss noch implementiert werden, mit Körperschaftssteuer und Einkommenssteuer
    
    protected Metro_Dollar zahleSteuern(){
        Metro_Dollar steuerLast;
        steuerLast = zahleKoerperschaftsteuern(this);
        return steuerLast + zahleEinkommensteuern(this);
    }

}
