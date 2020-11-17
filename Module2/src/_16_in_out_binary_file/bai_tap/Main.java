package _16_in_out_binary_file.bai_tap;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main extends Product {
    public static void main(String[] args) {
        Product product1 = new Product("1","abc","abcs","1000");
        Product product2 = new Product("2","def","defs","2000");
        Product product3 = new Product("3","ghj","ghjs","3000");
        Product product4 = new Product("4","klm","klms","4000");
        List<Product> list = new ArrayList<>();
        list.add(product1);
        list.add(product2);
        list.add(product3);
        list.add(product4);
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File("src/_16_in_out_binary_file/bai_tap/Product.abc")));
            objectOutputStream.writeObject(list);
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(new File("src/_16_in_out_binary_file/bai_tap/Product.abc")));
            List<Product> listOut =(List<Product>) objectInputStream.readObject();
            System.out.println(listOut);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
