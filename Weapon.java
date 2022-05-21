
    public abstract class Weapon extends Items{
        private double damage;
        public Weapon(String name,double weight,double value,double damage){
            super(name, weight, value);
            this.damage=damage;

        }

        public void setDamage(double damage) {

            this.damage = damage;
        }
        public double getDamage() {

            return damage;
        }

        @Override
        public void ItemInfo() {
            super.ItemInfo();
            System.out.println("Damage: "+getDamage());
        }
    }

