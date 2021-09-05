package ua.intita.qa.third;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Sweet[] sweets = new Sweet[5];
        sweets[4] = new CaramelCandy("big bob", "apple", 50, 12 );
        sweets[3] = new CaramelCandy("alice", "carrot", 30, 20 );
        sweets[2] = new CaramelCandy("lemoneez", "lemon", 60, 15 );
        sweets[1] = new ChockolateCandy("prince", "dark", 30, 50 );
        sweets[0] = new ChockolateCandy("snowball", "white", 70, 65 );

        XmasGift merryXmas = new XmasGift(sweets);
        System.out.println(merryXmas.toString());
        System.out.println(Arrays.toString(merryXmas.findBySugar(45, 65)));

    }
}
