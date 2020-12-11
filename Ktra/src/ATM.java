import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Check check = new Check();
        ArrayList arrayList = new ArrayList();

        System.out.println("Ngan hang ABC kinh chao Quy khach Nguyen Van A\n");
        System.out.println("Menu: ");
        System.out.println("1: Nhan phim A de kiem tra tai khoan");
        System.out.println("2: Nhan phim D de nap tien");
        System.out.println("3: Nhan phim W de rut tien");
        System.out.println("4: Nhan phim H de xem lich su 3 lan");
        System.out.println("5: Nhan X de thoat");
        System.out.println("====================================");
        System.out.print("Nhap lua chon cua ban: ");
        String str = scanner.nextLine();
        String chuyen = str.toUpperCase();

        switch (chuyen){
            case "A":
                System.out.println("So du tai khoan khach hang la: " + check.checkSurplus());;
                break;
            case "D":
                System.out.println("Giao dich nap tien");
                System.out.print("Vui long nhap so tien: ");
                int money = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Giao dich thanh cong. Ban vua nap so " + money + " thanh cong");
                System.out.println("So du tai khoan khach hang la: " + check.recharge(money));
                break;

            case "W":
                System.out.println("Giao dich Rut tien:");
                System.out.println("Vui long nhap so tien:");
                int rut = scanner.nextInt();
                scanner.nextLine();
                if (rut > check.checkSurplus()){
                    System.out.println("Truong hop rut tien khong duoc, thieu tien");
                    return;
                }
                System.out.println("Giao dich thanh cong so tien ban vua rut la " + rut + " Thanh cong");
                System.out.println("So du hien tai la: " + check.Withdrawal(rut));
                break;

            case "X":
                System.exit(0);
                break;
            default:
                System.out.println("Ban nhap sai chuc nang");
                break;  
        }


    }
}
