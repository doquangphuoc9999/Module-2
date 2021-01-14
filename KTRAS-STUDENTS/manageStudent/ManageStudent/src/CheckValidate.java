import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckValidate {
    Scanner scanner = new Scanner(System.in);
//    ManageStudent manageStudent = new ManageStudent();

//  kiểm tra đầu vào là 1 số
    public int checkNumber(String zalo){
        System.out.print(zalo);
       try {
           int num = Integer.parseInt(scanner.nextLine().trim());
           if (num < 0){
            System.out.println("Chương trình không nhận số âm");
            checkNumber(zalo);
        }
           return num;
       } catch (Exception e) {
           System.out.println("Không phải là một số");
           return checkNumber(zalo);
       }
    }

//  kiểm tra tên

    public String checkName(String name){
        System.out.println(name);
        try {
            String nameStudent = scanner.nextLine().toUpperCase().trim().replaceAll("\\s+", " ");
            Pattern pattern = Pattern.compile("^[a-zA-Z_ÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠàáâãèéêìíòóôõùúăđĩũơƯĂẠẢẤẦẨẪẬẮẰẲẴẶ\\\" +\\n\" +\n" +
                    "                    \"            \\\"ẸẺẼỀỀỂưăạảấầẩẫậắằẳẵặẹẻẽềềểỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪễệỉịọỏốồổỗộớờởỡợ\\\" +\\n\" +\n" +
                    "                    \"            \\\"ụủứừỬỮỰỲỴÝỶỸửữựỳỵỷỹ\\\\\\\\s]+$");
            Matcher matcher = pattern.matcher(nameStudent);
            if (matcher.matches()){
                return nameStudent;
            }
            else {
                return checkName(name);
            }
        } catch (Exception e) {
            return checkName(name);
        }
    }

//   ktra đầu vào cho điểm

    public double ValidateScore(String score){
        System.out.println(score);
        try {
            double number = Double.parseDouble(scanner.nextLine().trim());
            if (number < 0 || number > 10){
                System.out.println("Điểm của bạn không hợp lệ. Điểm từ 0-10");
               return ValidateScore(score);
            }else {
                return number;
            }
        } catch (NumberFormatException e) {
            System.out.println("Phải nhập là một số");
           return ValidateScore(score);
        }
    }

//   Ktra đầu vào cho tuổi

    public String ValidateAge(String Age){
        System.out.println(Age);
        try {
            String dat = scanner.nextLine();
            Pattern pattern = Pattern.compile("^^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$");
            Matcher matcher = pattern.matcher(dat);
            String[]  date = dat.split("-");
            if((Integer.parseInt(date[2]) > 1960 && Integer.parseInt(date[2])< 2015) && matcher.matches()){
                return dat;
            }else {
                return ValidateAge(Age);
            }
        } catch (Exception e) {
            System.out.println("Ngày vào không hợp lệ");
            return ValidateAge(Age);

        }
    }

//   ktra giới tính

    public String gender(String message){
        System.out.println(message);
        try {
            System.out.println("Nhập Nam or Nu");
            String genders = scanner.nextLine().replace(" ","");
            String format = genders.substring(0,1).toUpperCase() + genders.substring(1).toLowerCase();

            if (format.equals("Nam") || format.equals("Nu")){
                return format;
            }
            else {
                return gender(message);
            }
        } catch (Exception e) {
           return gender(message);
        }

    }
}
