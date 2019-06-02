package Java.Gehalt;

/**
 * Angestellter
 */
public class Angestellter extends Mitarbeiter {

    int grundgehalt;
    int zulagen;

    public Angestellter(int grundgehalt, int zulage){
        this.grundgehalt = grundgehalt;
        this.zulagen = zulage;
    }

    public int gehaltBerechnen(){
        return (grundgehalt + zulagen);
    }

    public int getGrundgehalt() {
        return grundgehalt;
    }

    public void setGrundgehalt(int grundgehalt) {
        this.grundgehalt = grundgehalt;
    }

    public int getZulagen() {
        return zulagen;
    }

    public void setZulagen(int zulagen) {
        this.zulagen = zulagen;
    }
}