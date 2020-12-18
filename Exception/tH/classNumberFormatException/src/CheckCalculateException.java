public class CheckCalculateException{
    public void caculate(int x, int y){

        try {
            int a = x + y;
            System.out.println("Cộng: " + a);
            int b = x - y;
            System.out.println("Trừ: " + b);
            int c = x * y;
            System.out.println("Nhân: " + c);
            int d = x / y;
            System.out.println("Chia: " + d);

        } catch (NumberFormatException ex) {
            ex.printStackTrace();
        }
    }
}
