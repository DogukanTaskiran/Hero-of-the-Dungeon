public class Kronen extends Sword {

    private double criticalDamage;

    public void setCriticalDamage(double criticalDamage) {
        this.criticalDamage = criticalDamage;
    }

    public double getCriticalDamage() {
        return criticalDamage;
    }

    Kronen() {
    }

    Kronen(double damage, double parry,double criticalDamage) {

        super.setDamage(damage);
        this.criticalDamage=criticalDamage;
    }


}
