import java.util.ArrayList;
import java.util.Scanner;
import java.security.SecureRandom;

public class Game {
    int advRank = 1;
    int ch;
    int temp;
    Print print = new Print();
    SecureRandom sr = new SecureRandom();
    Scanner scanner = new Scanner(System.in);
    ArrayList<Creature> fPlayer = new ArrayList<>();
    ArrayList<Enemy> fEnemy = new ArrayList<>();


    public void login() {

        Scanner scanner = new Scanner(System.in);
        print.printGreen("""
                ░█████╗░░█████╗░███╗░░██╗███╗░░██╗░█████╗░███╗░░██╗  ███████╗░█████╗░██████╗░██████╗░███████╗██████╗░
                ██╔══██╗██╔══██╗████╗░██║████╗░██║██╔══██╗████╗░██║  ██╔════╝██╔══██╗██╔══██╗██╔══██╗██╔════╝██╔══██╗
                ██║░░╚═╝███████║██╔██╗██║██╔██╗██║██║░░██║██╔██╗██║  █████╗░░██║░░██║██║░░██║██║░░██║█████╗░░██████╔╝
                ██║░░██╗██╔══██║██║╚████║██║╚████║██║░░██║██║╚████║  ██╔══╝░░██║░░██║██║░░██║██║░░██║██╔══╝░░██╔══██╗
                ╚█████╔╝██║░░██║██║░╚███║██║░╚███║╚█████╔╝██║░╚███║  ██║░░░░░╚█████╔╝██████╔╝██████╔╝███████╗██║░░██║""".indent(1));
        print.printGreen("Welcome to the Cannon Fodder!");
        print.printGreen("Enter your name: ");
        String playerName = scanner.next();

        if (playerName.length() > 20) {
            print.printGreen("Good luck player!\n");
        } else {
            print.printGreen("Good luck " + playerName + "!\n");
        }
        for (int i = 0; i < fPlayer.get(0).getInventory().size(); i++) {
            print.printWhite("Name: " + fPlayer.get(0).getInventory().get(i).getName());
            print.printWhite("Type: " + fPlayer.get(0).getInventory().get(i).getType());
        }
    }

    public ArrayList<Creature> characters() {
        Healer playerHealer = new Healer();
        playerHealer.selectCharacter();
        Tank playerTank = new Tank();
        playerTank.selectCharacter();
        Fighter playerFighter = new Fighter();
        playerFighter.selectCharacter();
        fPlayer.add(playerFighter);
        fPlayer.add(playerHealer);
        fPlayer.add(playerTank);
        return fPlayer;
    }

    public ArrayList<Enemy> enemy() {
        for (int i = 0; i < Math.pow(2, advRank); i++) {
            Enemy enemy = new Enemy("Enemy( " + (i + 1) + " )");
            enemy.selectEnemy();
            fEnemy.add(enemy);
        }
        return fEnemy;
    }

