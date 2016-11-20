package tpe.oo.metropolis.einwohner.mensch_unterklassen;

import tpe.oo.metropolis.einwohner.Mensch;
import tpe.oo.metropolis.steuern.Einkommensteuerpflichtig;
import waehrung.Metro_Dollar;

public class Buerger extends Mensch implements Einkommensteuerpflichtig {

    public Buerger(String name, int alter, Metro_Dollar einkommen){
        super(name, alter, einkommen);
    }

    @Override
    public Metro_Dollar zahleEinkommensteuer() {
        int einkommenAlsInt = getEinkommen().getWert();

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

    @Override
    public Metro_Dollar steuern() {
        return zahleEinkommensteuer();
    }

}
