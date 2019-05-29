public class quadrat extends rechteck{

    private int breite;

    public quadrat(){
        super(5, 5); 
    }

    public quadrat(int a){
        super(a, a);
    }

    public static void main(String args[]){
        quadrat quad1 = new quadrat();
        quadrat quad2 = new quadrat(9);
    }

    public int getBreite() {
        return breite;
    }

    public void setBreite(int breite) {
        this.breite = breite;
    }


}