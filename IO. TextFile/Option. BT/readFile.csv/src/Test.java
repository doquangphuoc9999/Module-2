import java.io.*;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader("readFIveCsv.TXT");
            bufferedReader = new BufferedReader(fileReader);

            String str;
            while ((str = bufferedReader.readLine()) != null){
                String st[] = str.split(",");
                System.out.println(st[4] + st[5]);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
