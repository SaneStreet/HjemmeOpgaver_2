import java.util.Scanner;

public class HjemmeOpgaver_2_3 {
    public static void main(String[] args) {
        //Opgave 2.3
        //Convert meters to feet
        //Scanner efter bruger input, og udskriver antal valgte mil:
        System.out.print("Indtast Meter: ");
        Scanner scanMeter = new Scanner(System.in);
        double meter = scanMeter.nextDouble();
        System.out.println("Meter valgt: " + meter);
        //Udregner hvor mange feet det valgte meter er:
        double feetRes = meter * 3.2786;
        System.out.println(meter + " meter, er " + feetRes + " feet.");
    }
}
