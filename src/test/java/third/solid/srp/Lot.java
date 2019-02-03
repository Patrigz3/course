package third.solid.srp;

public class Lot implements Printable {
    private String lotNumber; //Los atributos
    private String controlName;
    private String supplier;

    public Lot(String lotNumber, String controlName, String supplier) {
        this.lotNumber = lotNumber;
        this.controlName = controlName;
        this.supplier = supplier;
    }

    public String getLotNumber() {
        return lotNumber;
    }

    public String getControlName() {
        return controlName;
    }

    public String getSupplier() {
        return supplier;
    }


    public static void main (String[] args) {
        Lot lot = new Lot(null, null, null);
        ConsolePrinter ConsolePrinter = new ConsolePrinter();
        ConsolePrinter.print(lot);
    }

    public String whatToPrint() {
        return lotNumber;
    }
}

class Test {

    public static void main (String[] args) {
        Lot lot = new Lot("L1", "C1", "S1");
    }
}

interface Printable { //Lo correcto seria que estuviera en otro .java porque varias clases podrian usarla
    String whatToPrint(); //Devuelve algo que quiero imprimir. Te obliga a definir el metodo dentro de la clase. Mujer. Hombre = Clase -> clase obedece a mujer
}

class ConsolePrinter { //las clases empiezan por mayuscula. Lo correcto seria que estuviera

    void print(Printable printable) { //Siempre que podamos, usar la interfaz. Si pusieramos 'Lot' obligariamos a impimir lote
        System.out.println(printable.whatToPrint());
    }
}



//codility
//hackerrank