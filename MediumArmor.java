package CannonFodder;

import java.security.SecureRandom;
public class MediumArmor extends Armor {
    SecureRandom random=new SecureRandom();

    public MediumArmor(String name, int rareLevel, String rarity, int attack, int vitality, int intelligence){
        setName(name);
        setRareLevel(random.nextInt(6));
        if (getRareLevel()>=0&&getRareLevel()<3){
            setRarity("Common");
            setAttack(attack);
            setVitality(vitality);
            setIntelligence(intelligence);
        }
        else if (getRareLevel()==3||getRareLevel()==4){
            setRarity("Uncommon");
            setAttack(attack+1);
            setVitality(vitality);
            setIntelligence(intelligence);
        }
        else {
            setRarity("Rare");
            setAttack(attack+2);
            setVitality(vitality+1);
            setIntelligence(intelligence);
        }
    }

    @Override
    public void itemInfo(){
        super.itemInfo();
        System.out.println("This item is Fighter and Healer exclusive.");
        System.out.println("This item has a punishment if worn by a Healer.");
    }
}
