public class Bill {
   private int date;
   private Employee nameEmployee;
   private int id;
   private int amount;
   private double unitPrice;
   private double total;

   public Bill(int date, Employee nameEmployee, int id, int amount, double unitPrice, double total) {
      this.date = date;
      this.nameEmployee = nameEmployee;
      this.id = id;
      this.amount = amount;
      this.unitPrice = unitPrice;
      this.total = total;
   }

   public int getDate() {
      return date;
   }

   public void setDate(int date) {
      this.date = date;
   }

   public Employee getNameEmployee() {
      return nameEmployee;
   }

   public void setNameEmployee(Employee nameEmployee) {
      this.nameEmployee = nameEmployee;
   }

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public int getAmount() {
      return amount;
   }

   public void setAmount(int amount) {
      this.amount = amount;
   }

   public double getUnitPrice() {
      return unitPrice;
   }

   public void setUnitPrice(double unitPrice) {
      this.unitPrice = unitPrice;
   }

   public double getTotal() {
      return total;
   }

   public void setTotal(double total) {
      this.total = total;
   }


}
