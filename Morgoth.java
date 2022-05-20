public class Morgoth extends Shield {

    private double damageAbsorption;

    public void setDamageAbsorption(double damageAbsorption){
        this.damageAbsorption=damageAbsorption;
    }

    public double getDamageAbsorption(){
        return damageAbsorption;
    }

    Morgoth() {

    }

    Morgoth(double damage, double block, double damageAbsorption) {
        super.setDamage(damage);
        super.setBlock(block);
        this.damageAbsorption=damageAbsorption;
    }
}
