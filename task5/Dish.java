package tasks.task5;

abstract class Dish {
    String material;
    int weight;

    public void setMaterial(String material) {
        this.material = material;
    }
    public String getMaterial() {
        return material;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public int getWeight() {
        return weight;
    }
}

class Plate extends Dish {
    String color;
    int diameter;

    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }
    public int getDiameter() {
        return diameter;
    }

    @Override
    public String toString() {
        return "Plate {" +
                "material: " + material + "; " +
                "weight: " + weight + " gr; " +
                "color: " + color + "; " +
                ", diameter: " + diameter + " cm" +
                '}';
    }
}

class Cup extends Dish {
    String color;
    int height;
    int diameter;
    int volume;

    Cup(int heightInCm, int diameterInCm) {
        setHeight(heightInCm);
        setDiameter(diameterInCm);

        calcVolumeInCubicCm();
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }

    public void setHeight(int heightInCm) {
        this.height = heightInCm;
    }
    public int getHeight() {
        return height;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }
    public int getDiameter() {
        return diameter;
    }

    public void calcVolumeInCubicCm() {
        double radius = Double.valueOf(diameter) / 2;
        double cpcty = Math.PI * Math.pow(radius, 2) * height;
        this.volume = (int)cpcty;
    }

    public int getCapacityInMl() {
        return volume;
    }

    @Override
    public String toString() {
        return "Cup {" +
                "material: " + material + "; " +
                "weight: " + weight + " gr; " +
                "color: " + color + "; " +
                "height: " + height + " cm; " +
                "diameter: " + diameter + " cm; " +
                "volume: " + volume + " cm^3" +
                '}';
    }
}

class Spoon extends Dish {
    int length;
    int thickness;

    public void setLength(int length) {
        this.length = length;
    }
    public int getLength() {
        return length;
    }

    public void setThicknessInMm(int thickness) {
        this.thickness = thickness;
    }
    public int getThickness() {
        return thickness;
    }

    @Override
    public String toString() {
        return "Spoon {" +
                "material: " + material + "; " +
                "weight: " + weight + " gr; " +
                "length: " + length + " cm; " +
                "thickness: " + thickness + " mm" +
                '}';
    }
}

class DishMain {
    public static void main(String[] args) {
        Plate pl1 = new Plate();
        pl1.setMaterial("porcelain");
        pl1.setWeight(200);
        pl1.setColor("transparent");
        pl1.setDiameter(20);

        System.out.println(pl1);

        Cup cp1 = new Cup(10, 5);
        cp1.setMaterial("glass");
        cp1.setWeight(100);
        cp1.setColor("white");

        System.out.println(cp1);

        Spoon sp1 = new Spoon();
        sp1.setMaterial("Stainless steel");
        sp1.setWeight(90);
        sp1.setLength(15);
        sp1.setThicknessInMm(3);

        System.out.println(sp1);
    }
}