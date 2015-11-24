import java.io.*;
import java.util.Arrays;

/**
 * Created by Oleg on 23.11.2015.
 */
public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Oleg\\ForProgram\\start.txt"));
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            int count = 0;
            while (line != null) {
                sb.append(line);
                line = br.readLine();
                count++;
            }
            br.close();
            BufferedReader brr = new BufferedReader(new FileReader("C:\\Users\\Oleg\\ForProgram\\start.txt"));

            String arrey[] = new String[count];
            for (int i = 0; i < arrey.length; i++){
                arrey[i] = brr.readLine();

            }
//            System.out.println(Arrays.deepToString(arrey));
            for (int i = 0; i < arrey.length; i++){
                for (int j = 0; j < arrey.length-1; j++){
                    if (arrey[j].length() > arrey[j+1].length()){
                        String h;
                        h = arrey[j];
                        arrey[j] = arrey[j+1];
                        arrey[j+1]= h;
                    }

                }

            }
            System.out.println(Arrays.deepToString(arrey));

            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Oleg\\ForProgram\\Finish.txt"));
            for (int i = 0; i <arrey.length; i++){
                bw.append(arrey[i]);
                bw.newLine();
            }
            bw.close();





            String everything = sb.toString();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            br.close();
        }

        System.out.println();

    }
}
