package internal.third.solid.ocp.bad;

public class Result {

    private final String value1; //Nos tenemos que acostumbrar a usaer final
    private final String value2; //Final -> inmutable. Cuando los atributos son final no se puede hacer setter, al instanciarlo hay que darle los valores

    Result(String value1, String value2) { //Constructor
        this.value1 = value1;
        this.value2 = value2;
    }

    public String getValue1() { //Getter
        return value1;
    }

    public String getValue2() {  //Getter
        return value2;
    }

}
