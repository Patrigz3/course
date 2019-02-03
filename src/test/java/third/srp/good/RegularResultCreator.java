package third.srp.good;

public class RegularResultCreator implements ResultCreator{
    @Override
    public Result create() {
        return new Result("1","2");
    }

}
