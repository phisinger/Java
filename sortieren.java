import java.util.Random;


public class sortieren{

    public static void main(String[] args){
        int[] unsortiert = randomlist(10);
        int[] sortiert = bubblesort(unsortiert);
        System.out.println("\nSortiert mit bubblesort:\n");
        for (int z = 0; z<=10; z++)
        {
            System.out.println(sortiert[z]);
        }

        sortiert = quicksort(unsortiert, 0, (unsortiert.length - 1));
        System.out.println("\n Sortiert mit Quicksort:\n");
        for (int z = 0; z<=10; z++)
        {
            System.out.println(sortiert[z]);
        }
    }

    public static int[] randomlist(int length){
        Random rand = new Random();
        int[] unsortiert = new int[length+1];
        System.out.println("\nUnsortiert:\n");
        for (int x = 0; x<=length; x++){
            unsortiert[x] = rand.nextInt(); 
            System.out.println(unsortiert[x]);
        }

        return(unsortiert);
    }
    
    public static int[] bubblesort(int[] sortiert){
        int getauscht = 1;
        while(getauscht == 1)
        {
            getauscht = 0;
            for (int y = 0; y<=9; y++)
            {
                if(sortiert[y] > sortiert[(y+1)]){
                    getauscht = 1;
                    int platz = sortiert[y];
                    sortiert[y] = sortiert[(y+1)];
                    sortiert[(y+1)] = platz;
                }
            }
        }
        return(sortiert);
    }

    public static int[] quicksort(int[] sortiert, int links, int rechts){
        int ili = links;
        int ire = rechts;
        int med = (links + rechts)/2;


        while(ili < ire){
            while(sortiert[ili] < sortiert[med]){
                ili = ili + 1;
            }
            while(sortiert[ire] > sortiert[med]){
                ire = ire - 1;
            }

            int platz = sortiert[ili];
            sortiert[ili] = sortiert[ire];
            sortiert[ire] = platz;

            if(ili == med){
                med = ire;
            } else{
                if(ire == med){
                    med = ili;
                } 
            }
            if(ili < med){
                ili = ili +1;
            }
            if(ire > med){
                ire = ire -1;
            }
        }

        if(links < med-1){
            quicksort(sortiert, links, med-1);
        }
        if(rechts > med+1){
            quicksort(sortiert, med+1, rechts);
        }
    return(sortiert);
    }
}