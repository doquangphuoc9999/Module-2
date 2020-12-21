import java.io.*;

public class CheckFile {
    public void readFileText(String pathFile){
        try {
            File file = new File(pathFile);

//          Ktra file co ton tai hay k
            if (!file.exists()){
                throw new FileNotFoundException();
            }

//          tao bien sum va string de doc file va tinh tong

            String line = "";
            int sum = 0;
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

            while ((line = bufferedReader.readLine())!= null){
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
//          dong file
            bufferedReader.close();

            System.out.println("Sum: " + sum);


        } catch (FileNotFoundException e) {
            System.err.println("File khong ton tai");;
        } catch (IOException e) {
            System.err.println("File ban phai la String");;
        }
    }
}
