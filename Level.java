import java.security.SecureRandom;
public class Level {
    SecureRandom random=new SecureRandom();
    private int point=0;

    public void setPoint(int point){
        this.point=point;
    }

    public int getPoint() {return point;}

    public void levelN(){
        int i;
        for (i=0; i<Math.pow(2,0);i++){
            EnemySoldiers enemy=new EnemySoldiers(1,(random.nextInt(5)+1),(random.nextInt(5)+1),(random.nextInt(5)+1));
        }
        System.out.println("Welcome to level" + i);
        System.out.println("You have "+ Math.pow(2,i)+" number of enemies to defeat.");
    }

    public void enemiesDefeated(){
        int a=0;
        System.out.println("You finished level "+ a +"On to next level");
        setPoint((int) Math.pow(2,a));
        a++;
    }
}
