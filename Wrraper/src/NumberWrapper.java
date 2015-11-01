import java.util.Random;

/**
 * Created by Oleg on 01.11.2015.
 */
public class NumberWrapper {

    public Integer[] getArr() {
        return arr;
    }

    private Integer[] arr;

    /**
     * Constructor initialization array
     */
    public NumberWrapper(int initalLenght) {

        if(initalLenght <= 0)
        {
            throw new IllegalArgumentException("Lenght cannot be less than 0 or 0");
        }
        this.arr = new Integer[initalLenght];

        for(int i = 0 ; i < arr.length ; i++)
        {
            Random r = new Random();
            arr[i] = r.nextInt(10);
        }
    }

    /**
     * Method push element to end array
     */
    public void add(Integer element) {

        Integer[] mass = new Integer[arr.length + 1];
        for(int j = 0; j < arr.length ; j++){
            mass[j] = arr[j];
        }
        mass[mass.length - 1] = element;
        arr = mass;

    }

    /**
     * Method will remove set element from an array
     */
    public void remove(Integer position) {
        Integer[] mass = new Integer[arr.length - 1];
        for(int j = 0, i = 0 ; j < arr.length ; j++ , i++) {

            if( j == position) j = j + 1;
            else j = j;
            mass[i] = arr[j];

        }

        arr = mass;
    }

    /**
     * Method will remove elements witch set value.
     */
    public void removeValue(Integer value) {

        int count = 0;
        for(int i = 0; i < arr.length - 1; i++)
        {
            if(arr[i] == value) count++;
        }

        Integer[] mass1 = new Integer[arr.length - 1 - count];

        for(int i = 0, j = 0; i < arr.length ; i++)
        {
            if(arr[i] == value) continue;
            mass1[j] = arr[i];
            j++;
        }
        arr = mass1;
    }

    /**
     * Return max element array
     */
    public int max(){
        int max = -1;
        for(int i = 0 ; i < arr.length ; i++) {
            if(arr[i] > max) max = arr[i];
            else max = max ;
        }
        return max;
    }

    /**
     * Return min element array
     */
    public int min() {
        int min = 11;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
            else min = min;
        }
        return min;
    }

    /**
     * Return middle value elements
     */
    public double avg() {
        double avg = 0;
        for (int i = 0; i < arr.length; i++) {
            avg = avg +  arr[i];
        }
        return avg / arr.length;
    }

}


