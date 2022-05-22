public class BaseClasses {
    private String name;
    private long hp;
    private int strength;
    private int vitality;
    private int intelligence;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getHp() {
        return hp;
    }

    public void setHp(long hp) {
        if (hp < 0) {
            hp = 0;
        } else {
            this.hp = hp;
        }
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        if (strength < 1) {
            strength = 1;
        } else {
            this.strength = strength;
        }
    }

    public int getVitality() {
        return vitality;
    }

    public void setVitality(int vitality) {
        if (vitality < 1) {
            vitality = 1;

        } else {
            this.vitality = vitality;
        }
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        if (intelligence < 1) {
            intelligence = 1;
        } else {
            this.intelligence = intelligence;
        }
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

    public BaseClasses(){

    }

    protected void ItemInfo() {
    }
}
