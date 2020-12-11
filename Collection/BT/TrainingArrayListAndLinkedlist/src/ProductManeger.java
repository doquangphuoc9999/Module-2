import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ProductManeger implements Comparator<Product> {
    ArrayList<Product> arrayList = new ArrayList<>();

    public void addProduct(int id, String name, int price){
        arrayList.add(new Product(id,name,price));
    }

    public Product getById(int id){
        for (Product product : arrayList ){
           if (product.getId() == id){
               return product;
           }
        }
        return null;
    }

    public void print(){
        for (Product product : arrayList){
            System.out.println(product);
        }
    }



    @Override
    public int compare(Product o1, Product o2) {
        if (o1.getPrice() > o2.getPrice()){
            return 1;
        }
        else if (o1.getPrice() < o2.getPrice()){
            return -1;
        }
        return 0;
    }


}
