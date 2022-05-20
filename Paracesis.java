public class Paracesis extends Sword {

    private double stun;

    public void setStun(double stun) {
        this.stun = stun;
    }

    public double getStun() {
        return stun;
    }

    Paracesis() {

    }

    Paracesis(double damage, double parry, double stun) {

        super.setDamage(damage);
        super.setParry(parry);
        this.stun=stun;
    }



}
