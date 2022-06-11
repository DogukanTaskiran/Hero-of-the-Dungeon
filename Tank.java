import java.util.ArrayList;
import java.util.Scanner;

public class Tank extends Characters {

    Scanner input=new Scanner(System.in);
    Weapon weapon = new Weapon();
    Armor armor = new Armor();
    Print print = new Print();
    public int choose;

    public Tank() {

    }

    public Tank(double strength, double vitality, double intelligence, Weapon weapon, Armor armor, ArrayList<Items> inventory) {
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
        print.printYellow("HP of " + getClass() + " is : " + Math.round(0.7 * getVitality() + 0.2 * getStrength() + 0.1 * getIntelligence()) + "\n");
        print.printYellow("⇓ Weapon stats ⇓");
        super.getWeapon().itemInfo();
        print.printYellow("\n⇓ Armor stats ⇓");
        super.getArmor().itemInfo();
        print.printBlack("************************************************");
    }

    public void attack(Tank tank, Creature creature) {
        creature.setHp(getHp() - tank.getVitality() * weapon.getDamage());
    }
    @Override
    public void pick(){
        getInventory().add(weapon);
        getInventory().add(armor);
    }

    @Override
    public void wield(Weapon weapon){
        super.wield(weapon);
        System.out.println("Choose a weapon to equip.");
        choose=input.nextInt();
        setWeapon((Weapon) getInventory().get(choose));
        super.getWeapon().itemInfo();
    }

    @Override
    public void wear(Armor armor){
        super.wear(armor);
        System.out.println("Choose an armor to equip.");
        choose=input.nextInt();
        setArmor((Armor) getInventory().get(choose));
        super.getArmor().itemInfo();
    }

    @Override
    public void examine(){
        System.out.println(getInventory());
    }
}