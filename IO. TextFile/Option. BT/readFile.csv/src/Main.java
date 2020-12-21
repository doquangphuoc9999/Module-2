import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = null;
        try {
            FileReader fileReader = new FileReader("readFiveCsv.TxT");
            bufferedReader = new BufferedReader(fileReader);

            String str;

            String split = ",";

            while ((str = bufferedReader.readLine()) != null) {
                String[] data = str.split(split);
                System.out.println(Arrays.toString(data));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            bufferedReader.close();
        }

    }
}

