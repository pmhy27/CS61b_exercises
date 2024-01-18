import java.lang.reflect.Array;
import java.util.Arrays;

public class Sort {
    public static String[] sort(String[] x){
        for (int i = 0; i < x.length; i+=1){
            int smallestIndex = findSmallest(x);
            if (smallestIndex > i){
                swap(x,i,smallestIndex);
            }
        }
        return x;
    }

    public static int findSmallest(String[] x){
        int smallestIndex = 0;
        for(int i = 0;i < x.length; i+=1){
            int cmp = x[i].compareTo(x[smallestIndex]);
            if (cmp < 0){
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

/**    Swap item a with b */
    public static String[] swap(String[]x, int a, int b ){
        String temp = x[a];
        x[a] = x[b];
        x[b] = temp;
        return x;
    }

    public static void main(String[] args) {
    }
}