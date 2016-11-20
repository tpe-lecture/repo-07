package tpe.oo.metropolis.behoerden;

import tpe.oo.metropolis.einwohner.mutant_unterklassen.Schurke;
import waehrung.Metro_Dollar;


public class Finanzamt {

    private Steuerpflichtig[] steuerpflichtige;

    public Finanzamt(Steuerpflichtig...steuerpflichtige){
        this.steuerpflichtige = steuerpflichtige;
    }

    public Metro_Dollar steuern(){
        int steuerSumme = 0;
        for(Steuerpflichtig derPflichtige : this.steuerpflichtige) {
            steuerSumme += derPflichtige.steuern().getWert();
        }
        return new Metro_Dollar(steuerSumme);
    }

}
