import java.util.Random;

/**
 * Created by Hauch Oleh on 10/28/2015.
 */
public class Main {
    public void main(String[] args) {
        int [] countArray = new int [20];
        int temp = 0;

            for (int i = 0; i < 20; i++) {
                Random ob = new Random();
                int num = ob.nextInt(20);
                countArray[i] = num;
                System.out.println(countArray[i] + " ");
            }
            for (int i = 0; i < 20; i++){
                if(countArray[i] == 0) temp = temp + 1;
            }
            System.out.println("Колличество нулевых в массиве: "  + temp);
        }
    }

