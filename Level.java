import java.util.ArrayList;
import java.security.SecureRandom;

public class Level {

    Print print = new Print();
    SecureRandom random = new SecureRandom();

    private int point = 0;
    public int n = 0;
    public double counter = 0;
    public int level;

    public void setPoint(int point) {
        this.point = point;
    }

    public int getPoint() {
        return point;
    }

    ArrayList<Enemy> enemyArrayList = new ArrayList<Enemy>();

}