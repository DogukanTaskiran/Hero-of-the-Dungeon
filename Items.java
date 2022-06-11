public class Items {

    private String name;
    private double value;
    private double weight;

    Print print = new Print();

    public Items(String name, double weight, double value) {
        this.name = name;
        this.weight = weight;
        this.value = value;
    }

    public Items() {

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

    public void itemInfo() {
        print.printCyan("Name: " + getName());
        print.printCyan("Weight: " + getWeight());
        print.printCyan("Value: " + getValue());
    }
}
