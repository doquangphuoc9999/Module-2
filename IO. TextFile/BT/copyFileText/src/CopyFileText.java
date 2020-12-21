import java.io.*;

public class CopyFileText {
    public static void main(String[] args){
        try {
            FileReader fileReader = new FileReader("input.TxT");
            FileWriter fileWriter = new FileWriter("ouput.TxT");

            BufferedReader bufferedReader = new BufferedReader(fileReader);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            String chep;

            while ((chep = bufferedReader.readLine()) != null){
                bufferedWriter.write(chep);
            }
            bufferedReader.close();
            bufferedWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
