public class Player {
    private double strength;
    private double vitality;
    private double intelligence;
    private double hp;
    private String name;
    private String type;
    private Inventory inventory = new Inventory();

    public Player(String name){
        this.setName(name);
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

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
