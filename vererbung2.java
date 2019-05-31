package Java;

/**
 * vererbung2
 */
public class vererbung2 extends vererbung {

    private int z = 3;

    public vererbung2() {
        int z = 5;
        printInt();
        printInt(z);
    }

    
    protected void printInt() {
        System.out.println(z+4);
    }

    public static void main(String[] args) {
        new vererbung2();
    }
}