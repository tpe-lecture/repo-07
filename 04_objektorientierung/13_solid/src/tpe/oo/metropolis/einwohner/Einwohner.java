package tpe.oo.metropolis.einwohner;

import tpe.oo.metropolis.Metropolis;
import waehrung.Metro_Dollar;

public abstract class Einwohner {

    private String name;
    private Metro_Dollar einkommen;

    public Einwohner(String name, Metro_Dollar einkommen){
        this.name = name;
        this.einkommen = einkommen;
    }

    public Metro_Dollar getEinkommen(){
        return einkommen;
    }

    public void setEinkommen(Metro_Dollar betrag) {
        int summe = getEinkommen().getWert();
        summe += betrag.getWert();
    }

    public abstract Metro_Dollar steuern();
}
