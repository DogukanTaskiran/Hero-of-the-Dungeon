import java.security.SecureRandom;
import java.util.ArrayList;

public class Creature {

    SecureRandom sr = new SecureRandom();
    Objects objects = new Objects();

    private double strength;
    private double vitality;
    private double intelligence;
    private int healthy;
    private int hp;
    private Weapon weapon;
    private Armor armor;
    private String characterType;
    private int characterDamage;
    private Enemy target;
    ArrayList<Items> Inventory = new ArrayList<>();
    Creature allyBase;

    public int getHealthy() {
        return healthy;
    }

    public void setHealthy(int healthy) {
        this.healthy = healthy;
    }

    public Creature getAllyBase() {
        return allyBase;
    }

    public void setAllyBase(Creature allyBase) {
        this.allyBase = allyBase;
    }

    public Creature(String characterType) {
        this.characterType = characterType;

    }


    public ArrayList<Items> getInventory() {
        return Inventory;
    }

    public void setInventory(ArrayList<Items> inventory) {
        Inventory = inventory;
    }

    public int getCharacterDamage() {
        return characterDamage;
    }

    public void setCharacterDamage(int characterDamage) {
        this.characterDamage = characterDamage;
    }

    Print print = new Print();

    public String getCharacterType() {
        return characterType;
    }

    public void setCharacterType(String characterType) {
        this.characterType = characterType;
    }


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

    public Enemy getTarget() {
        return target;
    }

    public void setTarget(Enemy target) {
        this.target = target;
    }

    public void selectCharacter() {
        calculateVitality();
        calculateStrength();
        calculateIntelligence();
        healthPoint();
        assigningWeapon();
        calculateCharacterDamage();
    }

    public void calculateVitality() {
        if (getCharacterType().equals("Tank")) {
            setVitality(sr.nextInt(6, 10));
        } else if (getCharacterType().equals("Healer")) {
            setVitality(sr.nextInt(1, 5));
        } else if (getCharacterType().equals("Fighter")) {
            setVitality(sr.nextInt(3, 7));
        }

    }

    public void calculateStrength() {
        if (getCharacterType().equals("Tank")) {
            setStrength(sr.nextInt(1, 5));
        } else if (getCharacterType().equals("Healer")) {
            setStrength(sr.nextInt(3, 7));
        } else if (getCharacterType().equals("Fighter")) {
            setStrength(sr.nextInt(6, 10));
        }
    }

    public void calculateIntelligence() {
        if (getCharacterType().equals("Tank")) {
            setIntelligence(sr.nextInt(3, 7));
        } else if (getCharacterType().equals("Healer")) {
            setIntelligence(sr.nextInt(6, 10));
        } else if (getCharacterType().equals("Fighter")) {
            setIntelligence(sr.nextInt(1, 5));
        }

    }

    public void healthPoint() {
        int hp = (int) Math.round(0.7 * getVitality() + 0.2 * getStrength() + 0.1 * getIntelligence());
        if (hp > 35) {
            hp = 35;
            setHp(hp);
            setHealthy(getHp());

        } else if (hp >= 0 && hp < 35) {
            setHealthy(getHp());
            setHp(hp);
        }
        if (hp < 0) {
            hp = 0;
            setHp(hp);
            setHealthy(getHp());
        }
    }

    public void calculateCharacterDamage() {
        if (getCharacterType().equals("Healer")) {
            setCharacterDamage((int) Math.round(getWeapon().getDamage() * getIntelligence()));
        } else if (getCharacterType().equals("Tank")) {
            setCharacterDamage((int) Math.round(getWeapon().getDamage() * getStrength()));
        } else if (getCharacterType().equals("Fighter")) {
            setCharacterDamage((int) Math.round(getWeapon().getDamage() * getStrength()));
        }

    }

    public void assigningWeapon() {
        if (getCharacterType().equals("Tank")) {
            setWeapon(objects.getShieldArrayList().get(sr.nextInt(0, objects.getShieldArrayList().size() - 1)));
            getInventory().add(getWeapon());
        } else if (getCharacterType().equals("Healer")) {
            setWeapon(objects.getWandArrayList().get(sr.nextInt(0, objects.getWandArrayList().size() - 1)));
            getInventory().add(getWeapon());
        } else if (getCharacterType().equals("Fighter")) {
            setWeapon(objects.getSwordArrayList().get(sr.nextInt(0, objects.getSwordArrayList().size() - 1)));
            getInventory().add(getWeapon());
        }
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getHp() {
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


    public void displayMenu() {
        print.printYellow("Type : " + getCharacterType() + "\t Strength: \t" + getStrength() + "\t Vitality:" + getVitality());
        print.printYellow("Intelligence of " + getCharacterType() + " is : " + getIntelligence());
        print.printYellow("HP of " + getCharacterType() + " is : " + getHp() + "\n");
        print.printYellow("***** ⇓ Weapon stats ⇓ *****");
        getWeapon().itemInfo();
        print.printYellow("***** ⇓ Armor stats  ⇓ *****");
        getArmor().itemInfo();
        print.printBlack("*****************************");
    }

    public void attack() {
        print.printRed(getCharacterType() + " is attacking " + getTarget().getName());
        getTarget().setHp(getTarget().getHp() - getCharacterDamage());
        print.printRed(getCharacterType() + " damaged " + getTarget().getName() + " for " + getCharacterDamage() + " damage.");
        if (getTarget().getHp() <= 0) {
            print.printRed(getTarget().getName() + " health is " + 0);
        } else
            print.printRed(getTarget().getName() + " health is " + getTarget().getHp());
    }

    public void ability() {


    }

}