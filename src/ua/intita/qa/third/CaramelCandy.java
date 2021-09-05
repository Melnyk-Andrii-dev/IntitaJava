package ua.intita.qa.third;

public class CaramelCandy extends Sweet {
    String candyName;
    String CaramelFlovor;

    @Override
    public String toString() {
        return "CaramelCandy{" +
                "candyName='" + candyName + '\'' +
                ", CaramelFlovor='" + CaramelFlovor + '\'' +
                ", sugarPercentage=" + sugarPercentage +
                ", weight=" + weight +
                '}';
    }

    public CaramelCandy(String candyName, String CaramelFlovor, double sugarPercentage, double weight) {
        super(sugarPercentage, weight);
        this.candyName = candyName;
        this.CaramelFlovor = CaramelFlovor;
    }

    public CaramelCandy() {
    }

    @Override
    public String getName() {
        return candyName;
    }

}
