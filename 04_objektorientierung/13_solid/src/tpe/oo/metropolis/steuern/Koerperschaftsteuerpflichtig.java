package tpe.oo.metropolis.steuern;

import tpe.oo.metropolis.behoerden.Steuerpflichtig;
import tpe.oo.metropolis.einwohner.mutant_unterklassen.Schurke;
import waehrung.Metro_Dollar;

public interface Koerperschaftsteuerpflichtig extends Steuerpflichtig {

    public Metro_Dollar zahleKoerperschaftsteuern();

}
