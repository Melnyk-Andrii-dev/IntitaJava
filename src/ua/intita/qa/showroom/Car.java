package ua.intita.qa.showroom;

import java.util.Objects;

public class Car {
    private String brand;
    private int year;
    private double range;
    private byte cylinders;
    private float engineVolume;
    private long price;
    private short discount;
    private boolean isOnSale;

    public Car() {
    }

    public Car(String brand, int year, double range, byte cylinders, float engineVolume, long price, short discount, boolean isOnSale) {
        this.brand = brand;
        this.year = year;
        this.range = range;
        this.cylinders = cylinders;
        this.engineVolume = engineVolume;
        this.price = price;
        this.discount = discount;
        this.isOnSale = isOnSale;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getRange() {
        return range;
    }

    public void setRange(double range) {
        this.range = range;
    }

    public byte getCylinders() {
        return cylinders;
    }

    public void setCylinders(byte cylinders) {
        this.cylinders = cylinders;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public short getDiscount() {
        return discount;
    }

    public void setDiscount(short discount) {
        this.discount = discount;
    }

    public boolean isOnSale() {
        return isOnSale;
    }

    public void setOnSale(boolean onSale) {
        isOnSale = onSale;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", year=" + year +
                ", range=" + range +
                ", cylinders=" + cylinders +
                ", engineVolume=" + engineVolume +
                ", price=" + price +
                ", discount=" + discount +
                ", isOnSale=" + isOnSale +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year && Double.compare(car.range, range) == 0 && cylinders == car.cylinders && Float.compare(car.engineVolume, engineVolume) == 0 && price == car.price && discount == car.discount && isOnSale == car.isOnSale && Objects.equals(brand, car.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, year, range, cylinders, engineVolume, price, discount, isOnSale);
    }
}
