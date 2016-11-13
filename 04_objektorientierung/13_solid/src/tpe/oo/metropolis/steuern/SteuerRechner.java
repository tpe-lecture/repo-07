package tpe.oo.metropolis.steuern;

import tpe.oo.metropolis.einwohner.mutant_unterklassen.Schurke;
import waehrung.Metro_Dollar;

public class SteuerRechner implements Einkommensteuer, Gewerbesteuer, Koerperschaftsteuer {

    @Override
    public Metro_Dollar zahleKoerperschaftsteuern(Schurke schurke) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Metro_Dollar zahleEinkommensteuer(Metro_Dollar einkommen) {
            int einkommenAlsInt = einkommen.getWert();

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
