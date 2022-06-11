public class Sword extends Weapon {

    private double parry;

    Fighter fighter = new Fighter();

    public void setParry(double parry) {

        this.parry = parry;
    }

    public double getParry() {

        return parry;
    }

    public Sword(String name, double value, double weight, double damage, double parry) {
        super.setName(name);
        super.setValue(value);
        super.setWeight(weight);
        super.setDamage(damage + fighter.getStrength());
        this.setParry(parry);
    }

    public Sword() {

    }

    @Override
    public void itemInfo() {
        print.printCyan("\nName: " + getName());
        print.printCyan("Weight: " + getWeight());
        print.printCyan("Value: " + getValue());
        print.printCyan("Damage: " + getDamage());
        print.printCyan("Parry: " + getParry());
    }

}