import java.util.ArrayList;

public class Bill {
    private int id;
    private String date;
    private Employee employeeName;
    private int tableNumber;
    private ArrayList<BillDetails> billDetails;

    public Bill(int id, String date, Employee employee, int tableNumber, ArrayList<BillDetails> billDetails) {
        this.id = id;
        this.date = date;
        this.employeeName = employee;
        this.tableNumber = tableNumber;
        this.billDetails = billDetails;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

//    public String getEmployeeName() {
//        return employeeName.getName() ;
//    }

    public int getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public double getTotal() {
        double total = 0;
        for(BillDetails value : billDetails){
            total += value.getTotalDetail() ;
        }
        return total;
    }


    public ArrayList<BillDetails> getBillDetails() {
        return billDetails;
    }

    public void getBill(){
        System.out.println("Name :" + employeeName.getName()+ "             "+ "tableNumber:" + tableNumber);
    }
}
