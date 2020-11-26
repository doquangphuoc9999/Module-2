public class NhanVien {
    float luong = 800;

}
class Ltv extends NhanVien{
    int thuong = 1000;

    public static void main(String[] args) {
        Ltv a = new Ltv();

        System.out.println("Lương của lập trình viên là: " + a.luong);
        System.out.println("Thưởng của lập trình viên là: " + a.thuong);
    }
}
