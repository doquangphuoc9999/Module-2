import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter file source: ");
            String source = scanner.nextLine();

            System.out.println("Enter file deserting: ");
            String des = scanner.nextLine();

            coppyFile(source,des);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void coppyFile(String source, String des) throws Exception{
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        try {
            File file = new File(source);
            if (!file.exists()){
                System.err.println("File not exists");
            }
            File file1 = new File(des);
            fileInputStream = new FileInputStream(file);
            fileOutputStream = new FileOutputStream(file1);

            byte []buffer = new byte[1024];
            int length;
            while ((length = fileInputStream.read(buffer)) != -1){
                fileOutputStream.write(buffer,0,length);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            fileInputStream.close();
            fileOutputStream.close();
        }
    }

}
