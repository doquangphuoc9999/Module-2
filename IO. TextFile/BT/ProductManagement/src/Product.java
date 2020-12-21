import java.io.Serializable;

public class Product implements Serializable {
    private int id;
    private String nameProduct;
    private String produced;
    private int price;

    public Product(int id, String nameProduct, String produced, int price) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.produced = produced;
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

    public String getProduced() {
        return produced;
    }

    public void setProduced(String produced) {
        this.produced = produced;
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
                "id=" + id +
                ", nameProduct = " + nameProduct +
                ", produced='" + produced +
                ", price=" + price ;
    }
}
