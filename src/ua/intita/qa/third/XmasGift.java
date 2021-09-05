package ua.intita.qa.third;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class XmasGift {
    double weight;
    Sweet[] sweets;

    public XmasGift(Sweet[] sweets) {
        this.weight = calculateWeight(sweets);
        this.sweets = sortByName(sweets);
    }

    private double calculateWeight(Sweet[] sweets){
        double result = 0;
        for (Sweet sweet:sweets) {
            result = result + sweet.getWeight();
        }
        return result;
    }

    public XmasGift() {
    }

    private Sweet[] sortByName(Sweet[] sweets){
        Comparator<Sweet> sweetComparator = Comparator.comparing(Sweet::getName);
        Arrays.sort(sweets, sweetComparator);
        return sweets;
    }

    public Sweet[] findBySugar(double from, double to){
        if(this.sweets == null || from>to){
            System.out.println("ERROR, incorrect parameters");
            return null;
        }
        ArrayList<Sweet> foundSweets = new ArrayList<>();
        for (Sweet sweet : this.sweets) {
            if(sweet.getSugarPercentage()>=from && sweet.getSugarPercentage()<=to){
                foundSweets.add(sweet);
            }
        }
        return foundSweets.toArray(new Sweet[0]);
    }

    @Override
    public String toString() {
        return "XmasGift{" +
                "weight=" + weight +
                ", sweets=" + Arrays.toString(sweets) +
                '}';
    }
}
