package CannonFodder;

import java.security.SecureRandom;
public class HeavyArmor extends Armor{
    SecureRandom random=new SecureRandom();

    public HeavyArmor(String name, int rareLevel, String rarity, int attack, int vitality, int intelligence){
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
            setAttack(attack);
            setVitality(vitality+1);
            setIntelligence(intelligence);
        }
        else {
            setRarity("Rare");
            setAttack(attack);
            setVitality(vitality+3);
            setIntelligence(intelligence);
        }
    }

    @Override
    public void itemInfo(){
        super.itemInfo();
        System.out.println("This item is wearable by all classes.");
        System.out.println("This item has a punishment if worn by a healer or a fighter.");
    }
}
