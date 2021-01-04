public class Test {
    private static ValidatePhone validatePhone;
    private static  final String[] valid = {"(84)-(0978489648)"};
    private static final String[] inValid = {"(a8)-(22222222)"};


    public static void main(String[] args) {
        validatePhone = new ValidatePhone();
        for (String s : valid){
            boolean isValid = validatePhone.validate(s);
            System.out.println("Name phone: " + s + " is valid " + isValid);
        }

        for (String s : inValid){
            boolean isValid = validatePhone.validate(s);
            System.out.println("Name phone: " + s + " is valid " + isValid);
        }

    }
}
