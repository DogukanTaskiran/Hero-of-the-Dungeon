import java.util.Random;

public class Nikana extends Sword {

    Random random = new Random();
    double randomNumber = random.nextDouble(20);
    private double secondAttackChance;

    public void setSecondAttackChance(double secondAttackChance) {

        this.secondAttackChance = secondAttackChance;
    }

    public double getSecondAttackChance() {

        return secondAttackChance;
    }

    Nikana() {

    }

    Nikana(double damage, double parry, double secondAttackChance) {

        super.setDamage(damage);

        double secondAttackChangeValue = (secondAttackChance * randomNumber) / 100;
        setSecondAttackChance(secondAttackChangeValue);

        double parryValue = (parry * randomNumber) / 100;
        super.setParry(parryValue);

    }
}
