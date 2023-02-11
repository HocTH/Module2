import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();

        Product p1 = new Product(1, "Orange", 2300000);
        Product p2 = new Product(2, "Apple", 20000);
        Product p3 = new Product(3, "Beer", 320000);
        Product p4 = new Product(4, "Chicken", 20000);
        Product p5 = new Product(5, "Lamp", 310000);
        Product p6 = new Product(6, "Pen", 190000);
        Product p7 = new Product(7, "House", 190000000);

        productManager.addProduct(p1);
        productManager.addProduct(p2);
        productManager.addProduct(p3);
        productManager.addProduct(p4);
        productManager.addProduct(p5);
        productManager.addProduct(p6);
        productManager.addProduct(p7);

        ArrayList<Product> products = productManager.getList();
        productManager.sortByPrice(products);

        System.out.println("Decrease");
        products.stream().forEach(p -> System.out.println(p));

        Product updateProduct = new Product(1,"Gold",50000);
        if (productManager.editProduct(updateProduct)) {
            System.out.println("Update Successful");
        } else {
            System.out.println("Update Failed");
        }

        if (productManager.deleteProduct(6)) {
            System.out.println("Delete Successful");
        } else {
            System.out.println("Delete Failed");
        }

        products.stream().forEach(p -> System.out.println(p));
    }
    }
