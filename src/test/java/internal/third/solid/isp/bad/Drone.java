package internal.third.solid.isp.bad;

public class Drone extends Vehicle {      //implements SwitchCamera
    @Override
    public void turnRadioOn() {
        throw new IllegalArgumentException("a drone doesnt contain a radio"); //La interfaz no me deberia obligar a implementar este metodo. La interfaz VehicleActions deberiamos dividirla en interfaces mas pequeñas
    }

    //No deberian existir nunca los metodos vacios

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
