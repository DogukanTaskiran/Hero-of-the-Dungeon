public class Armor extends Items {
    private double resistance;
    private double damage;

    public Armor(){

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
    public void ItemInfo() {
        System.out.println("\nName: " + getName());
        System.out.println("Weight: " + getWeight());
        System.out.println("Value: " + getValue());
        System.out.println("Resistance: " + getResistance());
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }
}
