package ua.intita.qa.showroom;

public class Main {
    public static void main(String[] args) {
        //Car myCar = new Car("VW", 2021, 300.0, (byte)6, 2.0f, 100000L, (short)5000, false);
        //System.out.println(Converter.toXML(myCar));

        Car myCar2 = (Car) Converter.fromXML("Car_Data.xml");
        System.out.println();
        System.out.println(myCar2);
        System.out.println();

    }
}
