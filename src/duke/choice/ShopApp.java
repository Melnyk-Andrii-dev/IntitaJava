package duke.choice;

import java.util.Arrays;

public class ShopApp {

    public static void main(String[] args) {

        System.out.println(Clothing.MINIMUM_PRICE);
        System.out.println(Clothing.TAX_RATE);
        Customer c1 = new Customer("Pinky", 3);

        System.out.println("Welcome to our shop " + c1.getName());

        Clothing item1 = new Clothing("Blue Jacket", 20.9,"M" );
        Clothing item2 = new Clothing("Orange T-Short",10.5, "S" );

        Clothing[] items = {item1, item2, new Clothing("Green Scarf", 5, "S"),
                new Clothing()};
        items[3].setDescription("Blue T-Short");
        items[3].setPrice(10.5);
        items[3].setSize("S");

        c1.addItems(items);

        int measurement = 3;

        items = items[0].sortByDescription(items);

        for (Clothing item : items) {
            System.out.println(item.toString());
        }
        System.out.println("Total: " + c1.getTotalClothingCost());
        System.out.println("Average: " + c1.getAverageClothingCost());

    }
}
