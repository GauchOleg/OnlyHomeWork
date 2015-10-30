/**
 * Created by Hauch Oleh on 10/28/2015.
 */
public class Main {
    public static void main(String[] args) {
            double n = 123.45;
            int temp = (int) (n * 100), sum = 0;
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }
            System.out.println(sum);
        }
    }

