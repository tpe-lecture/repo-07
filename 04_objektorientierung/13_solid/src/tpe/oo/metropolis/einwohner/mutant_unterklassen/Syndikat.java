package tpe.oo.metropolis.einwohner.mutant_unterklassen;

import tpe.oo.metropolis.steuern.Koerperschaftsteuerpflichtig;
import waehrung.Metro_Dollar;

public class Syndikat implements Koerperschaftsteuerpflichtig{

    private String syndikatenName;
    private Schurke[] mitglieder;

    public Syndikat(String syndikatenName){
        this.syndikatenName = syndikatenName;
    }

    public void fügeMitgliedHinzu(Schurke neuesMitglied){

        if(this.mitglieder == null) {
            mitglieder = new Schurke[1];
            mitglieder[0] = neuesMitglied;
        }
        else{
            Schurke[] neueListe = new Schurke[mitglieder.length + 1];
            for(int i = 0; i < mitglieder.length; i++) {
                neueListe[i] = mitglieder[i];
            }
            neueListe[neueListe.length-1] = neuesMitglied;
            this.mitglieder = neueListe;
        }
    }

    @Override
    public Metro_Dollar steuern() {
        return zahleKoerperschaftsteuern();
    }
    @Override
    public Metro_Dollar zahleKoerperschaftsteuern() {
        int summe = 0;

        for(int i = 0; i < mitglieder.length; i++){
            summe += mitglieder[i].getEinkommen().getWert();
            int steuerLastAlsInt = ((int)(mitglieder[i].getEinkommen().getWert() * 0.15));
            mitglieder[i].setEinkommen(new Metro_Dollar(steuerLastAlsInt * -1));
        }

        return new Metro_Dollar(summe);
    }



}
