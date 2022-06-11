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
        print.printYellow("HP of " + getClass() + " is : " + Math.round(0.7 * getVitality() + 0.2 * getStrength() + 0.1 * getIntelligence()) + "\n");
    }

    public abstract void pick();

    public abstract void examine();

    public void specialAttackHeavyAttack(Characters fighter, Sword sword, Creature creature) {
        creature.setHp((getHp() - fighter.getStrength() * sword.getDamage()) - 7);
        fighter.setHp(fighter.getHp() - 5);
    }
    public void specialAttackHeal(Characters healer, Characters tank, Characters fighter, Wand wand) {
        tank.setHp(wand.getHeal() + tank.getHp());
        fighter.setHp(wand.getHeal() + fighter.getHp());
        healer.setHp(wand.getHeal() + healer.getHp());
    }
}