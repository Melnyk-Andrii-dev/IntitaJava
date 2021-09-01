package ua.intita.qa.second;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Audi e-tron");
        Car.Engine myEngine = myCar.new Engine();
        Car.Wheel myWheel = myCar.new Wheel();

        myEngine.fulfil();
        myWheel.changeWheel();
        myCar.drive();
        myCar.showModel();

    }
}
