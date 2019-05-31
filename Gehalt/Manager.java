package Java.Gehalt;

/**
 * Manager
 */
public class Manager extends Mitarbeiter{

    int provision;
    int grundgehalt;

    public void Manager(int grundgehalt, int provision){
        this.grundgehalt = grundgehalt;
        this.provision = provision;
    }

    public int gehaltBerechnen(){
        return (grundgehalt + (provision/100) * getUmsatz());
    }

    
}