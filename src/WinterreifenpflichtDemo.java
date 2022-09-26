public class WinterreifenpflichtDemo {
    public static void main(String[] args) {


        String winterOn = "Bitte Winterreifen verwenden";
        String winterOff = "Winterreifen sind nicht erforderlich";

        if(isWinterreifenPflicht(8,true))
        {
            System.out.println(winterOn);
        }
        else
        {
            System.out.println(winterOff);
        }

        if(isWinterreifenPflicht(8,false))
        {
            System.out.println(winterOn);
        }
        else
        {
            System.out.println(winterOff);
        }

        if(isWinterreifenPflicht(4,false))
        {
            System.out.println(winterOn);
        }
        else
        {
            System.out.println(winterOff);
        }

        if(isWinterreifenPflicht(3,true))
        {
            System.out.println(winterOn);
        }
        else
        {
            System.out.println(winterOff);
        }

        if(isWinterreifenPflicht(3,false))
        {
            System.out.println(winterOn);
        }
        else
        {
            System.out.println(winterOff);
        }

        if(isWinterreifenPflicht(12,true))
        {
            System.out.println(winterOn);
        }
        else
        {
            System.out.println(winterOff);
        }

        System.out.println();

        isWinterreifenPflichtText(8,true);
        isWinterreifenPflichtText(8,false);
        isWinterreifenPflichtText(4,false);
        isWinterreifenPflichtText(3,true);
        isWinterreifenPflichtText(3,false);
        isWinterreifenPflichtText(12,true);
    }

    //Es wird ermittelt ob Ture / False... Ausgabe wird in der Main Methode festgelegt
    public static boolean isWinterreifenPflicht(int temperatur, boolean rutschigeFahrbahn)
    {
        if((temperatur < 10 && rutschigeFahrbahn == true) || temperatur < 4)
        {
            return true;
        }

        else
        {
            return false;
        }
    }

    //Es wird ermittelt ob True / False und die Ausgabe wird bereits hier festgelegt
    public static boolean isWinterreifenPflichtText(int temperatur, boolean rutschigeFahrbahn)
    {
        if((temperatur < 10 && rutschigeFahrbahn == true) || temperatur < 4)
        {
            System.out.println("Bitte Winterreifen verwenden");
            return true;
        }

        else
        {
            System.out.println("Winterreifen sind nicht erforderlich");
            return false;
        }
    }
}
