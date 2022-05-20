public class InfiniteVoid extends Wand{
    private double blind;

    public void setBlind(double blind) {
        this.blind = blind;
    }

    public double getBlind() {
        return blind;
    }

    InfiniteVoid(){

    }

    InfiniteVoid(double damage, double heal, double blind){
        super.setDamage(damage);
        super.setHeal(heal);
        this.blind=blind;
    }
}
