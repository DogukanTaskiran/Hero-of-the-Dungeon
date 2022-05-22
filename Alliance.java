import java.util.ArrayList;

public class Alliance extends BaseClasses {
    protected Items[] equipment = new Items[2];
    private ArrayList<Items> inventory;
    Items items = new Items();
    Weapon weapons = new Weapon();
    Armor armors=new Armor();
    private int attack;

    public void setInventory(ArrayList<Items> Inventory) {
        this.inventory = Inventory;
    }

    public ArrayList<Items> getInventory() {return inventory;}

    public void setEquipment(Items[] equipment) {
        this.equipment = equipment;
    }

    public Items[] getEquipment() {return equipment;}

    public void setAttack(int attack) {
        if (attack<0)
            attack=0;
        this.attack = attack;
    }

    public int getAttack() {return attack;}

    public Alliance(){
        super();
        this.equipment=new Items[2];
        this.inventory =new ArrayList<Items>();
    }

    public Alliance(String name, long hp, int strength, int vitality, int intelligence, ArrayList<Items> inventory){

        super(name, hp, strength, vitality, intelligence);
        this.equipment[0]=new Items(weapons.getName(), weapons.getWeight() , weapons.getValue());
        this.equipment[1]=new Items(armors.getName(), armors.getWeight(), armors.getValue() );
        this.inventory =inventory;
    }

    @Override
    public void attack(){
        super.attack();
    }

    public void specialAction(){
        System.out.println("Use a special action based on the class.");
    }

    public void pick(){
        System.out.println(getName()+ " picked up " + items.getName());
        inventory.add(items);
    }

    public void wield(){
        System.out.println(getName()+ " wields " + weapons.getName());
        this.equipment[0]=weapons;
    }

    public void wear(){
        System.out.println(getName() + " wears " + armors.getName());
        this.equipment[1]=armors;
    }

    public void examine(){
        System.out.println(items);
    }

    public void listInventory(){
        System.out.println(inventory);
        System.out.println(equipment);
    }
}