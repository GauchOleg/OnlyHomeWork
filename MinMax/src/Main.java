/**
 * Created by Hauch Oleh on 10/28/2015.
 */
public class Main {
    public static void main(String[] args) {
    double n = 123.45;
    int temp = (int) (n * 100);
    int result;
    int min = 9, max = 0;
    while (temp > 0) {
        result = temp % 10;
        if (result < min) min = result;
        if (result > max) max = result;
        temp /= 10;
        }
    System.out.format("min = %d, max = %d%n", min, max);
    }
}

