package tpe.oo.metropolis.einwohner;

import waehrung.Metro_Dollar;

public abstract class Einwohner {

    private String name;
    private Metro_Dollar einkommen;

    public Einwohner(String name, Metro_Dollar einkommen){
        this.name = name;
        this.einkommen = einkommen;
    }

    protected Metro_Dollar getEinkommen(){
        return einkommen;
    }

}
