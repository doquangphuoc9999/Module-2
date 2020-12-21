import java.io.*;
import java.util.Scanner;

public class ReadFileExample{
    public static void main(String[] args) {
        CheckFile checkFile = new CheckFile();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter path file");
        String pathFile = scanner.nextLine();

        checkFile.readFileText(pathFile);
    }
}


