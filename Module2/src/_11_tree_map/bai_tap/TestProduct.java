package _11_tree_map.bai_tap;

import java.util.Scanner;

public class TestProduct extends Product {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductManager productManager = new ProductManager();
        boolean check = true;
        while (check) {
            System.out.println("1. Create a product.");
            System.out.println("2. Show product list.");
            System.out.println("3. Extends a product.");
            System.out.println("4. Edit product.");
            System.out.println("5. Search products.");
            System.out.println("0. Stop");
            System.out.println("Enter a number to execute: ");
            int num = scanner.nextInt();
            boolean isNumber = true;
            if (num < 0 || num > 5) {
                System.out.println("Not a Number");
                isNumber = false;
//                break;
            }


            if (!isNumber) {
                System.out.println("You enter fail. Enter to enter a different number.");
                scanner.nextLine();
                continue;
            }

            switch (num) {
                case 1: {
                    productManager.createProduct();
                    break;
                }
                case 2: {
                    productManager.display();
                    break;
                }
                case 3: {
                    productManager.extendsProduct();
                    break;
                }
                case 4: {
                    productManager.editProduct();
                    break;
                }
                case 5: {
                    productManager.searchProduct();
                    break;
                }
                case 0:
                check = false;
                }

            }

        }
    }