    public void battle() {

        boolean play = true;
        int currentEnemy = fEnemy.size();
        int currentPlayer = fPlayer.size();
        print.printBlue("************************** LEVEL " + advRank + " *************************");
        enemyInfo();

        while (play) {
            boolean target = true;
            if (currentEnemy == 1) {
                temp = 0;
            } else {
                temp = sr.nextInt(0, fEnemy.size() - 1);
            }
            while (target) {
                if (currentPlayer > 0) {
                    playerInfo();
                    print.printYellow("Which character do you want to use:");
                    ch = scanner.nextInt();
                    print.printYellow("It is " + fPlayer.get(ch - 1).getCharacterType() + "'s turn");
                    fPlayer.get(ch - 1).setTarget(fEnemy.get(temp));
                } else {
                    print.printRed("You do not have a enough characters");
                }
                boolean menu = true;
                while (menu) {
                    print.printWhite("1 for attack.");
                    print.printWhite("2 for ability");
                    print.printWhite("3 for wield.");
                    print.printWhite("4 for wear.");
                    print.printWhite("5 for examine.");

                    int ch2 = scanner.nextInt();
                    switch (ch2) {
                        case 1:
                            fPlayer.get(ch - 1).attack();
                            menu = false;
                            break;
                        case 2:
                            if (fPlayer.get(ch - 1).getCharacterType().equals("Healer")) {
                                for (int i = 0; i < fEnemy.size(); i++) {
                                    if (fPlayer.get(i).getHp() <= fPlayer.get(ch - 1).getHp()) {
                                        fPlayer.get(ch - 1).setAllyBase(fPlayer.get(i));
                                        fPlayer.get(ch - 1).ability();
                                        menu = false;
                                    } else {
                                        fPlayer.get(ch - 1).setAllyBase(fPlayer.get(ch - 1));
                                        fPlayer.get(ch - 1).ability();
                                        menu = false;
                                    }
                                }
                            } else
                                fPlayer.get(ch - 1).ability();
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        case 5:
                            break;
                        case 6:
                            break;
                        case 7:
                            break;
                        default:
                            print.printRed("You enter a different number");
                    }
                }

                if (fEnemy.get(temp).getHp() <= 0) {
                    fEnemy.get(temp).setHp(0);
                }
                if (fEnemy.get(temp).getHp() <= 0) {
                    print.printPurple(fEnemy.get(temp).getName() + " is dead");
                    fEnemy.remove(fEnemy.get(temp));
                }
                currentEnemy = fEnemy.size();
                target = false;
                if (currentEnemy == 0) {
                    play = false;
                    print.printCyan("All enemy are dead.\nLevel cleared!");
                    advRank++;
                    print.printWhite("Press 's' to start new fight");
                    String ch = scanner.next();
                    if (ch.equalsIgnoreCase("s")) {
                        battle();
                    }
                }
                if (currentEnemy == 1) {
                    temp = 0;
                } else {
                    temp = (sr.nextInt(0, fEnemy.size() - 1));
                }
                if (fEnemy.size() > 0) {
                    print.printGreen("It is " + fEnemy.get(temp).getName() + "'s turn");
                    for (Creature creature : fPlayer) {
                        if (creature.getCharacterType().equals("Tank")) {
                            fEnemy.get(temp).setTarget(creature);
                        } else
                            fEnemy.get(temp).setTarget(fPlayer.get(ch - 1));
                    }
                    fEnemy.get(temp).attack();

                    if (fEnemy.get(temp).getTarget().getHp() <= 0) {
                        fEnemy.get(temp).getTarget().setHp(0);
                    }
                    if (fEnemy.size() > 0) {
                        print.printGreen("Current health of the " + fEnemy.get(temp).getName() + " is " + fEnemy.get(temp).getHp());
                    }
                    if (fEnemy.get(temp).getTarget().getHp() <= 0) {
                        print.printGreen(fEnemy.get(temp).getTarget().getCharacterType() + " is dead");
                        fPlayer.remove(ch - 1);
                        currentPlayer = fPlayer.size();
                    }
                }
            }
            if (currentPlayer == 0) {
                play = false;
                print.printRed("All characters are dead");
                print.printRed("""
                        ┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼
                        ███▀▀▀██┼███▀▀▀███┼███▀█▄█▀███┼██▀▀▀
                        ██┼┼┼┼██┼██┼┼┼┼┼██┼██┼┼┼█┼┼┼██┼██┼┼┼
                        ██┼┼┼▄▄▄┼██▄▄▄▄▄██┼██┼┼┼▀┼┼┼██┼██▀▀▀
                        ██┼┼┼┼██┼██┼┼┼┼┼██┼██┼┼┼┼┼┼┼██┼██┼┼┼
                        ███▄▄▄██┼██┼┼┼┼┼██┼██┼┼┼┼┼┼┼██┼██▄▄▄
                        ┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼
                        ███▀▀▀███┼▀███┼┼██▀┼██▀▀▀┼██▀▀▀▀██▄┼
                        ██┼┼┼┼┼██┼┼┼██┼┼██┼┼██┼┼┼┼██┼┼┼┼┼██┼
                        ██┼┼┼┼┼██┼┼┼██┼┼██┼┼██▀▀▀┼██▄▄▄▄▄▀▀┼
                        ██┼┼┼┼┼██┼┼┼██┼┼█▀┼┼██┼┼┼┼██┼┼┼┼┼██┼
                        ███▄▄▄███┼┼┼─▀█▀┼┼─┼██▄▄▄┼██┼┼┼┼┼██▄
                        ┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼
                        ┼┼┼┼┼┼┼┼██┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼██┼┼┼┼┼┼┼┼┼
                        ┼┼┼┼┼┼████▄┼┼┼▄▄▄▄▄▄▄┼┼┼▄████┼┼┼┼┼┼┼
                        ┼┼┼┼┼┼┼┼┼▀▀█▄█████████▄█▀▀┼┼┼┼┼┼┼┼┼┼
                        ┼┼┼┼┼┼┼┼┼┼┼█████████████┼┼┼┼┼┼┼┼┼┼┼┼
                        ┼┼┼┼┼┼┼┼┼┼┼██▀▀▀███▀▀▀██┼┼┼┼┼┼┼┼┼┼┼┼
                        ┼┼┼┼┼┼┼┼┼┼┼██┼┼┼███┼┼┼██┼┼┼┼┼┼┼┼┼┼┼┼
                        ┼┼┼┼┼┼┼┼┼┼┼█████▀▄▀█████┼┼┼┼┼┼┼┼┼┼┼┼
                        ┼┼┼┼┼┼┼┼┼┼┼┼███████████┼┼┼┼┼┼┼┼┼┼┼┼┼
                        ┼┼┼┼┼┼┼┼▄▄▄██┼┼█▀█▀█┼┼██▄▄▄┼┼┼┼┼┼┼┼┼
                        ┼┼┼┼┼┼┼┼▀▀██┼┼┼┼┼┼┼┼┼┼┼██▀▀┼┼┼┼┼┼┼┼┼
                        ┼┼┼┼┼┼┼┼┼┼▀▀┼┼┼┼┼┼┼┼┼┼┼▀▀┼┼┼┼┼┼┼┼┼┼┼
                        ┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼""");
                System.exit(0);
            }

        }

    }

    public void playerInfo() {
        for (int i = 0; i < fPlayer.size(); i++) {
            print.printGreen((i + 1) + ".Character" + "\t type: \t" + fPlayer.get(i).getCharacterType() + "\t damage: \t" + fPlayer.get(i).getCharacterDamage());
        }
    }

    public void enemyInfo() {
        for (Enemy enemy : fEnemy) {
            print.printGreen("name: \t" + enemy.getName() + "\t damage: \t" + enemy.getDamage());
        }
    }
}