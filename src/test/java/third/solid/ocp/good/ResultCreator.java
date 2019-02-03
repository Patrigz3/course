package third.solid.ocp.good;

public interface ResultCreator {
    Result create(); //Interfaz que ataca al create de cada clase: AONResultCreator, RegularResultCreator

}
