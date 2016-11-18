package tpe.oo.metropolis.steuern;

import tpe.oo.metropolis.behoerden.Steuerpflichtig;
import waehrung.Metro_Dollar;

public interface Einkommensteuerpflichtig extends Steuerpflichtig {

    public Metro_Dollar zahleEinkommensteuer();

    Metro_Dollar steuern();
}
