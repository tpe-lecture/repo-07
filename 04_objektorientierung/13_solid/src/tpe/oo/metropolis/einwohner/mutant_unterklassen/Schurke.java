package tpe.oo.metropolis.einwohner.mutant_unterklassen;

import faehigkeiten.Superkraft;
import tpe.oo.metropolis.einwohner.Mutant;
import waehrung.Metro_Dollar;
import tpe.oo.metropolis.steuern.Koerperschaftsteuer;
import tpe.oo.metropolis.steuern.Einkommensteuer;

public class Schurke extends Mutant{

    private final Superkraft schwaeche = new Superkraft(this);

    public Schurke(String name, Metro_Dollar einkommen, String mutation){
        super(name, einkommen, mutation);
    }

    //TODO: Laut Aufgabenstellung muss diese Methode nicht implementiert werden
    public void kaempfe(Superheld gegner){
    }

    public Metro_Dollar zahltSteuern(){
        return zahleEinkommensteuer(getEinkommen());
    }

    public Metro_Dollar getEinkommen(){
        return super.getEinkommen();
    }
}
