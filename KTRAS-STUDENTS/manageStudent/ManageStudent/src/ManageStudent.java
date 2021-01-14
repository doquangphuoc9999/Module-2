

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ManageStudent {

    static ArrayList<Student> students = new ArrayList<>();
    static ArrayList<Student> tempStudent = new ArrayList<>();
    static JsonExample jsonExample = new JsonExample();
    static int id = 1;

    CheckValidate checkValidate = new CheckValidate();
    PrintMenu printMenu = new PrintMenu();
    Student student=new Student();
//    SearchAndPrintStudent searchAndPrintStudent = new SearchAndPrintStudent();

    static {
        jsonExample.readFileJson();
    }

    public void Menu(){
        printMenu.menu();
        int num = checkValidate.checkNumber("Nhập lựa chọn của bạn: ");

        switch (num){
            case 1:
                SeeList();
                break;
            case 2:
                addStudent();
                break;
            case 3:
                editProfile();
                break;
            case 4:
                removeStudent();
                break;
            case 5:
                enterScore();
                break;
            case 6:
                editScore();
                break;
            case 7:
               sortStudent();
                break;
            case 8:
                System.exit(0);
                break;
        }
        jsonExample.writeFileJson();
    }


//  xem danh sách học viên
    public void SeeList(){

        if (students.size()==0){
            System.out.println("Không có học viên nào cả");
        }else {
            student.printTilte();
            Collections.sort(students, new Comparator<Student>() {
                @Override
                public int compare(Student o1, Student o2) {
                    return  o1.getId() < o2.getId() ? -1 : 1;
                }
            });
            for (Student st : students){
                st.printStudent();
            }
        }
    }


//  thêm học viên

    public void addStudent(){
        System.out.println("Thêm học viên");
        String name = checkValidate.checkName("Nhập tên học viên: ");
        System.out.println("Nhập ngày tháng năm sinh học viên: ");
        String age = checkValidate.ValidateAge("YY-YY-YYYY");
        String gender = checkValidate.gender("Nhập giới tính của bạn: ");

        Student student = new Student(id++,name,age,gender);
        students.add(student);
//        student.setMedium();
    }

//  tìm học viên bằng tên

    public Student findName(String name){
        for (Student student : students){
            if (student.getName().contains(name)){
                return student;
            }
        }

        return null;
    }

//    edit điểm của hàm sửa
    public void compact(String name){
        Student editStudents = findName(name);
        if (student.enterScore1 == true || student.enterScore2 == true || student.enterScore3 == true || student.enterScore4 == true){
            double editScore1 = checkValidate.ValidateScore("Nhập hệ số 1: ");
            double editScore2 = checkValidate.ValidateScore("Nhập hệ số 2: ");
            double editScore3 = checkValidate.ValidateScore("Nhập hệ số 3: ");
            double editScore4 = checkValidate.ValidateScore("Nhập hệ số 4: ");

            editStudents.setScore1(editScore1);
            editStudents.setScore2(editScore2);
            editStudents.setScore3(editScore3);
            editStudents.setScore4(editScore4);
        }
        else {
            System.out.println("1 trong 4 hệ số của bạn chưa được nhập. Vui lòng nhập đủ để có thể sửa danh sách điểm. ");
            int replay = checkValidate.checkNumber("Nhấn 1 để quay lại hàm, nhấn 2 để có thể nhập điểm, nhấn số bất kì để trở lại Menu:  ");
            if (replay == 1){
                editScore();
            }
            else if (replay == 2){
                enterScore();
            }
            else {
                Menu();
            }
        }
    }

//   tìm học viên bằng id

    public Student findId(int id){
        for (Student student : students){
            if (id == student.getId()){
                return student;
            }
        }

        return null;
    }

//   tìm tên và in student theo tên

    public void searchAndPrintStudentName(String name){
        tempStudent.clear();
        for (Student s : students){
            if (s.getName().contains(name)){
                tempStudent.add(s);
            }
        }
        for (Student si : tempStudent){
            si.printStudent();
        }

    }

//  Nhập lựa chọn
    public void selection(String name,int selection){
        Student student1 = findName(name);
        switch (selection){
            case 1:
                String newName = checkValidate.checkName("Nhập tên mới: ");
                student1.setName(newName);
                break;
            case 2:
                String newAge = checkValidate.ValidateAge("Nhập ngày tháng năm sinh mới: ");
                student1.setAge(newAge);
                break;
            case 3:
                String newGender = checkValidate.gender("Nhập giới tính: ");
                student1.setGender(newGender);
                break;
        }
    }

//  xóa học viên

    public void removeStudent(){
        System.out.println("Xóa học viên: ");

        try {
            String name = checkValidate.checkName("Nhập tên học viên bạn muốn xóa");
            Student student = findName(name);
            if (student == null){
                int replay = checkValidate.checkNumber("Tên bạn vừa nhập không có trong danh sách. Nhấn 1 để quay lại nhập tên, Nhấn số bất kì để trở lại menu: ");
                if (replay == 1){
                    removeStudent();
                }
                else {
                    Menu();
                }
            }
            else {
                searchAndPrintStudentName(name);
                if (tempStudent.size() == 1){
                    int replay = checkValidate.checkNumber("Bạn có chắc chắn muốn xóa học viên này. Nhấn 1 để xóa học viên này. Nhấn số bất kì để trở lại menu: ");
                    if (replay == 1){
                        students.remove(student);
                    }
                    else {
                        Menu();
                    }
                }
                else if (tempStudent.size() > 1){
                    int id = checkValidate.checkNumber("Nhập id mà xóa");
                    Student student1 = findId(id);
                    if (student1 == null){
                        int replay = checkValidate.checkNumber("id bạn nhập k đúng vui lòng nhấn 1 để nhập lại nhấn số bất kì để trở lại menu: ");
                        if (replay == 1){
                            removeStudent();
                        }
                        else {
                            Menu();
                        }
                    }
                    else {
                        int remove = checkValidate.checkNumber("Bạn có chắc chắn xóa học viên này. Nhấn 1 để xóa nhấn số bất kì để trở lại menu: ");
                        if (remove == 1){
                            students.remove(student);
                        }
                        else {
                            Menu();
                        }
                    }
                }



            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
//       sửa thông tin học viên

    public void editProfile(){
        System.out.println("Sửa thông tin học viên");
        System.out.println("=====================================");

       try {
           String searchName = checkValidate.checkName("Nhập tên bạn muốn sửa: ");
           Student student1 = findName(searchName);

           if (student1 == null){
               int replay = checkValidate.checkNumber("Tên bạn vừa nhập không có trong danh sách. Nhấn 1 để trở lại nhập tên nhấn số còn lại để trở lại menu: ");
               if (replay == 1){
                   editProfile();
               }
               else {
                   Menu();
               }
           }
           else {
               searchAndPrintStudentName(searchName);
               if (tempStudent.size() == 1){
                   try {
                       printMenu.printListEditScore();
                       int selection = checkValidate.checkNumber("Nhập lựa chọn: ");

                       selection(searchName,selection);
                   } catch (Exception e) {
                       int replay = checkValidate.checkNumber("Số bạn nhập không hợp lệ. Nhấn 1 trở lại hàm nhấn số bất kì để trở lại menu: ");
                       if (replay == 1){
                           editProfile();
                       }
                       else {
                           Menu();
                       }
                   }
               }
               if (tempStudent.size() > 1){
                   int id = checkValidate.checkNumber("Nhập id bạn muốn sửa: ");
                   Student student11 = findId(id);

                   if (student11 == null){
                       int replay = checkValidate.checkNumber("id bạn nhập k hợp lệ. Nhấn 1 để trở lại hàm nhấn số bất kỳ để trở về menu: ");
                       if (replay == 1){
                           editProfile();
                       }
                       else {
                           Menu();
                       }
                   }
                   else {
                       try {
                           printMenu.printListEditScore();
                           int selection = checkValidate.checkNumber("Nhập lựa chọn: ");

                           selection(searchName,selection);
                       } catch (Exception e) {
                           int replay = checkValidate.checkNumber("Số bạn nhập không hợp lệ. Nhấn 1 trở lại hàm nhấn số bất kì để trở lại menu: ");
                           if (replay == 1){
                               editProfile();
                           }
                           else {
                               Menu();
                           }
                       }
                   }
               }
           }
       } catch (Exception e) {
           Menu();
       }

    }

//  Nhập điểm học viên


    public void enterScore(){
        printMenu.printScore();
        int selection = checkValidate.checkNumber("Nhập lựa chọn của bạn: ");

        if (selection == 1){
            String name = checkValidate.checkName("Nhập tên bạn muốn nhập: ");
            Student student = findName(name);

            if (student == null){
                int replay = checkValidate.checkNumber("Tên bạn nhập không hợp lệ. Nhấn 1 để trở lại nhập tên, nhấn số bất kì để trở lại menu: ");
                if (replay == 1){
                    enterScore();
                }
                else {
                    Menu();
                }
            }
            else {
                searchAndPrintStudentName(name);
                if (tempStudent.size() == 1){
                    printMenu.enterCoefficient();
                    int option = checkValidate.checkNumber("Nhập lựa chọn của bạn");

                    switch (option){
                        case 1:
                            if (student.enterScore1 == false){
                                double score = checkValidate.ValidateScore("Nhập điểm của bạn: ");
                                student.setScore1(score);
                                student.setMedium();
                                student.enterScore1 = true;
                            }
                            else {
                                int replay = checkValidate.checkNumber("Bạn đã nhập hệ số này. Nhấn 1 để trở lại nhập điểm, nhấn số bất kì để trở lại menu: ");
                                if (replay == 1){
                                    enterScore();
                                }
                                else {
                                    Menu();
                                }
                            }
                            break;
                        case 2:
                            if (student.enterScore2 == false){
                                double score2 = checkValidate.ValidateScore("Nhập điểm của bạn: ");
                                student.setScore2(score2);
                                student.setMedium();
                                student.enterScore2 = true;
                            }
                            else {
                                int replay = checkValidate.checkNumber("Bạn đã nhập hệ số này. Nhấn 1 để trở lại nhập điểm, nhấn số bất kì để trở lại menu: ");
                                if (replay == 1){
                                    enterScore();
                                }
                                else {
                                    Menu();
                                }
                            }
                            break;
                        case 3:
                            if (student.enterScore3 == false){
                                double score2 = checkValidate.ValidateScore("Nhập điểm của bạn: ");
                                student.setScore3(score2);
                                student.setMedium();
                                student.enterScore3 = true;
                            }
                            else {
                                int replay = checkValidate.checkNumber("Bạn đã nhập hệ số này. Nhấn 1 để trở lại nhập điểm, nhấn số bất kì để trở lại menu: ");
                                if (replay == 1){
                                    enterScore();
                                }
                                else {
                                    Menu();
                                }
                            }
                            break;
                        case 4:
                            if (student.enterScore4 == false){
                                double score2 = checkValidate.ValidateScore("Nhập điểm của bạn: ");
                                student.setScore4(score2);
                                student.setMedium();
                                student.enterScore4 = true;
                            }
                            else {
                                int replay = checkValidate.checkNumber("Bạn đã nhập hệ số này. Nhấn 1 để trở lại nhập điểm, nhấn số bất kì để trở lại menu: ");
                                if (replay == 1){
                                    enterScore();
                                }
                                else {
                                    Menu();
                                }
                            }
                            break;
                        default:
                            int replay = checkValidate.checkNumber("Hệ số bạn nhập không hợp lệ. Nhấn 1 để trở lại hàm, nhấn số bất kì để trở lại Menu: ");
                            if (replay == 1){
                                enterScore();
                            }
                            else {
                                Menu();
                            }
                    }

                }
                if (tempStudent.size() > 1){
                    int findId = checkValidate.checkNumber("Nhập id bạn muốn nhập: ");
                    Student studentId = findId(findId);

                    if (studentId == null){
                        int replay = checkValidate.checkNumber("id bạn nhập không hợp lệ. Nhấn 1 để trở lại hàm, nhấn số bất kì để trở lại Menu: ");
                        if (replay == 1){
                            enterScore();
                        }
                        else {
                            Menu();
                        }
                    }
                    else {
                        for (Student s : students){
                            if (s.getId() == findId){
                                printMenu.enterCoefficient();
                                int option = checkValidate.checkNumber("Nhập lựa chọn của bạn");

                                switch (option){
                                    case 1:
                                        if (student.enterScore1 == false){
                                            double score = checkValidate.ValidateScore("Nhập điểm của bạn: ");
                                            student.setScore1(score);
                                            student.setMedium();
                                            student.enterScore1 = true;
                                        }
                                        else {
                                            int replay = checkValidate.checkNumber("Bạn đã nhập hệ số này. Nhấn 1 để trở lại nhập điểm, nhấn số bất kì để trở lại menu: ");
                                            if (replay == 1){
                                                enterScore();
                                            }
                                            else {
                                                Menu();
                                            }
                                        }
                                        break;
                                    case 2:
                                        if (student.enterScore2 == false){
                                            double score2 = checkValidate.ValidateScore("Nhập điểm của bạn: ");
                                            student.setScore2(score2);
                                            student.setMedium();
                                            student.enterScore2 = true;
                                        }
                                        else {
                                            int replay = checkValidate.checkNumber("Bạn đã nhập hệ số này. Nhấn 1 để trở lại nhập điểm, nhấn số bất kì để trở lại menu: ");
                                            if (replay == 1){
                                                enterScore();
                                            }
                                            else {
                                                Menu();
                                            }
                                        }
                                        break;
                                    case 3:
                                        if (student.enterScore3 == false){
                                            double score2 = checkValidate.ValidateScore("Nhập điểm của bạn: ");
                                            student.setScore3(score2);
                                            student.setMedium();
                                            student.enterScore3 = true;
                                        }
                                        else {
                                            int replay = checkValidate.checkNumber("Bạn đã nhập hệ số này. Nhấn 1 để trở lại nhập điểm, nhấn số bất kì để trở lại menu: ");
                                            if (replay == 1){
                                                enterScore();
                                            }
                                            else {
                                                Menu();
                                            }
                                        }
                                        break;
                                    case 4:
                                        if (student.enterScore4 == false){
                                            double score2 = checkValidate.ValidateScore("Nhập điểm của bạn: ");
                                            student.setScore4(score2);
                                            student.setMedium();
                                            student.enterScore4 = true;
                                        }
                                        else {
                                            int replay = checkValidate.checkNumber("Bạn đã nhập hệ số này. Nhấn 1 để trở lại nhập điểm, nhấn số bất kì để trở lại menu: ");
                                            if (replay == 1){
                                                enterScore();
                                            }
                                            else {
                                                Menu();
                                            }
                                        }
                                        break;
                                    default:
                                        int replay = checkValidate.checkNumber("Hệ số bạn nhập không hợp lệ. Nhấn 1 để trở lại hàm, nhấn số bất kì để trở lại Menu: ");
                                        if (replay == 1){
                                            enterScore();
                                        }
                                        else {
                                            Menu();
                                        }
                                }
                            }
                        }
                    }
                }
            }
        }
        else if (selection == 2){
            String name = checkValidate.checkName("Nhập tên bạn muốn nhập: ");
            Student student = findName(name);

            if (student == null){
                int replay = checkValidate.checkNumber("Tên bạn nhập không hợp lệ. Nhấn 1 để trở lại nhập tên, nhấn số bất kì để trở lại menu: ");
                if (replay == 1){
                    enterScore();
                }
                else {
                    Menu();
                }
            }
            else {
                tempStudent.clear();
                searchAndPrintStudentName(name);
                if (tempStudent.size() == 1){
                    if (student.enterScore1 == false){
                        double score1 = checkValidate.ValidateScore("Nhập hệ số 1: ");
                        student.setScore1(score1);
                        student.setMedium();
                        student.enterScore1 = true;
                    }

                    if (student.enterScore2 == false){
                        double score2 = checkValidate.ValidateScore("Nhập hệ số 2: ");
                        student.setScore2(score2);
                        student.setMedium();
                        student.enterScore2 = true;
                    }
                    if (student.enterScore3 == false){
                        double score3 = checkValidate.ValidateScore("Nhập hệ số 3: ");
                        student.setScore3(score3);
                        student.setMedium();
                        student.enterScore3 = true;
                    }
                    if (student.enterScore4 == false){
                        double score4 = checkValidate.ValidateScore("Nhập hệ số 4: ");
                        student.setScore4(score4);
                        student.setMedium();
                        student.enterScore4 = true;
                    }

                }
                else if (tempStudent.size() > 1){
                    int findId = checkValidate.checkNumber("Nhập id bạn muốn nhập: ");
                    Student studentFindId = findId(findId);

                    if (studentFindId == null){
                        int replay = checkValidate.checkNumber("id bạn nhập không hợp lệ. Nhấn 1 để quay lại hàm, nhấn số bất kì trở lại Menu");
                        if (replay == 1){
                            enterScore();
                        }
                        else {
                            Menu();
                        }
                    }
                    else {
                        for (Student s : students){
                            if (s.getId() == findId){
                                if (student.getScore1() == -1){
                                    double score1 = checkValidate.ValidateScore("Nhập hệ số 1: ");
                                    student.setScore1(score1);
                                    student.setMedium();
                                    student.enterScore1 = true;
                                }
                                else {
                                    int replay = checkValidate.checkNumber("Hệ số của bạn đã được nhập rồi. Vui lòng nhấn phím 1 để trở lại nhập điểm hoặc nhấn số bất kì để trở lại Menu: ");
                                    if (replay == 1){
                                        enterScore();
                                    }
                                    else {
                                        Menu();
                                    }
                                }
                                if (student.getScore2() == -1){
                                    double score2 = checkValidate.ValidateScore("Nhập hệ số 2: ");
                                    student.setScore2(score2);
                                    student.setMedium();
                                    student.enterScore2 = true;
                                }
                                else {
                                    int replay = checkValidate.checkNumber("Hệ số của bạn đã được nhập rồi. Vui lòng nhấn phím 1 để trở lại nhập điểm hoặc nhấn số bất kì để trở lại Menu: ");
                                    if (replay == 1){
                                        enterScore();
                                    }
                                    else {
                                        Menu();
                                    }
                                }
                                if (student.getScore3() == -1){
                                    double score3 = checkValidate.ValidateScore("Nhập hệ số 3: ");
                                    student.setScore3(score3);
                                    student.setMedium();
                                    student.enterScore3 = true;
                                }
                                else {
                                    int replay = checkValidate.checkNumber("Hệ số của bạn đã được nhập rồi. Vui lòng nhấn phím 1 để trở lại nhập điểm hoặc nhấn số bất kì để trở lại Menu: ");
                                    if (replay == 1){
                                        enterScore();
                                    }
                                    else {
                                        Menu();
                                    }
                                }
                                if (student.getScore4() == -1){
                                    double score4 = checkValidate.ValidateScore("Nhập hệ số 4: ");
                                    student.setScore4(score4);
                                    student.setMedium();
                                    student.enterScore4= true;
                                }
                                else {
                                    int replay = checkValidate.checkNumber("Hệ số của bạn đã được nhập rồi. Vui lòng nhấn phím 1 để trở lại nhập điểm hoặc nhấn số bất kì để trở lại Menu: ");
                                    if (replay == 1){
                                        enterScore();
                                    }
                                    else {
                                        Menu();
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

//  hàm sửa điểm
    public void editScore(){
        System.out.println("-----------Hàm sửa điểm---------");
        System.out.println("1. Sửa điểm từng hệ số cho một sinh viên");
        System.out.println("2. Sửa điểm tất cả hệ số cho các sinh viên");
        System.out.println("3. Trở lại menu");
        System.out.println("--------------------------------------------");
        int option = checkValidate.checkNumber("Nhập lựa chọn của bạn: ");

        switch (option){
            case 1:
                String name = checkValidate.checkName("Nhập tên bạn muốn sửa: ");
                Student editStudent = findName(name);

                if (editStudent == null){
                    int replay = checkValidate.checkNumber("Tên bạn nhập không có trong danh sách. Nhấn 1 để quay lại nhấn số bất kì để trở lại menu");
                    if (replay == 1){
                        editScore();
                    }
                    else {
                        Menu();
                    }
                }
                else {
                    searchAndPrintStudentName(name);
                    if (tempStudent.size() == 1){
                       printMenu.printEditScore();
                        int selection = checkValidate.checkNumber("Nhập hệ số của bạn muốn sửa: ");

                        switch (selection){
                            case 1:
                                if (editStudent.getScore1() != -1){
                                    double editScore1 = checkValidate.ValidateScore("Nhập hệ số 1 bạn muốn sửa: ");
                                    editStudent.setScore1(editScore1);
                                    editStudent.setMedium();
                                }
                                else {
                                    int replay = checkValidate.checkNumber("Hệ số bạn chưa được nhập. Nhấn 1 để trở lại hàm, nhấn số bất kì để quay lại menu");
                                    if (replay == 1){
                                        editScore();
                                    }
                                    else {
                                        Menu();
                                    }
                                }
                                break;
                            case 2:
                                if (editStudent.getScore2() != -1){
                                    double editScore2 = checkValidate.ValidateScore("Nhập hệ số 2 bạn muốn sửa: ");
                                    editStudent.setScore2(editScore2);
                                    student.setMedium();
                                }
                                else {
                                    int replay = checkValidate.checkNumber("Hệ số bạn chưa được nhập. Nhấn 1 để trở lại hàm, nhấn số bất kì để quay lại menu");
                                    if (replay == 1){
                                        editScore();
                                    }
                                    else {
                                        Menu();
                                    }
                                }
                                break;
                            case 3:
                                if (editStudent.getScore3() != -1){
                                    double editScore3 = checkValidate.ValidateScore("Nhập hệ số 3 bạn muốn sửa: ");
                                    editStudent.setScore3(editScore3);
                                    student.setMedium();
                                }
                                else {
                                    int replay = checkValidate.checkNumber("Hệ số bạn chưa được nhập. Nhấn 1 để trở lại hàm, nhấn số bất kì để quay lại menu");
                                    if (replay == 1){
                                        editScore();
                                    }
                                    else {
                                        Menu();
                                    }
                                }
                                break;
                            case 4:
                                if (editStudent.getScore4() != -1){
                                    double editScore4 = checkValidate.ValidateScore("Nhập hệ số 4 bạn muốn sửa: ");
                                    editStudent.setScore4(editScore4);
                                    student.setMedium();
                                }
                                else {
                                    int replay = checkValidate.checkNumber("Hệ số bạn chưa được nhập. Nhấn 1 để trở lại hàm, nhấn số bất kì để quay lại menu");
                                    if (replay == 1){
                                        editScore();
                                    }
                                    else {
                                        Menu();
                                    }
                                }
                                break;
                            case 5:
                                editScore();
                                break;
                            case 6:
                                Menu();
                                break;
                            default:
                                int replay = checkValidate.checkNumber("Lựa chọn của bạn không hợp lệ. Nhấn 1 để quay lại hàm nhấn số bất kì để về menu: ");
                                if (replay == 1){
                                    editScore();
                                }
                                else {
                                    Menu();
                                }
                                break;
                        }
                    }
                    if (tempStudent.size() > 1){
                        int id = checkValidate.checkNumber("Nhập id của bạn: ");
                        Student findId = findId(id);

                        if (findId == null){
                            int replay = checkValidate.checkNumber("Id của bạn nhập không đúng. Nhấn 1 để quay lại hàm, nhấn số bất kì để trở về menu");
                            if (replay == 1){
                                editScore();
                            }
                            else {
                                Menu();
                            }
                        }
                        else {
                            if (findId.getId() == id){
                                printMenu.printEditScore();
                                int selection = checkValidate.checkNumber("Nhập hệ số của bạn muốn sửa: ");

                                switch (selection){
                                    case 1:
                                        if (student.enterScore1 == true){
                                            double editScore1 = checkValidate.ValidateScore("Nhập hệ số 1 bạn muốn sửa: ");
                                            editStudent.setScore1(editScore1);
                                            student.setMedium();
                                        }
                                        else {
                                            int replay = checkValidate.checkNumber("Hệ số bạn đã được nhập. Nhấn 1 để trở lại hàm, nhấn số bất kì để quay lại menu");
                                            if (replay == 1){
                                                editScore();
                                            }
                                            else {
                                                Menu();
                                            }
                                        }
                                        break;
                                    case 2:
                                        if (student.enterScore2 == true){
                                            double editScore2 = checkValidate.ValidateScore("Nhập hệ số 2 bạn muốn sửa: ");
                                            editStudent.setScore2(editScore2);
                                            student.setMedium();
                                        }
                                        else {
                                            int replay = checkValidate.checkNumber("Hệ số bạn đã được nhập. Nhấn 1 để trở lại hàm, nhấn số bất kì để quay lại menu");
                                            if (replay == 1){
                                                editScore();
                                            }
                                            else {
                                                Menu();
                                            }
                                        }
                                        break;
                                    case 3:
                                        if (student.enterScore3 == true){
                                            double editScore3 = checkValidate.ValidateScore("Nhập hệ số 3 bạn muốn sửa: ");
                                            editStudent.setScore3(editScore3);
                                            student.setMedium();
                                        }
                                        else {
                                            int replay = checkValidate.checkNumber("Hệ số bạn đã được nhập. Nhấn 1 để trở lại hàm, nhấn số bất kì để quay lại menu");
                                            if (replay == 1){
                                                editScore();
                                            }
                                            else {
                                                Menu();
                                            }
                                        }
                                        break;
                                    case 4:
                                        if (student.enterScore4 == true){
                                            double editScore4 = checkValidate.ValidateScore("Nhập hệ số 4 bạn muốn sửa: ");
                                            editStudent.setScore4(editScore4);
                                            student.setMedium();
                                        }
                                        else {
                                            int replay = checkValidate.checkNumber("Hệ số bạn đã được nhập. Nhấn 1 để trở lại hàm, nhấn số bất kì để quay lại menu");
                                            if (replay == 1){
                                                editScore();
                                            }
                                            else {
                                                Menu();
                                            }
                                        }
                                        break;
                                    case 5:
                                        editScore();
                                        break;
                                    case 6:
                                        Menu();
                                        break;
                                    default:
                                        int replay = checkValidate.checkNumber("Lựa chọn của bạn không hợp lệ. Nhấn 1 để quay lại hàm nhấn số bất kì để về menu");
                                        if (replay == 1){
                                            editScore();
                                        }
                                        else {
                                            Menu();
                                        }
                                        break;
                                }
                            }
                        }
                    }

                }
                break;
            case 2:
                String findName = checkValidate.checkName("Nhập tên bạn muốn sửa: ");
                Student editStudents = findName(findName);
                if (editStudents == null){
                    int replay = checkValidate.checkNumber("Tên bạn nhập không có trong danh sách. Nhấn 1 để quay lại nhấn số bất kì để trở lại menu");
                    if (replay == 1){
                        editScore();
                    }
                    else {
                        Menu();
                    }
                }
                else {

                    searchAndPrintStudentName(findName);

                    if (tempStudent.size() == 1){
                        compact(findName);
                    }
                    else if (tempStudent.size() > 1){
                        int id = checkValidate.checkNumber("Nhập id: ");
                        Student findID = findId(id);
                        if (findID == null){
                            int replay = checkValidate.checkNumber("Nhập 1 để trở lại hàm, nhấn số bất kì để trở lại menu");
                            if (replay == 1){
                                editScore();
                            }
                            else {
                                Menu();
                            }
                        }
                        else {
                            compact(findName);
                        }
                    }
                }
                break;
            case 3:
                Menu();
                break;
            default:
                int choice = checkValidate.checkNumber("Lựa chọn của bạn không hợp lệ, nhấn 1 để trở lại hàm nhấn số bất kì để trở lại menu: ");
                if (choice == 1){
                    editScore();
                }
                else {
                    Menu();
                }
                break;

        }
    }

    public void sortStudent(){
       Collections.sort(students, new Comparator<Student>() {
           @Override
           public int compare(Student o1, Student o2) {
               return  o1.getMedium() < o2.getMedium() ? 1 : -1;
           }
       });
       for (Student st : students){
           st.printStudent();
       }
    }
}
