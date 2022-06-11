import java.util.ArrayList;
import java.security.SecureRandom;
import java.io.File;

public class Level {

    Print print = new Print();
    SecureRandom random = new SecureRandom();

    private int point = 0;
    public int n = 0;
    public double score = 0;
    public int level;

    public void setPoint(int point) {
        this.point = point;
    }

    public int getPoint() {
        return point;
    }


    public void level() {

        ArrayList<Enemy> enemyArrayList = new ArrayList<Enemy>();

        Enemy enemy = new Enemy((random.nextInt(5) + 1), (random.nextInt(5) + 1), (random.nextInt(5) + 1));

        print.printPurple("\n********* Welcome to level " + n +" *********");

        for (level = 0; level <= Math.pow(2, n); level++) {
            enemyArrayList.add(enemy);
            if (enemyArrayList.size() > Math.pow(2, n)) {
                enemyArrayList.remove(enemy);
            }
        }
        print.printPurple("You have " + (int) Math.pow(2, n) + " number of enemies to defeat.");
        for(Creature enemies: enemyArrayList) {
            enemies.displayMenu();
        }
        score = score + Math.pow(2, n);
    }

    public void enemiesDefeated() {
        print.printPurple("You finished level " + n + "\nOn to next level");
        setPoint(getPoint() + ((int) Math.pow(2, n)));
        n++;
    }

    public void defeated() {
        print.printRed("You lost!");
        ArrayList<Double> topScores = new ArrayList<>();
        print.printGreen("Your score is: " + score);
        File scores = new File("C:\\Intellij_IDEA\\SE116_o");

        for(int d=0;d<5;d++){
            if (topScores.get(d)<score){
                topScores.add(score);
                topScores.remove(d);
            }
        }

    }
}