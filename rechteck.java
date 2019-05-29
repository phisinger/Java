
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

    public int getBreite() {
        return breite;
    }

    public void setBreite(int breite) {
        this.breite = breite;
    }

    public int getLaenge() {
        return laenge;
    }

    public void setLaenge(int laenge) {
        this.laenge = laenge;
    }

}