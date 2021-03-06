package tpe.oo.metropolis.einwohner;

import faehigkeiten.Superkraft;
import tpe.oo.metropolis.einwohner.mutant_unterklassen.Schurke;
import waehrung.Metro_Dollar;

public abstract class Mutant extends Einwohner {

    private String mutation;

    protected Mutant(String name, Metro_Dollar einkommen, String mutation){
        super(name, einkommen);
        this.mutation = mutation;
    }

    public abstract Metro_Dollar steuern();
}
