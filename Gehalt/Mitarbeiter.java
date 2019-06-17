package Gehalt;

import java.util.Date;

/**
 * Mitarbeiter
 */
public abstract class Mitarbeiter {

    int personalnummer;
    String name;
    String adresse;
    Date geburtstag;


    int umsatz = 500000;

    public abstract int gehaltBerechnen();


    public int getPersonalnummer() {
        return personalnummer;
    }

    public void setPersonalnummer(int personalnummer) {
        this.personalnummer = personalnummer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Date getGeburtstag() {
        return geburtstag;
    }

    public void setGeburtstag(Date geburtstag) {
        this.geburtstag = geburtstag;
    }

    public int getUmsatz() {
        return umsatz;
    }

    public void setUmsatz(int umsatz) {
        this.umsatz = umsatz;
    }
    
    
}