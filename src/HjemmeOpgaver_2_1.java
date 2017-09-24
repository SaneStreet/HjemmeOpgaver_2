import java.util.Scanner;

import static java.lang.Math.sqrt;

public class HjemmeOpgaver_2_1 {
    public static void main(String[] args) {
        //Opgave 2.1
        //Convert miles to kilometre
        //Scanner efter bruger input, og udskriver antal valgte mil:
        System.out.print("Indtast Mil: ");
        Scanner scanMil = new Scanner(System.in);
        double miles = scanMil.nextDouble();
        System.out.println("Mil valgt: " + miles);
        //Udregner hvor mange kilometer det valgte mil er:
        double kilometreRes = miles * 1.6;
        System.out.println(miles + " mil, er " + kilometreRes + " kilometer.");

    }
}
