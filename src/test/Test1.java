package test;

public class Test1 {
    public static void main(String[] args) {
        Clothing[] items = {new Clothing(), new Tailored()};
        System.out.println(items[1].getPrice());


    }
    static class Clothing{
        private double price = 10.00;

        public double getPrice() {
            return price;
        }
    }

    static class Tailored extends Clothing {
        private double fee = 0.99;

        public double getPrice() {
            return super.getPrice() + fee;
        }
    }
}

