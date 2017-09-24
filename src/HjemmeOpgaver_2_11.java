import java.util.Scanner;

public class HjemmeOpgaver_2_11 {
    public static void main(String[] args) {
        //Scanner efter bruger input
        System.out.print("Enter years: ");
        Scanner scanYears = new Scanner(System.in);
        int years = scanYears.nextInt();
        //1 year in seconds = 31 556 926
        //1 birth every 7 secs.
        int totalBirthPerYear = 31556926/7;
        //1 death every 13 secs.
        int totalDeathPerYear = 31556926/13;
        //1 immigrant every 45 secs.
        int totalImmiPerYear = 31556926/45;
        //udregner antal mennesker der er tilføjet på antal år
        int totalIncreasePerYear = ((totalBirthPerYear+totalImmiPerYear)-totalDeathPerYear)* years;
        System.out.println("Amount of people increased in " + years + " years: " + totalIncreasePerYear + ".");
    }
}
