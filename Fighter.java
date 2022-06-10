import java.util.ArrayList;
import java.util.Scanner;

public class Fighter extends Creature {

    Scanner input=new Scanner(System.in);
    Print print = new Print();
    public int choose;

    public Fighter() {
        super("Fighter");

    }

    @Override
    public void displayMenu() {
        super.displayMenu();
    }

    @Override
    public void assigningWeapon() {
        super.assigningWeapon();
    }

    @Override
    public void attack() {
        super.attack();
    }

    @Override
    public void ability() {
        print.printYellow("Casting " + getCharacterType() + " on " + getTarget().getName());
        print.printYellow(getCharacterType() + " is damaged " + (getCharacterDamage() + 10)+ " to " + getTarget().getName());
        if(getTarget().getHp()<=0){
            getTarget().setHp(0);
            print.printYellow("Current health of " + getTarget().getName() + " is " + getTarget().getHp());
        }
        else{
            print.printYellow("Current health of " + getTarget().getName() + " is " + getTarget().getHp());
        }

    }
}