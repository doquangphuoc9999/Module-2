public class Drinks extends CategoryDrinks{
    private String name;
    private double price;

    public Drinks(String CategoryName, int id, String name, double price) {
        super(CategoryName, id);
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
