package third.solid.ocp.bad;

public class ResultHandler {
    public Result handle(ResultType resultType) {
        switch (resultType) {
            case AON:
                return new Result("",""); //Me crea un objeto resultado
            case REGULAR:
                return new Result("","");
             default:
                 break;
        }
        return null;
    }
}

//No es extensible ya que si el dia de mañana quisiera poner el calibrador tendia que venir a aqui y modificarla.

//Interfaz 'ResultCreator'