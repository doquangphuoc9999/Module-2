public class BillDetails {
    private Drinks drinks;
    private int amount;
    private double price;

    public BillDetails(Drinks drinks, int amount) {
        this.drinks = drinks;
        this.amount = amount;
    }

    public String getDrinksName() {
        return drinks.getName();
    }

    public void setDrinks(Drinks drinks) {
        this.drinks = drinks;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getTotalDetail(){
        return amount * drinks.getPrice();
    }

    @Override
    public String toString() {
        return "BillDetails{" +
                "drinks=" + drinks.toString() +
                ", amount=" + amount +
                '}';
    }
}
