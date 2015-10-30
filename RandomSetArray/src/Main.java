import java.util.Random;

/**
 * Created by Hauch Oleh on 10/28/2015.
 */
public class Main {
    public static void main(String[] args) {
        int [][] array = new int [8][5];
        Random rand = new Random();
        for (int i = 0; i < 8; i++)
            for (int j = 0; j < 5; j++)
                array [i][j] = rand.nextInt(90)+10;
        for (int i = 0;i < 8;i++)
        {
            for (int j = 0;j < 5;j++)
                System.out.print(array[i][j] + " ");
            System.out.println();
        }
    }
}