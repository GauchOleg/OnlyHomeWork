/**
 * Created by Hauch Oleh on 10/28/2015.
 */
public class Main {
    public static void main(String[] args) {
        int [] arr = new int[10];
        int max = 0;
        for(int i = 0; i < 10; i ++){
            arr[i] = i;
            if (arr.length > i){
                max = i;
            }
            System.out.println(arr[i]);
        }
        System.out.println( "Max value array: " + max);
    }

}
