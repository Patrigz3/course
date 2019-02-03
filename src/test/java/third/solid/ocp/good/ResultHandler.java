package third.solid.ocp.good;

public class ResultHandler {
    public Result handle(ResultCreator resultCreator) {
        return resultCreator.create();
    }
}



//Interfaz 'ResultCreator'