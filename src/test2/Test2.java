package test2;

public class Test2 {
    public static void main(String[] args) {

        Recyclable[] rubbish = new Recyclable[5];

        rubbish[0] = new Clothing();
        rubbish[1] = new Tailored();
        rubbish[2] = new Bottle();
        //rubbish[3] = new Recyclable();
        //rubbish[4] = new Battery();

    };

}

interface Recyclable{
    void recycle();
}
interface Comparable{
    void compare();
}

class Clothing implements Recyclable, Comparable {

    @Override
    public void recycle() {
        
    }

    @Override
    public void compare() {

    }
}

class Tailored extends Clothing{

}

class Bottle implements Recyclable, Comparable{

    @Override
    public void recycle() {

    }

    @Override
    public void compare() {

    }
}

class Battery implements Comparable{

    @Override
    public void compare() {

    }
}
