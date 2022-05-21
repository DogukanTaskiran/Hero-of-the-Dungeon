public class Shield extends Weapon {

    private double block;

    public void setBlock(double block) {

        this.block = block;
    }

    public double getBlock() {

        return block;
    }

    public Shield(String name, double value, double weight, double damage, double block) {
        super.setName(name);
        super.setValue(value);
        super.setWeight(weight);
        super.setDamage(damage * 2); // 2 yerine Vitality gelecek.
        this.setBlock(block);
    }

    @Override
    public void ItemInfo() {
        System.out.println("\nName: " + getName());
        System.out.println("Weight: " + getWeight());
        System.out.println("Value: " + getValue());
        System.out.println("Damage: " + getDamage());
        System.out.println("Parry: " + getBlock());
    }
}