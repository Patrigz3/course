package third.srp.ocp.good;

import third.srp.ocp.good.Result;

public interface ResultCreator {
    Result create(); //Interfaz que ataca al create de cada clase: AONResultCreator, RegularResultCreator

}
