
    import java.security.SecureRandom;
    import java.util.ArrayList;

    public class Enemy {
        SecureRandom sr = new SecureRandom();
        private String name;
        private int strength;
        private int vitality;
        private int intelligence;
        private int hp;
        private int damage;
        private Creature target;
        boolean stunned = false;

        public boolean isStunned() {
            return stunned;
        }

        public void setStunned(boolean stunned) {
            this.stunned = stunned;
        }

        Print print = new Print();

        public Enemy(String name) {
            this.name = name;
            setDamage(sr.nextInt(5, 15));
        }

        public void selectEnemy() {
            setIntelligence(sr.nextInt(1, 5));
            setStrength(sr.nextInt(1, 5));
            setVitality(sr.nextInt(1, 5));
            healthPoint();
        }

        public void healthPoint() {
            int hp = (int) Math.round(0.7 * getVitality() + 0.2 * getStrength() + 0.1 * getIntelligence());
            if (hp > 35) {
                hp = 35;
                setHp(hp);

            } else if (hp >= 0 && hp < 35) {
                setHp(hp);
            }
            if (hp < 0) {
                hp = 0;
                setHp(hp);
            }
        }

        public void attack() {
            if (isStunned()) {
                print.printRed(getName() + " is stunned by " + getTarget().getCharacterType());
                setStunned(false);
            }
            if (!isStunned()){
                print.printRed(getName() + " is attacking " + getTarget().getCharacterType());
                getTarget().setHp(getTarget().getHp() - getDamage());
                print.printRed(getName() + " damaged " + getTarget().getCharacterDamage() + " for " + getDamage() + " damage.");}

            if (getTarget().getHp() <= 0) {
                print.printRed(getTarget().getHp() + " health is " + 0);
            }
            else {
                print.printRed(getTarget().getCharacterType() + " health is " + getTarget().getHp());
            }

        }

        public Creature getTarget() {
            return target;
        }

        public void setTarget(Creature target) {
            this.target = target;
        }

        public int getDamage() {
            return damage;
        }

        public void setDamage(int damage) {
            this.damage = damage;
        }

        public int getHp() {
            return hp;
        }

        public void setHp(int hp) {
            this.hp = hp;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getStrength() {
            return strength;
        }

        public void setStrength(int strength) {
            this.strength = strength;
        }

        public int getIntelligence() {
            return intelligence;
        }

        public void setIntelligence(int intelligence) {
            this.intelligence = intelligence;
        }

        public int getVitality() {
            return vitality;
        }

        public void setVitality(int vitality) {
            this.vitality = vitality;
        }
    }

