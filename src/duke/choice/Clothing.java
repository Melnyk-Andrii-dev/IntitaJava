package duke.choice;

public class Clothing implements Comparable {

    public static final double MINIMUM_PRICE = 10;
    public static final double TAX_RATE = 0.2;

    private String description;
    private double price;
    private String size = "M";

    public Clothing(String description, double price, String size) {
        this.description = description;
        this.price = price;
        this.size = size;
    }

    public Clothing() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price + price * TAX_RATE;
    }

    public void setPrice(double price) {
        this.price = (price < MINIMUM_PRICE) ? MINIMUM_PRICE : price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Clothing{" +
                "description='" + description + '\'' +
                ", price=" + price +
                ", size='" + size + '\'' +
                '}';
    }

    @Override
    public int compareTo(Clothing other) {
        try {
            return this.getDescription().compareTo(other.getDescription());
        } catch (NullPointerException e){
            System.out.println(e.getMessage());
            return -999;
        } catch (ClassCastException e){
            System.out.println(e.getMessage());
            return -999;
        }
    }

    public Clothing[] sortByDescription(Clothing[] mas) {

        Clothing temp;

        for (int i = 0; i < mas.length; i++) {
            for (int j = i+1; j < mas.length; j++) {
                if(mas[i].compareTo(mas[j]) > 0){
                    temp = mas[i];
                    mas[i] = mas[j];
                    mas[j] = temp;
                }
            }
        }
        return mas;
    }
    
}
