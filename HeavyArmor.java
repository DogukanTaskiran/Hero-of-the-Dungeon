public class HeavyArmor extends Armor {
    public HeavyArmor(String name, double weight, double value, double damage, double resistance) {
        super(name, weight, value, damage, resistance);

    }

    @Override
    public void itemInfo() {
        print.printCyan("\nName: " + getName());
        print.printCyan("Weight: " + getWeight());
        print.printCyan("Value: " + getValue());
        print.printCyan("Resistance: " + getResistance());
    }
}