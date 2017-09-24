import java.util.Scanner;

public class HjemmeOpgaver_2_15 {
    public static void main(String[] args) {
        //Opgave 2.15
        //Geometry: Distance of two points
        //Sanner efter brugers input til x1 og y1:
        System.out.print("Indtast x1 og y1: ");
        Scanner scanXY_1 = new Scanner(System.in);
        double x1 = scanXY_1.nextDouble();
        double y1 = scanXY_1.nextDouble();
        //Scanner efter brugers input til x2 og y2:
        System.out.print("Nu, indtast x2 og y2: ");
        double x2 = scanXY_1.nextDouble();
        double y2 = scanXY_1.nextDouble();
        //Udregner afstanden mellem punkterne:
        double udenKvadrat = Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2);
        double medKvadrat = Math.pow(udenKvadrat, 0.5);
        //Udskriver resultatet:
        System.out.println("Afstanden mellem de to punkter er: " + medKvadrat);
    }
}
