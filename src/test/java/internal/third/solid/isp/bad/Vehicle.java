package internal.third.solid.isp.bad;

public abstract class Vehicle implements VehicleActions {

    @Override //Los metodos pueden ser diferentes para cada uno de los hijos o se puede poner en Vehicle si son comunes a todos
    public void startEngine() {

    }

    @Override
    public void shutdownEngine() {

    }
}
