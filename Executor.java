public class Executor extends Wand{
    private double pentagram;

    public void setPentagram(double pentagram) {

        this.pentagram = pentagram;
    }

    public double getPentagram() {

        return pentagram;
    }

    Executor(){

    }
    Executor(double damage, double heal, double pentagram){
        super.setDamage(damage);
        super.setHeal(heal);
        this.pentagram=pentagram;
    }
}
