package third.srp.isp.bad;

public interface VehicleActions {
    void startEngine();
    void shutdownEngine();
    void turnRadioOn();
    void turnRadioOff();
    void turnCameraOn();
    void turnCameraOff();
}

//La clase vehiculo es abstracta. Con las clases abstractas usamos extends. Podremos hacer un coche o un car pero nunca un vehiculo porque lo hemos declarado como abstracto.

//Correcto tener mas interfaces: switchEngine deberia contener las dos primeras, switchRadio con otras dos
//La interfaz VehicleActions dejaria de existir porq estaria dividida en varias