import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Employee employee1 = new Employee("phuoc",1,18,"hue",512345,"Name") ;
        Drinks cafe = new Drinks("coffee",1,"coffee milk",12.000);
        BillDetails billDetail1 = new BillDetails(cafe, 3);
        BillDetails billDetail2 = new BillDetails(cafe, 2);
        ArrayList<BillDetails> billDetails = new ArrayList<>();
        billDetails.add(billDetail1);
        billDetails.add(billDetail2);
        System.out.println(billDetail1);
        Bill bill = new Bill(1,"10/10/2020",employee1,3,billDetails);
        bill.getBill();
    }
}














