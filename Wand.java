public class Wand extends Weapon {

    public Wand(String name, String type, double weight, double value, int damage) {
            super(name, type, weight, value);
        setDamage(damage);
    }

    @Override
    public void itemInfo() {
        print.printCyan("\nName: " + getName());
        print.printCyan("Weight: " + getWeight());
        print.printCyan("Value: " + getValue());
        print.printCyan("Damage: " + getDamage());
    }

}