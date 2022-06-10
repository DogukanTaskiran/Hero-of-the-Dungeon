public class Items {
    Print print = new Print();

    private String name;
    private double value;
    private double weight;
    private double damage;
    private String type;

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Items(String name, String type,double weight, double value) {
        this.name=name;
        this.type = type;
        this.weight=weight;
        this.value=value;
    }

    public void itemInfo() {
        print.printCyan("Name: " + getName());
        print.printCyan("Weight: " + getWeight());
        print.printCyan("Value: " + getValue());
    }
}