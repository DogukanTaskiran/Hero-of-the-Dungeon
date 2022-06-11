public class LightArmor extends Armor {

    public LightArmor(String name, double value, double weight, double damage, double resistance) {
        super(name, value, weight, damage, resistance);
    }

    @Override
    public void itemInfo() {
        print.printCyan("\nName: " + getName());
        print.printCyan("Weight: " + getWeight());
        print.printCyan("Value: " + getValue());
        print.printCyan("Resistance: " + getResistance());
    }
}
