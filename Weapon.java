public class Weapon extends Items {

    public Weapon(String name, String type, double weight, double value) {
        super(name, type, weight, value);
    }

    @Override
    public void itemInfo() {
        super.itemInfo();
        print.printCyan("Damage: " + getDamage());
    }

}