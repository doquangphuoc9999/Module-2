import java.io.*;
import java.util.Scanner;

public class CopyFileText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter file source: ");
            String source = scanner.nextLine();

            System.out.println("Enter file des: ");
            String des = scanner.nextLine();

            coppyFile(source,des);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void coppyFile(String source , String des) {
        FileReader fr = null;
        FileWriter fw = null;

        try {
            fr = new FileReader(source);
            fw = new FileWriter(des);

            int str;
            while ((str = fr.read())!= -1){
                fw.write(str);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
