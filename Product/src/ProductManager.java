import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class ProductManager {
    ArrayList<Product> list = new ArrayList<>();
    public void addProduct(Product p){
        list.add(p);
    }
    public boolean editProduct(Product p){
        for (Product productTemp: list
             ) {
            if (p.getId()== productTemp.getId()){
                productTemp.setName(p.getName());
                productTemp.setPrice(p.getId());
                return true;
            }
        }
        return false;
    }
    public boolean deleteProduct(int id){
        for (Product productTemp: list
        ) {
            if (productTemp.getId()== id && productTemp !=null){
                list.remove(productTemp);
                return true;
            }
        }
        return false;
    }
    public ArrayList<Product> getList(){
        return list;
    }
    public Product getProductById(int id){
        for (Product product: list) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }
    public ArrayList<Product> findProductByName(String name) {
        ArrayList<Product> list1 = new ArrayList<>();
        for (Product product: list) {
            if (product.getName().contains(name)) {
                list1.add(product);
            }
        }
        return list1;
    }
    public class SortProductByPrice implements Comparator<Product> {
        @Override
        public int compare(Product p1, Product p2) {
            if (p1.getPrice() == p2.getPrice()) {
                return p1.getName().compareTo(p2.getName());
            } else if (p1.getPrice() > p2.getPrice()){
                return 1;
            } else {
                return -1;
            }

        }
    }
    public void  sortByPrice(ArrayList<Product> list){
        Collections.sort(list, new SortProductByPrice());
    }
}
