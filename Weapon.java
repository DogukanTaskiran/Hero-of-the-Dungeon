import java.util.Random;

public abstract class Weapon {
    private double damage;

    public void setDamage(double damage) {

        this.damage = damage;
    }
    public double getDamage() {

        return damage;
    }

    Weapon(){
    }
    Weapon(double damage){

    }
}
