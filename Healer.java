import java.util.ArrayList;
import java.util.Scanner;

public class Healer extends Creature {


    Scanner input=new Scanner(System.in);
    Print print = new Print();



    public Healer() {
        super("Healer");
    }

    @Override
    public void displayMenu() {
        super.displayMenu();
    }

    @Override
    public void attack() {
        super.attack();
    }

    @Override
    public void ability() {
        print.printYellow("Casting "+getCharacterType()+" on "+getTarget().getName());
        if(getAllyBase().getHp()>(getAllyBase().getHealthy()-10)){
            getAllyBase().setHp(getHealthy());
            print.printYellow("Current health of " + getAllyBase().getCharacterType() + " is " + getAllyBase().getHp());
        }
        else
        {getAllyBase().setHp(getHp() +10);
            print.printYellow("Current health of " + getAllyBase().getCharacterType() + " is " + getAllyBase().getHp());
        }



    }
}