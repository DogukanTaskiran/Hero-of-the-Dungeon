package CannonFodder;

import java.util.ArrayList;
public class AllyBaseClasses extends BaseClasses {
    private Items[] equipment;
    private ArrayList<Items> inventory;
    Items items=new Items();
    Weapons weapons=new Weapons() {
        @Override
        public void itemInfo() {
            super.itemInfo();
        }
    };
    Armor armors=new Armor() {
        @Override
        public void itemInfo() {
            super.itemInfo();
        }
    };

    public void setInventory(ArrayList<Items> inventory) {
        this.inventory = inventory;
    }

    public ArrayList<Items> getInventory() {return inventory;}

    public void setEquipment(Items[] equipment) {
        this.equipment = equipment;
    }

    public Items[] getEquipment() {return equipment;}

    public AllyBaseClasses(){
        super();
        this.equipment=new Items[2];
        this.inventory=new ArrayList<Items>();
    }

    public AllyBaseClasses(String name, long hp, int strength, int vitality, int intelligence,
                           Items[] equipment, ArrayList<Items> inventory){
        super(name, hp, strength, vitality, intelligence);
        this.equipment=equipment;
        this.inventory=inventory;
    }

    @Override
    public void attack(){
        super.attack();
    }

    public void specialAction(){
        System.out.println("Use a special action based on the class.");
    }

    public void Pick(){
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
