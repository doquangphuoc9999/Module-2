public class Test {
    private static NameClass nameClass;

    private static String[] valid = {"C0318G"};
    private static String[] inVlaid = {"M0318G", "P0323A"};

    public static void main(String[] args) {
        nameClass = new NameClass();
        for (String s : valid){
            boolean isValid = nameClass.validate(s);
            System.out.println("Name class " + s + " is valid " + isValid);
        }
        for (String s : inVlaid){
            boolean isValid = nameClass.validate(s);
            System.out.println("Name class " + s + " is valid " + isValid);
        }
    }
}
