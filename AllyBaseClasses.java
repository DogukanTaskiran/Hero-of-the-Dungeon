package CannonFodder;

import java.util.ArrayList;
public class AllyBaseClasses extends BaseClasses {
    private ArrayList<Items> equipment;
    Items items=new Items();

    public void setEquipment(ArrayList<Items> equipment) {
        this.equipment = equipment;
    }

    public ArrayList<Items> getEquipment() {return equipment;}

    public AllyBaseClasses(){
        super();
        this.equipment=new ArrayList<Items>();
    }

    public AllyBaseClasses(String name, long hp, int strength, int vitality, int intelligence,
                           ArrayList<Items> equipment){
        super(name, hp, strength, vitality, intelligence);
        this.equipment=equipment;
    }

    @Override
    public void attack(){
        super.attack();
    }

    public void specialAction(){
        System.out.println("Use a special action based on the class.");
    }

    public void Pick(){
        System.out.println(getName()+ "picked up " + items.getName());
        equipment.add(items);
    }

    public
}
