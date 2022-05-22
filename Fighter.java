import java.util.ArrayList;
import java.security.SecureRandom;

public class Fighter extends Alliance {
    SecureRandom random=new SecureRandom();
    SecureRandom randomStat=new SecureRandom();

    Sword swords = new Sword();
    Items items = new Items();
    Weapon weapons = new Weapon();
    Shield shield = new Shield();
    Armor armor = new Armor();
    Wand wand = new Wand();

    Sword sword = new Sword(items.getName(), items.getWeight(), items.getValue(), weapons.getDamage(), swords.getParry());
    Shield shields = new Shield(items.getName(), items.getValue(), items.getWeight(), weapons.getDamage(), shield.getBlock());
    Wand wands = new Wand(items.getName(), items.getWeight(), items.getValue(), weapons.getDamage(), wand.getHeal());

    LightArmor lightArmor = new LightArmor(items.getName(), items.getValue(), items.getWeight(), armor.getDamage(), armor.getResistance());
    MediumArmor mediumArmor=new MediumArmor(items.getName(), items.getValue(), items.getWeight(), armor.getDamage(), armor.getResistance());
    HeavyArmor heavyArmor = new HeavyArmor(items.getName(), items.getValue(), items.getWeight(), armor.getDamage(), armor.getResistance());

    public int fWeapon;

    public Fighter(String name, long hp, int strength, int vitality, int intelligence, Items[] equipment, ArrayList<Items> inventory){

        super.setName(name);
        super.setHp(Math.round((0.7*vitality) + (0.2*strength) + (0.1*intelligence)));
        super.setStrength(randomStat.nextInt(5)+6);
        super.setVitality(randomStat.nextInt(5)+3);
        super.setIntelligence(randomStat.nextInt(5)+1);

        fWeapon=random.nextInt(9);
        if (fWeapon<7){
            super.equipment[0]=sword;
            super.equipment[1]=mediumArmor;
        }
        if (fWeapon==7){
            super.equipment[0]=shields;
            super.equipment[1]=mediumArmor;
        }
        if (fWeapon==8){
            super.equipment[0]=wands;
            super.equipment[1]=mediumArmor;
        }
        super.setInventory(inventory);
    }

    @Override
    public void attack(){
        setAttack(super.getStrength());
        System.out.println("Dealt " + getAttack() + " damage.");
    }

    @Override
    public void specialAction(){
        System.out.println("Target has can not damage Fighter.");
    }

    @Override
    public void pick(){
        super.pick();
    }

    @Override
    public void wield(){
        super.wield();
    }

    @Override
    public void wear(){
        super.wear();
    }

    @Override
    public void examine(){
        super.examine();
    }

    @Override
    public void listInventory(){
        super.listInventory();
    }
}