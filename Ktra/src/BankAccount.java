import java.util.ArrayList;

public class BankAccount {
    private String nameAccount;
    private int amount;

    ArrayList<String> accountArrayList = new ArrayList<>();

    public BankAccount(String nameAccount, int amount) {
        this.nameAccount = nameAccount;
        this.amount = amount;
    }

    public int checkAmount(){
        return this.amount;
    }

    public String getNameAccount() {
        return nameAccount;
    }

    public void setNameAccount(String nameAccount) {
        this.nameAccount = nameAccount;
    }

    //  nạp tiền

    public int recharge(int money){
        this.amount = amount + money;
        accountArrayList.add("Nạp Tiền: " + money);
        return amount;
    }

//  rút tiền

    public int withdrawal(int money){
       this.amount -= money;
        accountArrayList.add("Rút tiền: " + money);
        return amount;
    }


//  xem lịch sử
    public void history(){
        for (String str : accountArrayList){
            System.out.println(str);
        }
    }


    @Override
    public String toString() {
        return "BankAccount " +
                "nameAccount = " + nameAccount +
                ", amount = " + amount ;
    }
}
