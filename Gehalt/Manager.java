package Java.Gehalt;

/**
 * Manager
 */
public class Manager extends Mitarbeiter{

    int provision;
    int grundgehalt;

    public Manager(int grundgehalt, int provision){
        this.grundgehalt = grundgehalt;
        this.provision = provision;
    }

    public int gehaltBerechnen(){
        return (grundgehalt + (provision/100) * getUmsatz());
    }

    public int getProvision() {
        return provision;
    }

    public void setProvision(int provision) {
        this.provision = provision;
    }

    public int getGrundgehalt() {
        return grundgehalt;
    }

    public void setGrundgehalt(int grundgehalt) {
        this.grundgehalt = grundgehalt;
    }
    
    
}