package util;

import model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WriteAndReadProduct {
    static String path = "src/data/productList.dat";
    public static List<Product> readFileObject() {
        try (ObjectInputStream stream = new ObjectInputStream(new FileInputStream(path))){
            return (List<Product>)stream.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }

    public static void writeObject(List<Product> list) {
        try (ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream(path))){
            stream.writeObject(list);
            stream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void writeUpdatedObject(List<Product> listUpdated) {
        List<Product> list = new ArrayList<>();
        for (Product product:listUpdated) {
            list.add(product);
        }
        try (ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream(path))){
            stream.writeObject(list);
            stream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    public static void main(String[] args) {
//        Product product = new Product("123","13","Honda,",1000,"tinh");
//        List list = new ArrayList<>();
//        list.add(product);
//        writeObject(list);
//        readFileObject().forEach(System.out::println);
//    }
}
