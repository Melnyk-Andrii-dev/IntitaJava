package ua.intita.qa;

public class Main {
    public static void main(String[] args) {
        Product[] productMas = new Product[5];
        productMas[0] = new Product(1, "pasta", 111111111, "Pasta LTD", 15.50, 12, 20);
        productMas[1] = new Product(2, "pizza", 2222222, "Pizza LTD", 55.50, 1, 2);
        productMas[2] = new Product(3, "souse", 333, "Souse Inc", 1.50, 2, 5);
        productMas[3] = new Product(4, "pasta", 44444, "Pasta2 LTD", 10.50, 2, 300);
        productMas[4] = new Product(5, "iCheese", 55, "Apple", 150.50, 12, 20);

        Shop.printByTitle(productMas);
        Shop.printByTitleAndPrice(productMas);
        Shop.printByShelfLife(productMas);
    }


}
