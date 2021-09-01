package ua.intita.qa.second;

public class Car {
    private String model;

    public Car(String model) {
        this.model = model;
    }

    public Car() {
    }

    void showModel() {
        System.out.println("model: " + model);
    }

    class Wheel implements Changeable{
//        private boolean madeOfLeather;
//        private boolean madeOfTextile;
//
//        public Wheel(boolean madeOfLeather, boolean madeOfTextile) {
//            this.madeOfLeather = madeOfLeather;
//            this.madeOfTextile = madeOfTextile;
//        }
//
//        public Wheel() {
//        }

        @Override
        public void changeWheel() {
            System.out.println("Car wheel changed");
        }
    }
    class Engine implements Fulfillable{
//        private int power;
//
//        public Engine(int power) {
//            this.power = power;
//        }
//
//        public Engine() {
//        }

        @Override
        public void fulfil() {
            System.out.println("Car engine gassed up");
        }
    }
    public void drive(){
        System.out.println("Wroom-wroom");
    }

}
