/**
 * Created by Hauch Oleh on 10/28/2015.
 */
public class Main {
    public static void main(String[] args) {
        int[] ar = new int[22];
        for (int i = 1; i < ar.length; i++)
            if (i % 2 == 0){
                ar[i] = i;
                System.out.print(ar[i] + " ");
            }

    }
}
