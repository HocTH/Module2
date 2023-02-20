package model;

import java.io.Serializable;

public class Product implements Serializable {
    private static final long serialVersionUID = 1L;
    private String productCode;
    private String nameProduct;
    private String manufacturer;
    private double price;
    private String descriptions;

    public Product(String productCode, String nameProduct, String manufacturer, double price, String descriptions) {
        this.productCode = productCode;
        this.nameProduct = nameProduct;
        this.manufacturer = manufacturer;
        this.price = price;
        this.descriptions = descriptions;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    @Override
    public String toString() {
        return "Product={" + "productCode=" + this.getProductCode() +
                " ,nameProduct=" + this.getNameProduct() +
                " ,Manufacturer=" + this.getManufacturer() +
                " ,price" + this.getPrice() +
                " ,description=" + getDescriptions();
    }
}
