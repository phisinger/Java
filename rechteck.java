
public class rechteck {
    
    private int breite;
    private int laenge;

    public rechteck(){
        breite = 10;
        laenge = 7;
        System.out.println(breite);
        System.out.println(laenge);
        System.out.println("--");
    }

    
    public rechteck(int a, int b){
        breite = a;
        laenge = b;
        System.out.println(breite);
        System.out.println(laenge);
        System.out.println("--");
   }


     public static void main(String args[]){
       rechteck recht = new rechteck();
       rechteck recht2 = new rechteck(3, 8);
   }

    /**
     * @return the breite
     */
    public int getBreite() {
        return breite;
    }

    /**
     * @return the laenge
     */
    public int getLaenge() {
        return laenge;
    }

    /**
     * @param breite the breite to set
     */
    public void setBreite(int breite) {
        this.breite = breite;
    }

    /**
     * @param laenge the laenge to set
     */
    public void setLaenge(int laenge) {
        this.laenge = laenge;
    }

}