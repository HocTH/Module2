package service;

import model.Product;
import util.WriteAndReadProduct;

import java.util.List;
import java.util.Scanner;

public class ProductServiceImp {
    Scanner scanner = new Scanner(System.in);

    public void add() {
        List<Product> listProduct = WriteAndReadProduct.readFileObject();
        System.out.println("Add productCode");
        String productCode;
        if (listProduct.size() == 0) {
            productCode = scanner.nextLine();
        } else {
            while (true) {
                boolean flag = false;
                productCode = scanner.nextLine();
                for (Product product : listProduct) {
                    if (product.getProductCode().equals(productCode)) {
                        flag = true;
                        break;
                    }
                }
                if (flag){
                    System.out.println("Code was existed");
                    System.out.println("Input the code again");
                }else {
                    break;
                }
            }
        }
        System.out.println("Input name of product");
        String nameProduct= scanner.nextLine();
        System.out.println("Input the manufacturer");
        String manufacturer= scanner.nextLine();
        System.out.println("Input the price");
        double price=scanner.nextDouble();
        System.out.println("Input the description");
        String descriptions= scanner.nextLine();
        Product product = new Product(productCode,nameProduct,manufacturer,price,descriptions);
        listProduct.add(product);
        WriteAndReadProduct.writeObject(listProduct);
        System.out.println("Add Successfully");
    }
    public void display(){
        System.out.println("Display list product");
        List<Product> listDisplay = WriteAndReadProduct.readFileObject();
        for (int i = 0; i <listDisplay.size() ; i++) {
            System.out.println((i+1)+"."+listDisplay.get(i));
        }
    }
    public void edit(){
        List<Product> listDisplay = WriteAndReadProduct.readFileObject();
        display();
        boolean flag = false;

        if (listDisplay.size() == 0) {
            System.out.println("List empty, add the product");
        } else {
            while (true) {
                System.out.println("Input the code of product");
                int index = 0;
                String productCodeCheck = scanner.nextLine();
                for (int i = 0; i <listDisplay.size() ; i++) {
                    if (listDisplay.get(i).getProductCode().equals(productCodeCheck)){
                        flag = true;
                        index = i;
                        break;
                    }
                }
                if (flag){
                    System.out.println("Input name of product");
                    String nameProduct= scanner.nextLine();
                    System.out.println("Input the manufacturer");
                    String manufacturer= scanner.nextLine();
                    System.out.println("Input the price");
                    double price=scanner.nextDouble();
                    System.out.println("Input the description");
                    String descriptions= scanner.nextLine();
                    listDisplay.get(index).setNameProduct(nameProduct);
                    listDisplay.get(index).setManufacturer(manufacturer);
                    listDisplay.get(index).setPrice(price);
                    listDisplay.get(index).setDescriptions(descriptions);
                    WriteAndReadProduct.writeUpdatedObject(listDisplay);
                    break;
                } else {
                    System.out.println("Ma san pham khong ton tai");
                    break;
                }
            }
        }
    }
}
