import java.util.ArrayList;

public class Enemy extends Creature {

    Print print = new Print();
    Weapon weapon = new Weapon();
    Armor armor = new Armor();

    public Enemy() {

    }

    public Enemy(double strength, double vitality, double intelligence) {
        super.setStrength(strength);
        super.setVitality(vitality);
        super.setIntelligence(intelligence);
    }

    public Enemy(double strength, double vitality, double intelligence, Weapon weapon, Armor armor, ArrayList<Items> inventory) {
        super.setStrength(strength);
        super.setVitality(vitality);
        super.setIntelligence(intelligence);
        super.setWeapon(weapon);
        super.setArmor(armor);
        super.setInventory(inventory);
    }

    public void displayMenu() {
        print.printRed("\nStrength of " + getClass() + " is : " + getStrength());
        print.printRed("Vitality of " + getClass() + " is : " + getVitality());
        print.printRed("Intelligence of " + getClass() + " is : " + getIntelligence());
        print.printRed("HP of " + getClass() + " is : " + Math.round(0.7 * getVitality() + 0.2 * getStrength() + 0.1 * getIntelligence()));
        print.printBlack("**********************************************************");
    }

    public void attack(Creature creature, Characters characters) {
        characters.setHp(getHp() - getStrength() * weapon.getDamage());
    }
}
