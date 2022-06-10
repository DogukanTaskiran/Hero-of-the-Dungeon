public class Armor extends Items {
    private double resistance;
    private double damage;

    public double getResistance() {

        return resistance;
    }

    public void setResistance(double resistance) {
        this.resistance = resistance;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public Armor(String name, String type, double weight, double value) {
        super(name, type, weight, value);
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

}

