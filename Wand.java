public abstract class Wand extends Weapon {
    private double heal;

    public void setHeal(double heal) {
        this.heal = heal;
    }

    public double getHeal() {
        return heal;
    }

    @Override
    public void setDamage(double damage) {
        double damageValue = damage * 2; // 2 yerine intelligence gelecek.
        super.setDamage(damageValue);  // 15-23
    }

    Wand() {

    }

    Wand(double damage, double heal) {
        super.setDamage(damage);
        this.heal = heal;
    }

}
