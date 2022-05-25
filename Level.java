import java.util.ArrayList;
import java.security.SecureRandom;
public class Level {
    SecureRandom random=new SecureRandom();
    private int point=0;

    public void setPoint(int point){
        this.point=point;
    }

    public int getPoint() {return point;}
    ArrayList<EnemySoldiers> enemy=new ArrayList<EnemySoldiers>();
    public void levelN(){
        int i;
        int counter=0;

        for (i=counter; i<Math.pow(2,i);i++){
            EnemySoldiers enemySoldiers=new EnemySoldiers(1,(random.nextInt(5)+1),(random.nextInt(5)+1),(random.nextInt(5)+1));
            enemy.add(enemySoldiers);
            if (enemy.size()>Math.pow(2,i)){
                enemy.remove(enemySoldiers);
            }
        }
        System.out.println("Welcome to level" + i);
        System.out.println("You have "+ Math.pow(2,i)+" number of enemies to defeat.");
        counter++;
    }

    public void enemiesDefeated(){
        int a=0;
        System.out.println("You finished level "+ a +"On to next level");
        setPoint((int) Math.pow(2,a));
        a++;
    }
}
