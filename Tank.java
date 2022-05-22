import java.security.SecureRandom;
import java.util.ArrayList;

public class Tank extends Alliance {
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

    Armor armor1 =new Armor();

    LightArmor lightArmor = new LightArmor(items.getName(), items.getValue(), items.getWeight(), armor.getDamage(), armor.getResistance());
    MediumArmor mediumArmor=new MediumArmor(items.getName(), items.getValue(), items.getWeight(), armor.getDamage(), armor.getResistance());
    HeavyArmor heavyArmor = new HeavyArmor(items.getName(), items.getValue(), items.getWeight(), armor.getDamage(), armor.getResistance());

    public int tWeapon;

    public Tank(String name, long hp, int strength, int vitality, int intelligence, Items[] equipment,
                ArrayList<Items> inventory){
        super.setName(name);
        super.setHp(Math.round((0.7*vitality) + (0.2*strength) + (0.1*intelligence)));
        super.setStrength(randomStat.nextInt(5)+1);
        super.setVitality(randomStat.nextInt(5)+6);
        super.setIntelligence(randomStat.nextInt(5)+3);
        tWeapon=random.nextInt(9);
        if (tWeapon<7){
            super.equipment[0]=shields;
            super.equipment[1]=heavyArmor;
        }
        if (tWeapon==7){
            super.equipment[0]=swords;
            super.equipment[1]=heavyArmor;
        }
        if (tWeapon==8){
            super.equipment[0]=wands;
            super.equipment[1]=heavyArmor;
        }
        super.setInventory(inventory);
    }

    @Override
    public void attack(){
        setAttack(super.getVitality());
        System.out.println("Dealt " + getAttack() + " damage.");
    }

    @Override
    public void specialAction(){
        System.out.println("The target is stunned.");
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