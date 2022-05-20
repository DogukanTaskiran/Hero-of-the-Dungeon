package CannonFodder;

import java.security.SecureRandom;
public class EnemySoldiers extends BaseClasses {
    SecureRandom random=new SecureRandom();

    public EnemySoldiers(){
        super();
    }
    public EnemySoldiers(long hp, int strength, int vitality, int intelligence){
        super.setHp(Math.round((0.7*vitality) + (0.2*strength) + (0.1*intelligence)));
        super.setStrength(random.nextInt(5)+1);
        super.setVitality(random.nextInt(5)+1);
        super.setIntelligence(random.nextInt(5)+1);
    }

    @Override
    public void attack(){
        System.out.println("Enemy soldier attacks 'Character' deals "+ getStrength() +" damage.");
    }

    public void dead(){
        System.out.println("Enemy soldier Hp is 0.");
        System.out.println("Drops its equipment.");
    }
}
