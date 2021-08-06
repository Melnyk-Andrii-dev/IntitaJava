package ua.intita.qa;

public class Product {
    private int id;
    private String title;
    private long upc;
    private String manufacturer;
    private double price;
    private int shelfLifeMonth;
    private int amount;


    public Product(int id, String title, long upc, String manufacturer, double price, int shelfLifeMonth, int amount) {
        this.id = id;
        this.title = title;
        this.upc = upc;
        this.manufacturer = manufacturer;
        this.price = price;
        this.shelfLifeMonth = shelfLifeMonth;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getUpc() {
        return upc;
    }

    public void setUpc(long upc) {
        this.upc = upc;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getShelfLifeMonth() {
        return shelfLifeMonth;
    }

    public void setShelfLifeMonth(int shelfLifeMonth) {
        this.shelfLifeMonth = shelfLifeMonth;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", upc=" + upc +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", shelfLifeMonth=" + shelfLifeMonth +
                ", amount=" + amount +
                '}';
    }
}
