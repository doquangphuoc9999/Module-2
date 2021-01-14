import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class JsonExample {
    Gson gson = new GsonBuilder().setPrettyPrinting().create();

//  ghi file

    public void writeFileJson(){
        try (FileWriter fileWriter = new FileWriter("File.Json")){
            gson.toJson(ManageStudent.students,fileWriter);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//   đọc file

    public void readFileJson(){
        try (Reader reader = new FileReader("File.Json")){
            Type type = new TypeToken<ArrayList<Student>>(){}.getType();

            ManageStudent.students = gson.fromJson(reader,type);

            if (ManageStudent.students == null){
                ManageStudent.students = new ArrayList<>();
            }
            else {
                int max = -1;
                for (Student student : ManageStudent.students){
                    if (student.getId() > max){
                        max = student.getId();
                    }
                }
                ManageStudent.id = max+1;
            }
        } catch (Exception e) {
            ManageStudent.students = new ArrayList<>();
        }
    }
}
