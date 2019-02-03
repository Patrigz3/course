package third.srp.ocp.good;

public class AONResultCreator implements ResultCreator {
    @Override
    public Result create() {
        return new Result("3","4"); //llamamos al metodo constructor de la clase Result
    }
}
