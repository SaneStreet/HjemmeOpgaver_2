import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class HjemmeOpgaver_2_8 {
    public static void main(String[] args) {
        //Opgave 2.8
        //Show current time
        System.out.print("Write time zone offset to GMT: ");
        Scanner scanTimezone = new Scanner(System.in);
        double timezone = scanTimezone.nextDouble();

        Date currentTime = new Date();

        SimpleDateFormat format  = new SimpleDateFormat("EEE, MMM d, yyyy hh:mm:ss a z");

        // Give it to me in GMT time.
        format.setTimeZone(TimeZone.getTimeZone("GMT"));
        System.out.println("GMT time: " + format.format(currentTime));
        /*Kan ikke helt finde ud af hvad jeg skal gøre*/
    }
}
