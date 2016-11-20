package tpe.oo.metropolis.einwohner.mutant_unterklassen;

import faehigkeiten.Superkraft;
import tpe.oo.metropolis.einwohner.Mutant;
import waehrung.Metro_Dollar;

public class Superheld extends Mutant {

    private Superkraft superkräfte;
    //TODO: Muss noch implementiert werden
    public Superheld(String name, Metro_Dollar einkommen, String mutation, Superkraft superkräfte){
        super(name, einkommen, mutation);
        this.superkräfte = superkräfte;
    }
    //TODO: Muss noch implementiert werden
    public void kaempfe(Schurke gegner){
    }
    @Override
    public Metro_Dollar steuern() {
        // TODO Auto-generated method stub
        return null;
    }

}
