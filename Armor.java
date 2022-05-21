public class Armor extends Items{
    private double resistance;
    public Armor(String name,double weight,double value,double resistance){
        super(name,weight,value);
        this.resistance=resistance;
    }


    public double getResistance() {
        return resistance;
    }

    public void setResistance(double resistance) {
        this.resistance = resistance;
    }

    @Override
    public void ItemInfo() {
        super.ItemInfo();
        System.out.println("Resistance: "+getResistance());
    }
}

