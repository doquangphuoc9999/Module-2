import java.util.ArrayList;

public class Check {
    Customer customer =new Customer("Nguyen Van A",1200000);

    public int checkSurplus(){
        return customer.getSurplus();
    }

    public int recharge(int element){
        return customer.getSurplus() + element;
    }

    public int Withdrawal(int element){
         return customer.getSurplus() - element;
    }


    public void history(){
        for (int i = 0 ; i < 3; i++){

        }
    }


}
