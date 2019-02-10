package internal.second.bad;

import java.util.Scanner;

public class Addition {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //System.in is the entry to obtain input from the command window
        System.out.print("Enter first number: "); //prompt (=the computer is ready to accept input)
        int i1 = scanner.nextInt(); //read internal.first number from user. Error YAGNI: you ain't gonna need it

        System.out.print("Enter second number: "); //prompt
        int i2 = scanner.nextInt(); //read internal.second number from user

        int i3 = i1 + i2;

        System.out.println("sum is " + i3); //display sum
    }


}