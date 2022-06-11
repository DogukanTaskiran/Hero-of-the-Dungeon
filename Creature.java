import java.util.ArrayList;

public class Creature {
    private double strength;
    private double vitality;
    private double intelligence;
    private long hp;
    private Weapon weapon;
    private Armor armor;
    private ArrayList<Items> inventory;

    Print print = new Print();

    public double getStrength() {
        return strength;
    }

    public void setStrength(double strength) {
        this.strength = strength;
    }

    public double getVitality() {
        return vitality;
    }

    public void setVitality(double vitality) {
        this.vitality = vitality;
    }

    public double getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(double intelligence) {
        this.intelligence = intelligence;
    }

    public void setHp(double hp) {
        hp = Math.round(0.7 * vitality + 0.2 * strength + 0.1 * intelligence);

        if (hp > 35) {
            hp = 35;
        }
        if (hp < 0) {
            hp = 0;
        }
    }

    public long getHp() {
        return hp;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public ArrayList<Items> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Items> inventory) {
        this.inventory = inventory;
    }

    public void displayMenu() {
        print.printYellow("Strength of " + getClass() + " is : " + getStrength());
        print.printYellow("Vitality of " + getClass() + " is : " + getVitality());
        print.printYellow("Intelligence of " + getClass() + " is : " + getIntelligence());
        print.printYellow("HP of " + getClass() + " is : " + Math.round(0.7 * getVitality() + 0.2 * getStrength() + 0.1 * getIntelligence()) + "\n");
    }

    public void attack(Characters character, Creature creature) {

    }

    public void attack(Creature creature, Characters character) {

    }

    public void pick() {

    }

    public void wield(Weapon weapon) {
        System.out.println(getInventory());
    }

    public void wear(Armor armor) {
        System.out.println(getInventory());
    }

    public void examine() {
    }


}