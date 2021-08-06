package ua.intita.qa;

import java.util.Scanner;

public class Shop {

    private Product[] products;

    static Scanner scanner = new Scanner(System.in);

    public Shop(Product...products) {
        this.products = new Product[products.length];
        int i = 0;
        for (Product product:products) {
            this.products[i] = new Product(product);
            i++;
        };
    }

    public void printByTitle(){
        System.out.println("Enter product title to find: ");
        String title = scanner.nextLine();
        for (Product product:products) {
            if(title.equalsIgnoreCase(product.getTitle())){
                System.out.println(product.toString());
            }
        }
        System.out.println("");
    }

    public void printByTitleAndPrice(){
        String title;
        int maxPrice;
        System.out.println("Enter product title to find under settled price: ");
        title = scanner.nextLine();
        System.out.println("Set maximum product price to search: ");
        while (true){
            if(scanner.hasNextInt()){
                maxPrice = scanner.nextInt();
                if(maxPrice<0){
                    System.out.println("Error, enter correct price!");
                    scanner.next();
                } else {
                    break;
                }
            } else {
                System.out.println("Error, enter correct price!");
                scanner.next();
            }
        }

        for (Product product:products) {
            if(title.equalsIgnoreCase(product.getTitle()) && maxPrice>=product.getPrice()){
                System.out.println(product.toString());
            }
        }
        System.out.println("");
    }

    public void printByShelfLife(){
        int minShelfLife;
        System.out.println("Set minimum product shelf-life to search: ");
        while (true){
            if(scanner.hasNextInt()){
                minShelfLife = scanner.nextInt();
                if(minShelfLife<0){
                    System.out.println("Error, enter correct price!");
                    scanner.next();
                } else {
                    break;
                }
            } else {
                System.out.println("Error, enter correct price!");
                scanner.next();
            }
        }

        for (Product product:products) {
            if(minShelfLife<=product.getShelfLifeMonth()){
                System.out.println(product.toString());
            }
        }
        System.out.println("");
    }

}
