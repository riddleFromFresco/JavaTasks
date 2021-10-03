package tasks.task6;

interface Nameable {
    abstract public String getName();
}

class Cat implements Nameable {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}

class Planet implements Nameable {
    private String name;

    public Planet(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}

class Car implements Nameable {
    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}

class NameableTest {
    public static void main(String[] args) {
        Cat testCat = new Cat("Lucky");
        System.out.println(testCat.getName());

        Planet testPlanet = new Planet("Earth");
        System.out.println(testPlanet.getName());

        Car testCar = new Car("Zhiguli");
        System.out.println(testCar.getName());
    }
}