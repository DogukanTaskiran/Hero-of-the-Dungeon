public class Armor extends Items {
    private double resistance;
    private double damage;

    Print print = new Print();

    public Armor() {

    }

    public double getResistance() {

        return resistance;
    }

    public void setResistance(double resistance) {
        this.resistance = resistance;
    }

    public Armor(String name, double value, double weight, double damage, double resistance) {
        super.setName(name);
        super.setValue(value);
        super.setWeight(weight);
        setDamage(damage);
        setResistance(resistance);
    }

    @Override
    public void itemInfo() {
        print.printCyan("\nName: " + getName());
        print.printCyan("Weight: " + getWeight());
        print.printCyan("Value: " + getValue());
        print.printCyan("Resistance: " + getResistance());
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }
}
