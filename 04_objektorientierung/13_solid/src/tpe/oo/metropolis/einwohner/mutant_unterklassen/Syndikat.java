package tpe.oo.metropolis.einwohner.mutant_unterklassen;

import tpe.oo.metropolis.steuern.Koerperschaftsteuerpflichtig;
import waehrung.Metro_Dollar;

public class Syndikat implements Koerperschaftsteuerpflichtig{

    private String syndikatenName;
    private Schurke[] mitglieder;
    private int AnzahlMitglieder = 0;

    public Syndikat(String syndikatenName){
        this.syndikatenName = syndikatenName;
    }

    public void fügeMitgliedHinzu(Schurke neuesMitglied){
        AnzahlMitglieder++;
        Schurke[] neueListe = new Schurke[AnzahlMitglieder];

        if(AnzahlMitglieder == 1){
            neueListe[0] = neuesMitglied;
        }
        else{
            for(int i = 0; i < neueListe.length - 1; i++){
                neueListe[i] = mitglieder[i];
            }
            neueListe[AnzahlMitglieder -1] = neuesMitglied;
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
