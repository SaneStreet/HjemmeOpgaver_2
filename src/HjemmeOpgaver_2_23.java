import java.util.Scanner;

public class HjemmeOpgaver_2_23 {
    public static void main(String[] args) {
        //Opgave 2.23
        //Cost of driving
        System.out.print("Indtast kørelængden i KM: ");
        Scanner scanner = new Scanner(System.in);
        double afstand = scanner.nextDouble();
        System.out.print("Indtast km/l: ");
        double kml = scanner.nextDouble();
        System.out.print("Indtast pris (DKK) per. liter: ");
        double literDKK = scanner.nextDouble();

        double totalPris = (afstand/kml) * literDKK;
        System.out.println("Prisen for din rejse: " + totalPris + " dkk.");
    }
}
