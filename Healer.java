import java.util.ArrayList;
import java.util.Scanner;

public class Healer extends Characters {

    Scanner input=new Scanner(System.in);
    Print print = new Print();
    Weapon weapon = new Weapon();
    Armor armor = new Armor();
    public int choose;

    public Healer() {

    }

    public Healer(double strength, double vitality, double intelligence, Weapon weapon, Armor armor, ArrayList<Items> inventory) {
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

    public void attack(Healer healer, Creature creature) {
        creature.setHp(getHp() - healer.getIntelligence() * weapon.getDamage());
    }

    public void specialAttackHeal(Healer healer, Tank tank, Fighter fighter, Wand wand) {
        tank.setHp(wand.getHeal() + tank.getHp());
        fighter.setHp(wand.getHeal() + fighter.getHp());
        healer.setHp(wand.getHeal() + healer.getHp());
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