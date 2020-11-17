package _16_in_out_binary_file.bai_tap;

import java.io.Serializable;

public class Product implements Serializable {
    private String id;
    private String name;
    private String manufacturer;
    private String pay;

    public Product() {
    }

    public Product(String id, String name, String manufacturer, String pay) {
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
        this.pay = pay;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getPay() {
        return pay;
    }

    public void setPay(String pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", pay='" + pay + '\'' +
                '}';
    }
}
