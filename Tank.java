import java.util.Scanner;

public class Tank extends Creature {

    public Tank() {
        super("Tank");
    }

    @Override
    public void displayMenu() {
        super.displayMenu();
    }

    @Override
    public void attack() {
        super.attack();
    }

    public void ability() {
        print.printYellow("Casting " + getCharacterType() + " on " + getTarget().getName());
        print.printYellow(getTarget().getName() + " is stunned");
        getTarget().setHp(getTarget().getHp() - 10);
        ;
        print.printYellow(getCharacterType() + " damage " + (10) + " for " + getTarget().getName());
        if (getTarget().getHp() <= 0) {
            print.printYellow("Current health of " + getTarget().getName() + " is " + 0);
        } else {
            print.printYellow("Current health of " + getTarget().getName() + " is " + getTarget().getHp());
        }
    }
}