public class Wand extends Weapon {

    private double heal;

    Healer healer=new Healer();

    public void setHeal(double heal) {

        this.heal = heal;
    }

    public double getHeal() {

        return heal;
    }

    public Wand(String name, double value, double weight, double damage, double heal) {
        super.setName(name);
        super.setValue(value);
        super.setWeight(weight);
        super.setDamage(damage + healer.getIntelligence());
        this.setHeal(heal);
    }

    public Wand() {

    }

    @Override
    public void itemInfo() {
        print.printCyan("\nName: " + getName());
        print.printCyan("Weight: " + getWeight());
        print.printCyan("Value: " + getValue());
        print.printCyan("Damage: " + getDamage());
        print.printCyan("Heal: " + getHeal());
    }
}