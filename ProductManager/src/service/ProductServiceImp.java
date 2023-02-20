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
                for (int i = 0; i < listProduct.size(); i++) {
                    if (listProduct.get(i).getProductCode().equals(productCode)) {
                        flag = true;
                        break;
                    }
                }
                if (flag){
                    System.out.println("Ma da trung lap");
                }else {
                    break;
                }
            }
        }
        System.out.println("Nhap ten san pham");
        String nameProduct= scanner.nextLine();
        System.out.println("Nhap hang san xuat");
        String manufacturer= scanner.nextLine();
        System.out.println("Nhap gia");
        double price=scanner.nextDouble();
        System.out.println("Nhap mo ta");
        String descriptions= scanner.nextLine();
        Product product = new Product(productCode,nameProduct,manufacturer,price,descriptions);
        listProduct.add(product);
        WriteAndReadProduct.writeObject(listProduct);
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
        if (listDisplay.size() == 0) {
            System.out.println("List trong, them san pham vao");
        } else {
            while (true) {
                System.out.println("Nhap ma san pham");
                String productCodeCheck = scanner.nextLine();
                for (int i = 0; i <listDisplay.size() ; i++) {
                    if (listDisplay.get(i).getProductCode().equals(productCodeCheck)){
                        System.out.println("Nhap ten san pham");
                        String nameProduct= scanner.nextLine();
                        System.out.println("Nhap hang san xuat");
                        String manufacturer= scanner.nextLine();
                        System.out.println("Nhap gia");
                        double price=scanner.nextDouble();
                        System.out.println("Nhap mo ta");
                        String descriptions= scanner.nextLine();
                        listDisplay.get(i).setNameProduct(nameProduct);
                        listDisplay.get(i).setManufacturer(manufacturer);
                        listDisplay.get(i).setPrice(price);
                        listDisplay.get(i).setDescriptions(descriptions);
                        break;
                    }
                }
                WriteAndReadProduct.writeUpdatedObject(listDisplay);
            }
        }
    }

//    public static void main(String[] args) {
//        ProductServiceImp test = new ProductServiceImp();
//        test.add();
//    }
}
