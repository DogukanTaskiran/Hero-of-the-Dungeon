package CannonFodder;

import java.security.SecureRandom;
public class Items {
    SecureRandom random=new SecureRandom();
    private String name;
    private String rarity;
    private int attack;
    private int vitality;
    private int intelligence;
    private int rareLevel;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {return name;}

    public Items(String name){
        setName(name);
    }
    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public String getRarity(){return rarity;}

    public void setAttack(int attack) {
        if (attack<0)
            attack=0;
        this.attack = attack;
    }

    public int getAttack() {return attack;}

    public void setVitality(int vitality) {
        if (vitality<0)
            vitality=0;
        this.vitality = vitality;
    }

    public int getVitality() {return vitality;}

    public void setIntelligence(int intelligence) {
        if (intelligence<0)
            intelligence=0;
        this.intelligence = intelligence;
    }

    public int getIntelligence() {return intelligence;}

    public void setRareLevel(int rareLevel) {
        this.rareLevel = rareLevel;
    }

    public int getRareLevel() {return rareLevel;}

    public Items(){
        this.name="Unknown";
        this.rareLevel=random.nextInt(3)+1;
        this.rarity="Unknown";
        this.attack=0;
        this.vitality=0;
        this.intelligence=0;
    }

    public Items(String name, int rareLevel, String rarity, int attack, int vitality, int intelligence){
        this.name=name;
        this.rareLevel=random.nextInt(6);
        if (rareLevel>=0&&rareLevel<3)
            this.rarity="Common";
        else if (rareLevel==3||rareLevel==4)
            this.rarity="Uncommon";
        else
            this.rarity="Rare";
        this.attack=0;
        this.vitality=0;
        this.intelligence=0;
    }

    public void itemInfo(){
        System.out.println("Name           :" + name);
        System.out.println("Rarity         :" + rarity);
        System.out.println("Attack         :" + attack);
        System.out.println("Vitality       :" + vitality);
        System.out.println("Intelligence   :" + intelligence);
    }
}
