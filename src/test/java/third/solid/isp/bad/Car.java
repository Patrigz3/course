package third.solid.isp.bad;

public class Car extends Vehicle { //implements SwitchRadio, SwitchCamera
    //Los metodos pueden ser diferentes para cada uno de los hijos o se puede poner en Vehicle si son comunes a todos

    @Override
    public void turnRadioOn() {

    }

    @Override
    public void turnRadioOff() {

    }

    @Override
    public void turnCameraOn() {

    }

    @Override
    public void turnCameraOff() {

    }
}
