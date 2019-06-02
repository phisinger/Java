package Java.Gehalt;

/**
 * Arbeiter
 */
public class Arbeiter extends Mitarbeiter{

    int stundenlohn;
    int arbeitszeit;

    public Arbeiter(int stundenlohn, int arbeitszeit) {
        this.stundenlohn = stundenlohn;
        this.arbeitszeit = arbeitszeit;
    }

    public int gehaltBerechnen(){
        return (stundenlohn * arbeitszeit);
    }

    public int getStundenlohn() {
        return stundenlohn;
    }

    public void setStundenlohn(int stundenlohn) {
        this.stundenlohn = stundenlohn;
    }

    public int getArbeitszeit() {
        return arbeitszeit;
    }

    public void setArbeitszeit(int arbeitszeit) {
        this.arbeitszeit = arbeitszeit;
    }

    


    
}