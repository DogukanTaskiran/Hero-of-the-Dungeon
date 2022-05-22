public class Items {
    private String name;
    private double value;
    private double weight;

    public Items(String name, double weight, double value) {

    }

    public Items(){

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

    public void ItemInfo(){
        System.out.println("\nName: " + getName());
        System.out.println("Weight: "+getWeight());
        System.out.println("Value: "+getValue());
    }
}
