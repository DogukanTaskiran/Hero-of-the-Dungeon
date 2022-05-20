public abstract class Shield extends Weapon {

    private double block;

    public void setBlock(double block) {

        this.block = block;
    }

    public double getBlock() {

        return block;
    }

    @Override
    public void setDamage(double damage) {
        super.setDamage(damage * 2); // 2 yerine vitality olacak.
    }

    Shield() {

    }

    Shield(double damage, double block) {
        super.setDamage(damage);
        this.block = block;
    }


}
