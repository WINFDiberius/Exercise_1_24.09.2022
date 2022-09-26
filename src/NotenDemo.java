public class NotenDemo {
    public static void main(String[] args) {

        System.out.println(getNotentext(2000));
        System.out.println(getNotentext(-3));
        System.out.println(getNotentext(2));
        System.out.println(getNotentext(63));
        System.out.println(getNotentext(66));
        System.out.println(getNotentext(78));
        System.out.println(getNotentext(99));
    }

    public static String getNotentext(int punkte)
    {
        if(punkte >= 0 && punkte <= 50)
        {
            return "Ungenügend";
        }
        else if (punkte >= 51 && punkte <= 64)
        {
            return "Genügend";
        }
        else if (punkte >= 65 && punkte <= 77)
        {
            return "Befriedigend";
        }
        else if (punkte >= 78 && punkte <= 89)
        {
            return "Gut";
        }
        else if (punkte >= 90 && punkte <= 100)
        {
            return "Sehr Gut";
        }
        else
        {
            return "Falsche Eingabe";
        }

    }
}
