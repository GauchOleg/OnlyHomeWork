import java.util.Random;

/**
 * Created by Hauch Oleh on 10/28/2015.
 */
public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        int n = r.nextInt(1000) + 1;
        System.out.println(" ");
        int[][] arr = new int[10][n];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < n; j++) {
                arr [i][j] = r.nextInt(1000)+1;
                System.out.print(arr[i][j] + "| ");
                System.out.print("|");
            }

        }
        System.out.print("\r\n" + "This is dinamic array") ;
    }
}
