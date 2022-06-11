public class Shield extends Weapon {

    Print print = new Print();

    private double block;

    Tank tank=new Tank();

    public Shield(String name, double weight, double value, double damage) {
        super(name, weight, value, damage);
    }

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
        super.setDamage(damage + tank.getVitality());
        this.setBlock(block);
    }

    public Shield() {

    }

    @Override
    public void itemInfo() {
        print.printCyan("\nName: " + getName());
        print.printCyan("Weight: " + getWeight());
        print.printCyan("Value: " + getValue());
        print.printCyan("Damage: " + getDamage());
        print.printCyan("Block: " + getBlock());
    }

}