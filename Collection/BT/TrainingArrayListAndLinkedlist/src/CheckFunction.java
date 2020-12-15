import java.util.ArrayList;

public class CheckFunction {
    ArrayList<Product> arrayList = new ArrayList<>();
    public int id = 1;

//  Thêm sản phẩm
    public void addProduct(String name, int price){
       arrayList.add(new Product(id++,name,price));
    }

//   Tìm id
    public Product searchId(int id){
        for (Product product : arrayList){
            if (product.getId()==id){
                return product;
            }
        }
        return null;
    }

//   Sửa thông tin theo sản phẩm
    public void editProduct(int id, String name, int price){
        for (Product product : arrayList){
            if (product.getId()==id){
                product.setName(name);
                product.setPrice(price);
            }
        }
    }

//    Xóa sản phẩm theo id
    public void removeProduct(int id){
        for (Product product : arrayList){
            if (product.getId()==id){
                arrayList.remove(product);
            }
        }
    }


//    tìm kiếm sp theo tên
    public void findProduct(String name){
        for (Product product : arrayList){
            if (product.getName().equals(name)){
                System.out.println(product);;
                return;

            }
        }
        System.out.println("Ten tim kiem khong hop le");
    }

//  In sản phẩm
    public void print(){
        for (Product product : arrayList){
            System.out.println(product);
        }
    }
}
