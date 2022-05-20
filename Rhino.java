public class Rhino extends Shield {

    private double thorn;

    public void setThorn(double thorn){
        this.thorn=thorn;
    }
    public double getThorn(){
        return thorn;
    }

    Rhino() {

    }

    Rhino(double damage, double block,double thorn) {
        super.setDamage(damage);
        super.setBlock(block);
        this.thorn=thorn;
    }
}
