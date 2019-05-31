package Java.Gehalt;

/**
 * Angestellter
 */
public class Angestellter extends Mitarbeiter {

    int grundgehalt;
    int zulagen;

    public void Angestellter(int g, int z){
        this.grundgehalt = g;
        this.zulagen = z;
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