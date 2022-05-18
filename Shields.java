package CannonFodder;

import java.security.SecureRandom;
public class Shields extends Weapons {
    SecureRandom random=new SecureRandom();

    public Shields(String name, int rareLevel, String rarity, int attack, int vitality, int intelligence){
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
        else{
            setRarity("Rare");
            setAttack(attack+1);
            setVitality(vitality+2);
            setIntelligence(intelligence+1);
        }
    }

    @Override
    public void itemInfo(){
        super.itemInfo();
    }
}
