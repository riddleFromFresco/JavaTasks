package tasks.task5;

abstract class Dog {
    String ears;
    String coat;
    String size;

    public void setEars(String earShape) {
        this.ears = earShape;
    }

    public String getEars() {
        return ears;
    }

    public void setCoat(String coat) {
        this.coat = coat;
    }

    public String getCoat() {
        return coat;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    abstract public void bark();

}

class GermanShepherd extends Dog {
    GermanShepherd() {
        setSize("medium");
        setEars("pointed, medium");
        setCoat("short");
    }

    @Override
    public void bark() {
        System.out.println("BARK BARK");
    }

    @Override
    public String toString() {
        return ("German Shepherd{" +
                "size: " + size + "; " +
                "ears: " + ears + "; " +
                "coat: " + coat +
                '}');
    }
}

class AmericanPitBullTerrier extends Dog {
    AmericanPitBullTerrier() {
        setSize("medium");
        setEars("pointed, small");
        setCoat("very short");
    }

    @Override
    public void bark() {
        System.out.println("BARK bark bark");
    }

    @Override
    public String toString() {
        return ("AmericanPitBullTerrier{" +
                "size: " + size + "; " +
                "ears: " + ears + "; " +
                "coat: " + coat +
                '}');
    }
}

class Spitz extends Dog {
    Spitz() {
        setSize("small");
        setEars("rounded, small");
        setCoat("long, fluffy");
    }

    @Override
    public void bark() {
        System.out.println("bArk gmm bArk");
    }

    @Override
    public String toString() {
        return ("Spitz{" +
                "size: " + size + "; " +
                "ears: " + ears + "; " +
                "coat: " + coat +
                '}');
    }
}

class DogMain {
    public static void main(String[] args) {
        GermanShepherd rex = new GermanShepherd();
        System.out.println(rex);
        rex.bark();

        AmericanPitBullTerrier buddy = new AmericanPitBullTerrier();
        System.out.println(buddy);
        buddy.bark();

        Spitz beau = new Spitz();
        System.out.println(beau);
        beau.bark();
    }
}