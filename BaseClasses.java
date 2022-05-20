package CannonFodder;

public class BaseClasses {
    private String name;
    private long hp;
    private int strength;
    private int vitality;
    private int intelligence;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {return name;}

    public void setHp(long hp) {
        if (hp<1)
            hp=1;
        this.hp = hp;
    }

    public long getHp() {return hp;}

    public void setStrength(int strength) {
        if (strength<1)
            strength=1;
        this.strength = strength;
    }

    public int getStrength() {return strength;}

    public void setVitality(int vitality) {
        if (vitality<1)
            vitality=1;
        this.vitality = vitality;
    }

    public int getVitality() {return vitality;}

    public void setIntelligence(int intelligence) {
        if (intelligence<1)
            intelligence=1;
        this.intelligence = intelligence;
    }

    public int getIntelligence() {return intelligence;}

    public BaseClasses(){
        this.name="Unknown";
        this.hp=1;
        this.strength=1;
        this.vitality=1;
        this.intelligence=1;
    }

    public BaseClasses(String name, long hp, int strength, int vitality, int intelligence){
        this.name=name;
        this.hp=Math.round((0.7*vitality) + (0.2*strength) + (0.1*intelligence));
        this.strength=strength;
        this.vitality=vitality;
        this.intelligence=intelligence;
    }

    public void attack(){
        System.out.println("Deal damage to character based on class.");
    }
}
