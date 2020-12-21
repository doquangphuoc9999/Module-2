import java.io.File;

public class Test {
    public static void main(String[] args) {
        File file = new File("test.TxT");

        File dir = new File("Book");
        dir.mkdir();

        if (dir.isDirectory()){
            String []dirContents = dir.list();

            for (int i = 0; i < dirContents.length; i++){
                System.out.println(dirContents[i]);
            }
        }

        System.out.println(dir.getAbsoluteFile());

        
        boolean isDeleted = file.delete();
    }
}
