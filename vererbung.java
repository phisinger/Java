package Java;

/**
 * vererbung
 */
public class vererbung {

    protected int z = 9;

    public vererbung(){
        int z = 6;
        System.out.println(z);
        z = this.z;
        printInt(z);
    }

    protected void printInt(int z){
        System.out.println(z *2);
    }

    protected void printInt(){
        System.out.println(this.z);
    }

    
}