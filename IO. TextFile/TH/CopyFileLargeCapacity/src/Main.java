import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter file source: ");
            String source = scanner.nextLine();

            System.out.println("Enter file deserting: ");
            String des = scanner.nextLine();

            File fileSource = new File(source);
            File fileDes = new File(des);

            copyFileStream(fileSource,fileDes);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static void copyFileStream(File source, File des) throws Exception{
        InputStream inputStream = null;
        OutputStream outputStream = null;

        try {
            inputStream = new FileInputStream(source);
            outputStream = new FileOutputStream(des);

            byte[] data = new byte[1024];

            int length;

            while ((length = inputStream.read(data))>0){
                outputStream.write(data,0,length);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            inputStream.close();
            outputStream.close();
        }
    }
}
