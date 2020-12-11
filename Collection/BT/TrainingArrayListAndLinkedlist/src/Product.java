import java.util.HashMap;
import java.util.Map;

public class Product implements Comparable<Product>{
    private int id;
    private String nameProduct;
    private int price;

    public Product(int id, String nameProduct, int price) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product " +
                "id = " + id +
                ", nameProduct = " + nameProduct +
                ", price=" + price;
    }

    @Override
    public int compareTo(Product o) {
        return this.getNameProduct().compareTo(o.getNameProduct());
    }
}
