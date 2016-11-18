package tpe.oo.metropolis.unternehmen;

import tpe.oo.metropolis.einwohner.mensch_unterklassen.Buerger;
import tpe.oo.metropolis.steuern.Einkommensteuerpflichtig;
import waehrung.Metro_Dollar;

public class Personengesellschaft extends Unternehmen implements Einkommensteuerpflichtig {

    private Buerger[] inhaber;

    //TODO: Muss noch implementiert werden
    public Personengesellschaft(String name, Metro_Dollar gewinn){
        super(name, gewinn);
    }
    //TODO: Muss noch mit Gewerbesteuer und 800 Metro_Dollar Ermäßigung implementiert werden
    public Metro_Dollar zahleSteuern(){
        return null;
    }

    @Override
    public Metro_Dollar zahleEinkommensteuer() {
        int einkommenAlsInt = getGewinn().getWert();

        if(einkommenAlsInt > 120002){
            return new Metro_Dollar(((int)((einkommenAlsInt - 120003) * 0.4)) + zahleEinkommensteuer((einkommenAlsInt - 60000), (float)0.25));
        }
        else if(einkommenAlsInt > 60001){
            return new Metro_Dollar(((int)((einkommenAlsInt - 60001) * 0.25)) + zahleEinkommensteuer((einkommenAlsInt - 40000), (float)0.15));
        }
        else if(einkommenAlsInt > 20000){
            return new Metro_Dollar(((int)((einkommenAlsInt - 20000) * 0.15)) + zahleEinkommensteuer((einkommenAlsInt - 20000), (float)0.08));
        }
        else
            return new Metro_Dollar((int)(einkommenAlsInt * 0.08));
    }

    private int zahleEinkommensteuer(int einkommen, float Steuerlast){
        if(einkommen > 60001){
            return (int)((einkommen - 40000) * Steuerlast) + zahleEinkommensteuer(einkommen - 40000, (float)0.15);
        }
        else if(einkommen > 20000){
            return (int)((einkommen - 20000) * Steuerlast) + zahleEinkommensteuer(einkommen - 20000, (float)0.008);
        }
        else
            return (int)(einkommen * Steuerlast);
}

}
