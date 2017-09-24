import java.util.Scanner;

import static java.lang.Math.sqrt;

public class HjemmeOpgaver_2_2 {
    public static void main(String[] args) {
        //Opgave 2.2
        //Volume of a triangle
        //Scanner efter bruger input
        System.out.print("Length of sides: ");
        Scanner scanLength = new Scanner(System.in);
        //Opløfter i 2, til at udregne area:
        double length = scanLength.nextDouble();
        double squared = Math.pow(length, 2);
        //Udregner area:
        double area = sqrt(3) / 4 * squared;
        System.out.println("Area: " + area);
        //Udregner volume:
        double volume = area * length;
        System.out.println("Volume: " + volume);

        /*Jeg får ikke det samme svar, som i bogen når jeg indtaster 3,5*/
    }
}
