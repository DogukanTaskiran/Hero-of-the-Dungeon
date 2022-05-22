public class Weapon extends Items{
    private double damage;

    public void setDamage(double damage) {

        this.damage = damage;
    }
    public double getDamage() {

        return damage;
    }
    public Weapon(String name,double weight,double value,double damage){
        super.setName(name);
        super.setWeight(weight);
        super.setValue(value);
        this.damage=damage;
    }

    public Weapon(){

    }
    @Override
    public void ItemInfo() {
        super.ItemInfo();
        System.out.println("Damage: "+getDamage());
    }
}
