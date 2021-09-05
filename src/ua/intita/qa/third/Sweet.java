package ua.intita.qa.third;

public abstract class Sweet {
    double sugarPercentage;
    double weight;


    public Sweet(double sugarPercentage, double weight) {
        this.sugarPercentage = sugarPercentage;
        this.weight = weight;
    }

    public Sweet() {
    }

    public abstract String getName();

    public double getSugarPercentage() {
        return sugarPercentage;
    }

    public double getWeight() {
        return weight;
    }

}
