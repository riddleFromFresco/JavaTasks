package tasks.task5;

import java.util.Vector;

abstract class Furniture {
    String material;
    String country;
    int height;

    public void setMaterial(String material) {
        this.material = material;
    }
    public String getMaterial() {
        return material;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    public String getCountry() {
        return country;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public int getHeight() {
        return height;
    }
}

class Table extends Furniture {
    int legsNum;
    int tabletopDiameter;

    Table(String material, String country, int height, int legsNum, int tabletopDiameter) {
        this.setMaterial(material);
        this.setCountry(country);
        this.setHeight(height);
        this.setLegsNum(legsNum);
        this.setTabletopDiameter(tabletopDiameter);
    }

    Table() {
        this.setMaterial("");
        this.setCountry("");
        this.setHeight(0);
        this.setLegsNum(0);
        this.setTabletopDiameter(0);
    }

    public void setLegsNum(int legsNum) {
        this.legsNum = legsNum;
    }
    public int getLegsNum() {
        return legsNum;
    }

    public void setTabletopDiameter(int tabletopDiameter) {
        this.tabletopDiameter = tabletopDiameter;
    }
    public int getTabletopDiameter() {
        return tabletopDiameter;
    }

    @Override
    public String toString() {
        return "Table{" +
                "material: " + material + "; " +
                "country: " + country + "; " +
                "height: " + height + "; " +
                "number of legs: " + legsNum + "; " +
                "tabletop diameter: " + tabletopDiameter +
                '}';
    }
}

class Cupboard extends Furniture {
    int doorsNum;
    int width;
    int depth;

    Cupboard(String material, String country, int height, int width, int doorsNum, int depth) {
        this.setMaterial(material);
        this.setCountry(country);
        this.setHeight(height);
        this.setWidth(width);
        this.setDoorsNum(doorsNum);
        this.setDepth(depth);
    }

    Cupboard() {
        this.setMaterial("");
        this.setCountry("");
        this.setHeight(0);
        this.setWidth(0);
        this.setDoorsNum(0);
        this.setDepth(0);
    }

    public void setDoorsNum(int doorsNum) {
        this.doorsNum = doorsNum;
    }
    public int getDoorsNum() {
        return doorsNum;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    public int getWidth() {
        return width;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }
    public int getDepth() {
        return depth;
    }

    @Override
    public String toString() {
        return "Cupboard{" +
                "material: " + material + "; " +
                "country: " + country + "; " +
                "height: " + height + "; " +
                "number of doors: " + doorsNum + "; " +
                "width: " + width + "; " +
                "depth: " + depth +
                '}';
    }
}

class FurnitureShop {
    Vector<Table> tables = new Vector<Table>();
    Vector<Cupboard> cupboards = new Vector<Cupboard>();

    public void addTable(Table table) {
        tables.add(table);
    }
    public void addCupboard(Cupboard cupboard) {
        cupboards.add(cupboard);
    }

    public int getTablesNum() {
        return tables.size();
    }
    public int getCupboardsNum() {
        return cupboards.size();
    }

    Cupboard sellCupboard(int height, int width, int depth, String material) {
        for(Cupboard cpbrd: cupboards) {
            if (cpbrd.getHeight() == height && cpbrd.getWidth() == width && cpbrd.getDepth() == depth
                    && cpbrd.getMaterial() == material){
                cupboards.remove(cpbrd);
                return cpbrd;
            }
        }
        return new Cupboard();
    }

    Table sellTable(int height, int legsNum, int diam, String material) {
        for(Table tbl: tables) {
            if (tbl.getHeight() == height && tbl.getLegsNum() == legsNum && tbl.getTabletopDiameter() == diam
                    && tbl.getMaterial() == material){
                tables.remove(tbl);
                return tbl;
            }
        }
        return new Table();
    }
}

class FurnitureMain {
    public static void main(String[] args) {
        Cupboard model1 = new Cupboard("oak", "USA", 150, 70, 2, 50);
        Cupboard model2 = new Cupboard("birch", "Russia", 120, 50, 1, 40);
        Cupboard model3 = new Cupboard("maple", "Russia", 200, 100, 2, 80);

        Table tb1 = new Table("oak", "Russia", 100, 4, 50);
        Table tb3 = new Table("maple", "Russia", 120, 4, 110);

        FurnitureShop shop = new FurnitureShop();
        shop.addCupboard(model1);
        shop.addCupboard(model2);
        shop.addCupboard(model3);
        shop.addTable(tb1);
        shop.addTable(tb3);

        System.out.println("number of cupboards: " + shop.getCupboardsNum());
        System.out.println("number of tables: " + shop.getTablesNum());

        Table newTable = shop.sellTable(100, 4, 50, "oak");
        System.out.println(newTable);

        Cupboard newCupboard = shop.sellCupboard(200, 100, 80, "maple");
        System.out.println(newCupboard);

        System.out.println("number of cupboards: " + shop.getCupboardsNum());
        System.out.println("number of tables: " + shop.getTablesNum());

    }

}