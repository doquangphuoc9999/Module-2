import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckValidate {
    Scanner scanner = new Scanner(System.in);

//  check Number
    public int checkNumber(String message){
        System.out.println(message);
        try {
            int number = Integer.parseInt(scanner.nextLine().trim());
            if (number < 0){
                System.out.println("Chương trình k nhận số âm");
                return checkNumber(message);
            }
            return number;
        } catch (NumberFormatException e) {
            System.out.println("Không phải là một số");
            return checkNumber(message);
        }
    }

//  Check name

    public String checkName(String name){
        System.out.print(name);
        try {
            String nameContacts = scanner.nextLine().toUpperCase().trim().replaceAll("\\s+"," ");
            Pattern pattern =Pattern.compile("^[a-zA-Z_ÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠàáâãèéêìíòóôõùúăđĩũơƯĂẠẢẤẦẨẪẬẮẰẲẴẶ\\\\\\\" +\\\\n\\\" +\\n\" +\n" +
                    "                    \"                    \\\"            \\\\\\\"ẸẺẼỀỀỂưăạảấầẩẫậắằẳẵặẹẻẽềềểỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪễệỉịọỏốồổỗộớờởỡợ\\\\\\\" +\\\\n\\\" +\\n\" +\n" +
                    "                    \"                    \\\"            \\\\\\\"ụủứừỬỮỰỲỴÝỶỸửữựỳỵỷỹ\\\\\\\\\\\\\\\\s]+$");
            Matcher matcher = pattern.matcher(nameContacts);

            if (matcher.matches()){
                return nameContacts;
            }
            else {
                return checkName(name);
            }
        } catch (Exception e) {
            return checkName(name);
        }
    }

//  checkPhoneNumber

    public String checkPhoneNumber(String phoneNumber){
        System.out.println(phoneNumber);
        try {
            String phone = scanner.nextLine().trim().replaceAll("\\s+"," ");
            Pattern pattern = Pattern.compile("(84|0[3|5|7|8|9])+([0-9]{8})\\b");
            Matcher matcher = pattern.matcher(phone);

            if (matcher.matches()){
                return phone;
            }
            return checkPhoneNumber(phoneNumber);
        } catch (Exception e) {
            return checkPhoneNumber(phoneNumber);
        }
    }

//  checkAddress
public String checkAddress(String address){
    System.out.println(address);
    try {
        String phone = scanner.nextLine().trim().replaceAll("\\s+"," ");
        return phone;
    } catch (Exception e) {
        return checkAddress(address);
    }
}

// checkEmail

    public String checkgmail(String gmail){
        System.out.println(gmail);
        try {
            String phone = scanner.nextLine().trim().replaceAll("\\s+"," ");
            Pattern pattern = Pattern.compile("^([\\w]*[\\w\\.]*(?!\\.)@gmail.com)");
            Matcher matcher = pattern.matcher(phone);

            if (matcher.matches()){
                return phone;
            }
            return checkgmail(gmail);
        } catch (Exception e) {
            return checkgmail(gmail);
        }
    }


    //   Ktra đầu vào cho tuổi

    public String checkDateOfBird(String Age){
        System.out.println(Age);
        try {
            String dat = scanner.nextLine();
            Pattern pattern = Pattern.compile("^^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$");
            Matcher matcher = pattern.matcher(dat);
            String[]  date = dat.split("-");
            if((Integer.parseInt(date[2]) > 1960 && Integer.parseInt(date[2])< 2015) && matcher.matches()){
                return dat;
            }else {
                return checkDateOfBird(Age);
            }
        } catch (Exception e) {
            System.out.println("Ngày vào không hợp lệ");
            return checkDateOfBird(Age);

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

