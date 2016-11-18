package tpe.oo.metropolis.einwohner.mutant_unterklassen;

import faehigkeiten.Superkraft;
import tpe.oo.metropolis.einwohner.Mutant;
import waehrung.Metro_Dollar;
import tpe.oo.metropolis.steuern.Koerperschaftsteuerpflichtig;
import tpe.oo.metropolis.steuern.Einkommensteuerpflichtig;

public class Schurke extends Mutant implements Einkommensteuerpflichtig{

    private final Superkraft schwaeche = new Superkraft(this);

    public Schurke(String name, Metro_Dollar einkommen, String mutation){
        super(name, einkommen, mutation);
    }

    //TODO: Laut Aufgabenstellung muss diese Methode nicht implementiert werden
    public void kaempfe(Superheld gegner){
    }

    public Metro_Dollar zahltSteuern(){
        int steuerSumme = zahleKoerperschaftsteuer().getWert() + zahleEinkommensteuer().getWert();
        return new Metro_Dollar(steuerSumme);
    }

    public Metro_Dollar getEinkommen(){
        return super.getEinkommen();
    }

    public Metro_Dollar zahleKoerperschaftsteuer(){
        int einkommenAlsInt = getEinkommen().getWert();
        return new Metro_Dollar((int)(einkommenAlsInt * 0.15));
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
        Metro_Dollar koerperschaftsteuer = zahleKoerperschaftsteuer();
        Metro_Dollar einkommensteuer = zahleEinkommensteuer();

        int steuerlast = koerperschaftsteuer.getWert() + einkommensteuer.getWert();
        return new Metro_Dollar(steuerlast);
    }
}
