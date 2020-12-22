import java.io.*;
import java.lang.reflect.Type;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            try {
                System.out.println("Enter file source");
                String source = scanner.nextLine();

                System.out.println("Enter file des: ");
                String des = scanner.nextLine();

                copyFileBinary(source,des);
                break;
            } catch (Exception e) {
                System.out.println("Retype file source: ");
            }
        }
    }
    public static void copyFileBinary(String source, String des) throws Exception{
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        try {
            File file = new File(source);
            if (!file.exists()){
                System.err.println("File not found");
            }
            File file1 = new File(des);

            fileInputStream = new FileInputStream(file);
            fileOutputStream = new FileOutputStream(file1);

            byte []data = new byte[1024];
            int length;

            while ((length = fileInputStream.read(data)) != -1){
                fileOutputStream.write(data,0,length);
            }

        } catch (FileNotFoundException e) {
//            e.printStackTrace();
        }
        finally {
            fileInputStream.close();
            fileOutputStream.close();
        }
    }
}
