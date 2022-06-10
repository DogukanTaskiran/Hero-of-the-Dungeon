public class Shield extends Weapon {

    private double block;
    public void setBlock(double block) {

        this.block = block;
    }

    public double getBlock() {

        return block;
    }

    public Shield(String name, String type, double weight, double value, double block,int damage) {
        super(name, type, weight, value);
        this.block = block;
        setDamage(damage);
    }

    @Override
    public void itemInfo() {
        print.printCyan("Name: " + getName());
        print.printCyan("Weight: " + getWeight());
        print.printCyan("Value: " + getValue());
        print.printCyan("Damage: " + getDamage());
        print.printCyan("Block: " + getBlock());
    }

}