package tpe.oo.metropolis.steuern;

import tpe.oo.metropolis.behoerden.Steuerpflichtig;
import tpe.oo.metropolis.unternehmen.Kapitalgesellschaft;
import tpe.oo.metropolis.unternehmen.Personengesellschaft;
import waehrung.Metro_Dollar;

public interface Gewerbesteuerpflichtig extends Steuerpflichtig {

    /**
     * Berechnet die Gewerbesteuer
     * @return Steuerlast in Metro Dollar
     */
    public Metro_Dollar berechneGewerbesteuer();

}
