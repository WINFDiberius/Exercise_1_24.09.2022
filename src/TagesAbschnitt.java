import java.text.SimpleDateFormat;
import java.time.Clock;
import java.time.LocalTime;
import java.util.Date;

public class TagesAbschnitt {
    public static void main(String[] args) {

        //Gibt mir die aktuelle Zeit
        LocalTime current = LocalTime.now();


        //Gibt mir meine spezifischen Zeiten
        LocalTime six = LocalTime.parse( "06:00" );
        LocalTime nine = LocalTime.parse( "09:00" );
        LocalTime twelve = LocalTime.parse( "12:00" );
        LocalTime sixteen = LocalTime.parse( "16:00" );
        LocalTime twenty = LocalTime.parse( "20:00" );

        //Vergleicht, ob es genau diese Uhrzeit ist
        Boolean isSix = current.equals(six);
        Boolean isNine = current.equals(nine);
        Boolean isTwelve = current.equals(twelve);
        Boolean isSixteen = current.equals(sixteen);
        //Boolean isTwenty = current.equals(twenty);

        //Vergleicht, ob es nach dieser Uhrzeit ist
        Boolean postSix = current.isAfter(six);
        Boolean postNine = current.isAfter(nine);
        Boolean postTwelve = current.isAfter(twelve);
        Boolean postSixteen = current.isAfter(sixteen);
        //Boolean postTwenty = current.isAfter(twenty);

        //Vergleicht, ob es vor dieser Uhrzeit ist
        //Boolean preSix = current.isBefore(six);
        Boolean preNine = current.isBefore(nine);
        Boolean preTwelve = current.isBefore(twelve);
        Boolean preSixteen = current.isBefore(sixteen);
        Boolean preTwenty = current.isBefore(twenty);

        //Gibt mir ein schöneres Format der aktuellen Zeit
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");

        if(postSix && preNine || isSix)
        {
            System.out.println("Es ist " + sdf.format(new Date()) + " Das ist noch sehr früh!");
        }
        else if(postNine && preTwelve || isNine)
        {
            System.out.println("Es ist " + sdf.format(new Date()) + " vormittags!");
        }
        else if(postTwelve && preSixteen || isTwelve)
        {
            System.out.println("Es ist " + sdf.format(new Date()) + " nachmittags!");
        }
        else if(postSixteen && preTwenty || isSixteen)
        {
            System.out.println("Es ist " + sdf.format(new Date()) + " abends!");
        }
        else
        {
            System.out.println("Es ist " + sdf.format(new Date()) + " nachts!");
        }


        int currentTime = 6;

        if(currentTime >= 6 && currentTime < 9) {
            System.out.println("Es ist noch sehr früh!");
        }

        else if(currentTime >= 9 && currentTime < 12)
        {
            System.out.println("Es ist Vormittag!");
        }
        else if(currentTime >= 12 && currentTime < 16)
        {
            System.out.println("Es ist Nachmittag!");
        }
        else if(currentTime >= 16 && currentTime < 20)
        {
            System.out.println("Es ist Abend!");
        }
        else
        {
            System.out.println("Es ist Nacht!");
        }
    }
}
