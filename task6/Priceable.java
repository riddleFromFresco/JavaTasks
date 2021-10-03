package tasks.task6;

public interface Priceable {
    abstract Double getPrice();
}

class Keyboard implements Priceable {
    Double price;

    public Keyboard(Double price) {
        this.price = price;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }
}

class Mouse implements Priceable {
    Double price;

    public Mouse(Double price) {
        this.price = price;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }
}

class Processor implements Priceable {
    Double price;

    public Processor(Double price) {
        this.price = price;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }
}

class PriceableTest {
    public static void main(String[] args) {
        Keyboard testKeyboard = new Keyboard(500.0);
        System.out.println(testKeyboard.getPrice());

        Mouse testMouse = new Mouse(400.0);
        System.out.println(testMouse.getPrice());

        Processor testProcessor = new Processor(5000.0);
        System.out.println(testProcessor.getPrice());
    }
}