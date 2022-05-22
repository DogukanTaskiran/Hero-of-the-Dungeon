public class Sword extends Weapon {

    private double parry;

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
        super.setDamage(damage * 2); // 2 yerine Strength gelecek.
        this.setParry(parry);
    }

    public Sword(){

    }

    @Override
    public void ItemInfo() {
        System.out.println("\nName: " + getName());
        System.out.println("Weight: " + getWeight());
        System.out.println("Value: " + getValue());
        System.out.println("Damage: " + getDamage());
        System.out.println("Parry: " + getParry());
    }
}