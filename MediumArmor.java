public class MediumArmor extends Armor {
    public MediumArmor(String name,double weight,double value,double resistance){
        super(name, weight, value, resistance);

    }

    @Override
    public void ItemInfo() {
        System.out.println("Name: "+ getName());
        System.out.println("Weight "+ getWeight());
        System.out.println("Value: "+ getValue());
        System.out.println("Resistance: "+getResistance()*1.5);
    }
}

