public class DeathStar extends Wand{
    private double fireDamage;

    public void setFireDamage(double fireDamage) {
        this.fireDamage = fireDamage;
    }

    public double getFireDamage() {
        return fireDamage;
    }

    DeathStar(){

    }

    DeathStar(double damage, double heal, double fireDamage){
        super.setDamage(damage);
        super.setHeal(heal);
        this.fireDamage=fireDamage;
    }
}
