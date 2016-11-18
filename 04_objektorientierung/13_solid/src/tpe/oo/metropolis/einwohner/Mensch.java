package tpe.oo.metropolis.einwohner;

import waehrung.Metro_Dollar;

public abstract class Mensch extends Einwohner {

    private int alter;

    protected Mensch(String name, int alter, Metro_Dollar einkommen){
        super(name, einkommen);
        this.alter = alter;
    }

}
