public class Wand extends Weapon {

    private double heal;

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
        super.setDamage(damage * intelligence); // 2 yerine Intelligence gelecek.
        this.setHeal(heal);
    }

    @Override
    public void ItemInfo() {
        System.out.println("\nName: " + getName());
        System.out.println("Weight: " + getWeight());
        System.out.println("Value: " + getValue());
        System.out.println("Damage: " + getDamage());
        System.out.println("Heal: " + getHeal());
    }
}
