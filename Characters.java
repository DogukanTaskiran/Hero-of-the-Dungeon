import java.util.ArrayList;

public abstract class Characters extends Creature {

    public Characters() {

    }

    public Characters(double strength, double vitality, double intelligence, Weapon weapon, Armor armor, ArrayList<Items> inventory) {
        super.setStrength(strength);
        super.setVitality(vitality);
        super.setIntelligence(intelligence);
        super.setWeapon(weapon);
        super.setArmor(armor);
        super.setInventory(inventory);
    }

    public void displayMenu() {
        print.printYellow("Strength of " + getClass() + " is : " + getStrength());
        print.printYellow("Vitality of " + getClass() + " is : " + getVitality());
        print.printYellow("Intelligence of " + getClass() + " is : " + getIntelligence());
        print.printYellow("HP of " + getClass() + " is : " + Math.round(0.7 * getVitality() + 0.2 * getStrength() + 0.1 * getIntelligence())+"\n");
    }

    public abstract void pick();

    public abstract void examine();
}