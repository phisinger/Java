package Java.Gehalt;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * GehaltBerechnen
 */
public class GehaltBerechnen {

    public static void main(String[] args) {

        Arbeiter aMitarbeiter = new Arbeiter(10, 40);
        Angestellter bMitarbeiter = new Angestellter(5000, 300 );
        Manager dManager = new Manager(7500, 35);
        Chef cMitarbeiter = new Chef(10000, 50, 2000);

        float Lohn = aMitarbeiter.gehaltBerechnen();
        float Gehalt = bMitarbeiter.gehaltBerechnen();
        float bGehalt = cMitarbeiter.gehaltBerechnen();
        float dGehalt = dManager.gehaltBerechnen();

        System.out.println("Arbeiter: " + Lohn + " Angestellter: " + Gehalt +" Manager" + dGehalt + " Geschaeftsfuehrer: " + bGehalt);

        float[] kosten = new float[4];
        kosten[0] = aMitarbeiter.gehaltBerechnen();
        kosten[1]  = bMitarbeiter.gehaltBerechnen();
        kosten[2] = cMitarbeiter.gehaltBerechnen();
        kosten[3] = dManager.gehaltBerechnen();

        System.out.println(Arrays.toString(kosten));

        float sum = 0;
        for (float i : kosten)
            sum += i;
        System.out.println("Die Gesamtkosten betragen sich auf " + sum);

    }
}