package internal.third.solid.ocp.good;

public class RegularResultCreator implements ResultCreator {
    @Override
    public Result create() {
        return new Result("1","2");
    }

}
