package ua.intita.qa;

import java.util.Scanner;

public class Shop {

    private final Product[] products;

    private static final Scanner SCANNER = new Scanner(System.in);

    public Shop(Product[] products) {
        this.products = products;
    }

    public void printByTitle() {
        System.out.println("Enter product title to find: ");
        String title = SCANNER.nextLine();
        for (Product product : products) {
            if (title.equalsIgnoreCase(product.getTitle())) {
                System.out.println(product);
            }
        }
        System.out.println("");
    }

    public void printByTitleAndPrice() {
        String title;
        int maxPrice;
        System.out.println("Enter product title to find under settled price: ");
        title = SCANNER.nextLine();
        System.out.println("Set maximum product price to search: ");
        while (true) {
            if (SCANNER.hasNextInt()) {
                maxPrice = SCANNER.nextInt();
                if (maxPrice < 0) {
                    System.out.println("Error, enter correct price!");
                    SCANNER.next();
                } else {
                    break;
                }
            } else {
                System.out.println("Error, enter correct price!");
                SCANNER.next();
            }
        }

        for (Product product : products) {
            if (title.equalsIgnoreCase(product.getTitle()) && maxPrice >= product.getPrice()) {
                System.out.println(product.toString());
            }
        }
        System.out.println("");
    }

    public void printByShelfLife() {
        int minShelfLife;
        System.out.println("Set minimum product shelf-life to search: ");
        while (true) {
            if (SCANNER.hasNextInt()) {
                minShelfLife = SCANNER.nextInt();
                if (minShelfLife < 0) {
                    System.out.println("Error, enter correct price!");
                    SCANNER.next();
                } else {
                    break;
                }
            } else {
                System.out.println("Error, enter correct price!");
                SCANNER.next();
            }
        }

        for (Product product : products) {
            if (minShelfLife <= product.getShelfLifeMonth()) {
                System.out.println(product.toString());
            }
        }
        System.out.println("");
    }

}
