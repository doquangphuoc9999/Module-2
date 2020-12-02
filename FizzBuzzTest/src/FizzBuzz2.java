public class FizzBuzz2 {
    public static String translate2(int number){

        if (number < 0){
            return "nghir chowi";
        }
        String str = "" + number;
        String[] arr = str.split("");
        if(arr[0].equals("3") || arr[1].equals("3")){
            return "Fizz";
        }
        if (arr[1].equals("5") || arr[0].equals("5")){
            return "buzz";
        }
        if (arr[0].equals("3") && arr[1].equals("5")){
            return "fizz buzz";
        }
        if (arr[0].equals("5") && arr[1].equals("3")){
            return "fizz buzz";
        }

        return str;

    }





}
