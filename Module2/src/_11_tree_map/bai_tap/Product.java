package _11_tree_map.bai_tap;

import java.util.Collection;
import java.util.Comparator;

public class Product {
    private int id;
    private String nameProduct;
    private double price;

    public Product() {
    }

    public Product(int id, String nameProduct, double price) {
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", nameProduct='" + nameProduct + '\'' +
                ", price=" + price
                ;
    }
}
