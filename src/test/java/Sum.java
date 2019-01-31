import java.util.*;
public class Sum
{
    public static void main (String [] args) {
        //Scanner scanner = new Scanner(System.in);
        //int numero1; error YAGNI: you aint gonna need it
        //int numero2;
        //int resultado;
        // System.out.println("Introduce el primer número:");
        // numero1 = scanner.nextInt();
        //System.out.println("Introduce el segundo número:");
        //numero2 = scanner.nextInt();
        //resultado = numero1 + numero2;
        //System.out.println(resultado);

        Scanner scanner = new Scanner(System.in); //scanner object. Que es el system.in?
        final int firstNumber = readFrom(scanner, "Introduce el primer numero");
        final int secondNumber = readFrom(scanner,"Introduce el segundo numero");
        int sum = firstNumber + secondNumber;
        System.out.println("Sum is " + sum);
    }

        private static int readFrom(Scanner scanner, String inputMessage) {
            System.out.println(inputMessage);
            return scanner.nextInt();
        }

}