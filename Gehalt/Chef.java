package Java.Gehalt;

/**
 * Chef
 */
public class Chef extends Manager {

    int chefZulage;

    public Chef(int grundgehalt, int provision, int chefZulage){
        super(grundgehalt, provision);
        this.chefZulage = chefZulage;
    }

    public int gehaltBerechnen(){
        return (super.gehaltBerechnen() + chefZulage);
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