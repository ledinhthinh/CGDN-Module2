package _11_tree_map.bai_tap;

import java.util.*;

public class ProductManager extends Product {
    private static ArrayList<Product> productList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    ProductManager() {
    }

    ProductManager(int id, String nameProduct, int price) {
        super(id, nameProduct, price);
    }

    public void display() {
        Collections.sort(productList, new CompaPrice());
        for (Product c : productList) {
            System.out.println("Id: " + c.getId()
                    + " Name Product: " + c.getNameProduct()
                    + " Price: " + c.getPrice());
        }
    }


    public void createProduct() {
        System.out.println("Enter the product number: ");
        int number = scanner.nextInt();
        for (int i = 1; i <= number; i++) {
            System.out.println("Product " + i);
            Product product = getProduct();
            productList.add(product);
        }
    }

    private Product getProduct() {
        Product product = new Product();

        System.out.println("Enter ID: ");
        product.setId(scanner.nextInt());
        System.out.println("Enter name product: ");
        scanner.nextLine();
        String productName = scanner.nextLine();
        product.setNameProduct(productName);
        System.out.println("Enter price: ");
        product.setPrice(scanner.nextDouble());
        return product;
    }

    public void extendsProduct() {
        int temp = productList.size()+1;
        System.out.println("Product "+ temp);
        productList.add(productList.size(), getProduct());
    }

    public void editProduct() {
        display();
        System.out.println("Enter the product ID you want to edit: ");
        scanner.nextLine();
        int temp = scanner.nextInt();
        boolean check = false;
        for (Product c : productList) {
            if (temp == c.getId()) {
                System.out.println("Name product new: ");
                scanner.nextLine();
                String getName = scanner.nextLine();
                if (getName.equals("")) {
                    c.setNameProduct(c.getNameProduct());
                } else c.setNameProduct(getName);
                System.out.println("Price product new: ");
                int getPrice = scanner.nextInt();
                if (getPrice <= 0) {
                    c.setPrice(c.getPrice());
                } else c.setPrice(getPrice);
                check = true;
            }
        }
        if (!check) {
            System.out.println("No ID in list product!!");
        }
    }

    public void searchProduct() {
        System.out.println("Enter the product name you want to search");
        scanner.nextLine();
        String search = scanner.nextLine();
        boolean check = false;
        for (Product c : productList) {
            if (search.contains(c.getNameProduct())) {
                System.out.println("Id: " + c.getId()
                        + " Name Product: " + c.getNameProduct()
                        + " Price: " + c.getPrice());
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("No product in list product!!");
        }
    }

}
