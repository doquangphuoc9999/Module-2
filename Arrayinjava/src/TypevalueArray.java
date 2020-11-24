import java.util.Scanner;

public class TypevalueArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//      khai báo
        String[] friends = {"hai","binh","vu","nhuoc","nhan"};

        System.out.print("Enter name you want to find: ");
        String input = scanner.nextLine();

//        Duyệt mãng tìm vị trí
        boolean exit = false;
        for (int i = 0; i < friends.length; i++){
            if (friends[i].equals(input)){
                System.out.print("Position " + input + " in list là: " + (i+1));
                exit = true;
                break;
            }
        }

        if (!exit){
            System.out.print("not found position " + input);
        }


    }
}
