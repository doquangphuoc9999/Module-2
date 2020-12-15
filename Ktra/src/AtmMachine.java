import java.util.Scanner;

public class AtmMachine {
    BankAccount bankAccount = new BankAccount("Phuoc",300000);


//  rút tiền
    public void withdrawal(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so tien muon rut: ");
        int rut = scanner.nextInt();
        scanner.nextLine();
        while (rut < 0 && rut > bankAccount.checkAmount()){
            if (rut < 0 && rut > bankAccount.checkAmount()){
                System.out.println("Vui long nhap lai: ");
                rut = scanner.nextInt();
            }
        }
        System.out.println("Giao dich thanh cong. So tien ban vua rut la " + rut);
        System.out.println("So du tai khoan hien tai cua ban la: " + bankAccount.withdrawal(rut));
    }

//  Nạp tiền
    public void recharge(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Giao dich Nap tien: ");
        int nap = scanner.nextInt();
        scanner.nextLine();
        while (nap <= 0){
            if (nap <= 0){
                System.out.println("Vui long nhap lai: ");
                nap = scanner.nextInt();
                scanner.nextLine();
            }
        }
        System.out.println("Giao dich thanh cong. So tien ban vua nap la: " + nap);
        System.out.println("So du hien tai cua ban la: "+bankAccount.recharge(nap));
    }
//  ktra
    public void checkAmount(){
        System.out.println("So du tai khoan khach hang la:" + bankAccount.checkAmount());
    }

//  lịch sử
    public void history(){
        System.out.println("Lich su giao dich: ");
        bankAccount.history();
    }


//  menu
    public void menu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ngan Hang ABC kinh chao quy khach Do Quang Phuoc");
        System.out.println("Menu: ");
        System.out.println("1. Nhan phim A de kiem tra tai khoan");
        System.out.println("2. Nhan phim D de nap tien");
        System.out.println("3. Nhan phim W de rut tien");
        System.out.println("4. Nhan phim H de xem lich su");
        System.out.println("5. Nhan phim X de thoat");

        System.out.println("========================================");
        System.out.println("Enter option");
        String option = scanner.nextLine().toUpperCase();

        switch (option){
            case "A":
                checkAmount();
                break;
            case "D":
                recharge();
                break;
            case "W":
                withdrawal();
                break;
            case "H":
                history();
                break;
            case "X":
                System.exit(0);
                break;
            default:
                System.out.println("Vui long nhap lai");
                break;
        }
    }
}
