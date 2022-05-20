public abstract class Sword extends Weapon {
    private double parry;


    public void setParry(double parry) {

        this.parry = parry;
    }

    public double getParry() {

        return parry;
    }

    @Override
    public void setDamage(double damage) {
        super.setDamage(damage * 2);      // 2 yerine strength gelecek.
    }

    Sword() {

    }

    Sword(double damage, double parry) {
        super.setDamage(damage);
        this.parry = parry;
    }
}
