public class Sword extends Weapon {

    private double parry;

    public void setParry(double parry) {

        this.parry = parry;
    }

    public double getParry() {

        return parry;
    }

    public Sword(String name, String type, double weight, double value, double parry, int damage) {
        super(name, type, weight, value);
        this.parry = parry;
        setDamage(damage);
    }

    @Override
    public void itemInfo() {
        print.printCyan("Name: " + getName());
        print.printCyan("Weight: " + getWeight());
        print.printCyan("Value: " + getValue());
        print.printCyan("Damage: " + getDamage());
        print.printCyan("Parry: " + getParry());
    }

}