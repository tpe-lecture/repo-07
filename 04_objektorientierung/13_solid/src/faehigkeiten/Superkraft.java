package faehigkeiten;

import java.util.Random;

import tpe.oo.metropolis.einwohner.mutant_unterklassen.Schurke;
import tpe.oo.metropolis.einwohner.mutant_unterklassen.Superheld;

public class Superkraft {

    private final String[] superkraft = {"Laseraugen", "Kamehameha", "Toxinspucke", "Feuerspeien", "Eistorpedo"};
    private String[] heiligerGral;
    /**
     * Erstellt ein String Array zufällig mit Superkräften.
     * @return
     */
    public Superkraft(Superheld superheld){
        this.heiligerGral = new String[ermittleGrößeDesGrals()];
        befülleGral();
    }

    public Superkraft(Schurke schurke){
        Random rnd = new Random();
        this.heiligerGral = new String[1];
        this.heiligerGral[0] = superkraft[rnd.nextInt(4)];
    }

    public String[] getSuperkraft(){
        return heiligerGral;
    }

    private int ermittleGrößeDesGrals(){
        Random rnd = new Random();
        int ermittelteZahl = rnd.nextInt(5);
        if(ermittelteZahl != 0){
            return ermittelteZahl;
        }
        else
            return ermittleGrößeDesGrals();
    }

    private void befülleGral(){
        Random rnd = new Random();
        for(int i = 0; i < this.heiligerGral.length; i++){
                this.heiligerGral[i] = superkraft[rnd.nextInt(4)];
        }
    }
}
