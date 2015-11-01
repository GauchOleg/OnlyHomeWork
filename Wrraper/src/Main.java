

/**
 * Created by Oleg on 01.11.2015.
 */
public class Main {

    public static void main(String[] args) {
        NumberWrapper point = new NumberWrapper(7);
        Integer[] arr;
        arr = point.getArr();

        for(int i = 0; i < arr.length; i++){
            System.out.print(" " + arr[i]);

        }
        System.out.println();

        point.add(5);
        point.add(5);
        point.add(5);
        point.add(5);
        arr = point.getArr();

        for(int i = 0; i < arr.length; i++){
            System.out.print(" " + arr[i]);

        }
        System.out.println();

        point.remove(1);
        arr = point.getArr();

        for(int i = 0; i < arr.length; i++){
            System.out.print(" " + arr[i]);

        }

        System.out.println();

        point.removeValue(5);
        arr = point.getArr();

        for(int i = 0; i < arr.length; i++){
            System.out.print(" " + arr[i]);

        }

        System.out.println();
        arr = point.getArr();

        System.out.println("Max element :  " + point.max());
        System.out.println("Min element :  " + point.min());
        System.out.println("avg value : " + point.avg());




    }
}