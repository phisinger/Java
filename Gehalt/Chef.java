package Java.Gehalt;

/**
 * Chef
 */
public class Chef extends Mitarbeiter {

    int provision;
    int grundgehalt;
    int chefZulage;

    public Chef(int grundgehalt, int provision, int chefZulage){
        this.grundgehalt = grundgehalt;
        this.provision = provision;
        this.chefZulage = chefZulage;
    }

    public int gehaltBerechnen(){
        return (grundgehalt + (provision/100) * getUmsatz() + chefZulage);
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

    public int getChefZulage() {
        return chefZulage;
    }

    public void setChefZulage(int chefZulage) {
        this.chefZulage = chefZulage;
    }
    
}