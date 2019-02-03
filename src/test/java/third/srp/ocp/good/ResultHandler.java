package third.srp.ocp.good;

public class ResultHandler {
    public Result handle(ResultCreator resultCreator) {
        return resultCreator.create();
    }
}



//Interfaz 'ResultCreator'