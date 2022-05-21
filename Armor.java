public class Armor extends Items{
    private double resistance;

    public double getResistance() {
        return resistance;
    }

    public void setResistance(double resistance) {
        this.resistance = resistance;
    }

    public Armor(String name, double value, double weight, double damage,double resistance){
        super.setName(name);
        super.setValue(value);
        super.setWeight(weight);
        this.setResistance(resistance);
    }
    @Override
    public void ItemInfo() {
        System.out.println("\nName: " + getName());
        System.out.println("Weight: " + getWeight());
        System.out.println("Value: " + getValue());
        System.out.println("Resistance: " + getResistance());
    }
}
