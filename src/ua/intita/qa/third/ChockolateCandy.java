package ua.intita.qa.third;

public class ChockolateCandy extends Sweet {
    String candyName;
    String chocholateType;

    public ChockolateCandy(String candyName, String chocholateType, double sugarPercentage, double weight) {
        super(sugarPercentage, weight);
        this.candyName = candyName;
        this.chocholateType = chocholateType;
    }

    public ChockolateCandy() {
    }

    @Override
    public String getName() {
        return candyName;
    }

    @Override
    public String toString() {
        return "ChockolateCandy{" +
                "candyName='" + candyName + '\'' +
                ", chocholateType='" + chocholateType + '\'' +
                ", sugarPercentage=" + sugarPercentage +
                ", weight=" + weight +
                '}';
    }
}
