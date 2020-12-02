public class FizzBuzzTranslate {
    public static String translate(int number){
        if (number < 0){
            return "nghir chowi";
        }
        boolean fizz = number % 3 == 0;
        boolean buzz = number % 5 == 0;

        if (fizz && buzz){
            return "fizz buzz";
        }
        if (fizz){
            return "fizz";
        }
        if (buzz){
            return "buzz";
        }
        else
            return changeNumberForWord(number);




    }
    public static String changeNumberForWord(int number){
        int chuc = number / 10;
        int doVi = number % 10;
        String soHangChuc = "";
        String soHangDV = "0";

        switch (chuc){
            case 1:
                soHangChuc="Muoi";
                break;
            case 2:
                soHangChuc= "hai";
                break;
            case 3:
                soHangChuc= "ba";
                break;
            case 4:
                soHangChuc= "bốn";
                break;
            case 5:
                soHangChuc= "năm";
                break;
            case 6:
                soHangChuc= "sáu";
                break;
            case 7:
                soHangChuc= "bảy";
                break;
            case 8:
                soHangChuc= "tám";
                break;
            case 9:
                soHangChuc= "chín";
                break;
        }

        switch (doVi){
            case 1:
                soHangDV="Mot";
                break;
            case 2:
                soHangDV= "hai";
                break;
            case 3:
                soHangDV= "ba";
                break;
            case 4:
                soHangDV= "bốn";
                break;
            case 5:
                soHangDV= "năm";
                break;
            case 6:
                soHangDV= "sáu";
                break;
            case 7:
                soHangDV= "bảy";
                break;
            case 8:
                soHangDV= "tám";
                break;
            case 9:
                soHangDV= "chín";
                break;
        }

        return (soHangChuc+ " "+soHangDV);
    }


}
