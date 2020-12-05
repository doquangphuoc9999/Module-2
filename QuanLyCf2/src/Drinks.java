public class Drinks {
    private String nameDrinks;
    private double price;

    public Drinks(String nameDrinks, double price) {
        this.nameDrinks = nameDrinks;
        this.price = price;
    }

    public String getNameDrinks() {
        return nameDrinks;
    }

    public void setNameDrinks(String nameDrinks) {
        this.nameDrinks = nameDrinks;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Drinks{" +
                "nameDrinks='" + nameDrinks + '\'' +
                ", price=" + price +
                '}';
    }
}
