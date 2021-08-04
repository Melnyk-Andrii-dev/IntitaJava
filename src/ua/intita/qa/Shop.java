package ua.intita.qa;

import java.util.Scanner;

public class Shop {

    static Scanner scanner = new Scanner(System.in);

    public static void printByTitle(Product[] productMas){
        System.out.println("Enter product title to find: ");
        String title = scanner.nextLine();
        for (Product product:productMas) {
            if(title.equalsIgnoreCase(product.getTitle())){
                System.out.println(product.toString());
            }
        }
        System.out.println("");
    }

    public static void printByTitleAndPrice(Product[] productMas){
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

        for (Product product:productMas) {
            if(title.equalsIgnoreCase(product.getTitle()) && maxPrice>=product.getPrice()){
                System.out.println(product.toString());
            }
        }
        System.out.println("");
    }

    public static void printByShelfLife(Product[] productMas){
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

        for (Product product:productMas) {
            if(minShelfLife<=product.getShelfLifeMonth()){
                System.out.println(product.toString());
            }
        }
        System.out.println("");
    }

}
