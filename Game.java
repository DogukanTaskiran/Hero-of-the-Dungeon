import java.util.ArrayList;
import java.util.Scanner;
import java.security.SecureRandom;

public class Game {

    Level newLevel = new Level();

    Print print = new Print();
    SecureRandom sr = new SecureRandom();
    Scanner scanner = new Scanner(System.in);

    private int point = 0;
    public int n = 0;
    public double counter = 0;
    public int level;

    Sword sword1 = new Sword("Kronen", sr.nextInt(2) + 1, sr.nextInt(1) + 1, sr.nextInt(2) + 1, sr.nextInt(1) + 1);
    Sword sword2 = new Sword("Nikana", sr.nextInt(3) + 2, sr.nextInt(3) + 2, sr.nextInt(1) + 2, sr.nextInt(2) + 2);
    Sword sword3 = new Sword("Paracesis", sr.nextInt(5) + 3, sr.nextInt(5) + 3, sr.nextInt(4) + 3, sr.nextInt(4) + 3);

    Wand wand1 = new Wand("Gothmog", sr.nextInt(1) + 3, sr.nextInt(4) + 4, sr.nextInt(3) + 3, sr.nextInt(2) + 2);
    Wand wand2 = new Wand("Melkor", sr.nextInt(2) + 5, sr.nextInt(2) + 4, sr.nextInt(3) + 7, sr.nextInt(6) + 6);
    Wand wand3 = new Wand("Manwe", sr.nextInt(4) + 8, sr.nextInt(4) + 6, sr.nextInt(5) + 8, sr.nextInt(5) + 9);

    Shield shield1 = new Shield("Alduin", sr.nextInt(1) + 3, sr.nextInt(1) + 4, sr.nextInt(2) + 3, sr.nextInt(1) + 1);
    Shield shield2 = new Shield("Durnehviir", sr.nextInt(2) + 6, sr.nextInt(3) + 5, sr.nextInt(3) + 4, sr.nextInt(2) + 2);
    Shield shield3 = new Shield("Sahrotaar", sr.nextInt(3) + 8, sr.nextInt(5) + 6, sr.nextInt(4) + 5, sr.nextInt(3) + 3);

    LightArmor armor1 = new LightArmor("Shingeki", sr.nextInt(1) + 4, sr.nextInt(1) + 2, sr.nextInt(1) + 5, sr.nextInt(1) + 1);
    MediumArmor armor2 = new MediumArmor("Megata", sr.nextInt(2) + 3, sr.nextInt(2) + 4, sr.nextInt(2) + 3, sr.nextInt(2) + 2);
    HeavyArmor armor3 = new HeavyArmor("Shiso", sr.nextInt(3) + 2, sr.nextInt(4) + 5, sr.nextInt(4) + 4, sr.nextInt(3) + 3);

    ArrayList<Items> inventoryTank = new ArrayList<>();
    ArrayList<Items> inventoryHealer = new ArrayList<>();
    ArrayList<Items> inventoryFighter = new ArrayList<>();
    ArrayList<Items> inventoryEnemy = new ArrayList<>();

    Tank tank = new Tank(sr.nextInt(5) + 1, sr.nextInt(5) + 6, sr.nextInt(5) + 3, sword1, armor1, inventoryTank);
    Healer healer = new Healer(sr.nextInt(5) + 3, sr.nextInt(5) + 1, sr.nextInt(5) + 6, sword1, armor1, inventoryHealer);
    Fighter fighter = new Fighter(sr.nextInt(5) + 6, sr.nextInt(5) + 1, sr.nextInt(5) + 1, sword1, armor1, inventoryFighter);
    Creature enemy = new Enemy(sr.nextInt(4) + 1, sr.nextInt(4) + 1, sr.nextInt(4) + 1, sword1, armor1, inventoryEnemy);


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
    }

    public void characters() {

        Characters[] squad = new Characters[3];

        squad[0] = tank;
        squad[1] = fighter;
        squad[2] = healer;

        for (Characters characters : squad) {
            characters.displayMenu();
        }

    }

    public void enemiesAndFight() {

        int level = 1;
        ArrayList<Enemy> enemyArrayList = new ArrayList<>();

        Enemy enemy = new Enemy((sr.nextInt(5) + 1), (sr.nextInt(5) + 1), (sr.nextInt(5) + 1), sword1, armor1, inventoryEnemy);

        for (level = 0; level <= Math.pow(2, n); level++) {
            enemyArrayList.add(enemy);
            if (enemyArrayList.size() > Math.pow(2, n)) {
                enemyArrayList.remove(enemy);
            }
        }

        for (int u = 1; u < enemyArrayList.size(); u++) {
            enemyArrayList.get(u).displayMenu();
        }


        int drop;
        boolean play = true;

        for (int k = 0; k < enemyArrayList.size(); k++) {

            print.printWhite("1 for attack.");
            print.printWhite("2 for special action of Fighter.");
            print.printWhite("3 for special action of Healer.");
            print.printWhite("4 for special action of Tank.");
            print.printWhite("5 for examine.");

            int choice = scanner.nextInt();

            while (play) {
                if (choice == 1) {

                    fighter.attack(fighter, enemyArrayList.get(k));
                    print.printBlue("Fighter attack an Enemy");
                    print.printBlue("Enemy's hp is : " + enemyArrayList.get(k).getHp());

                    if (enemyArrayList.get(k).getHp() <= 0) {
                        print.printBlue("You killed an Enemy!");
                        enemyArrayList.remove(k);
                        print.printBlue("Enemy dropped: ");
                        System.out.println(enemy.getWeapon().getName());
                        System.out.println(enemy.getArmor().getName());
                        print.printYellow("Would you like to add them to your inventory? (1 for yes, 2 for no)");
                        drop = scanner.nextInt();
                        if (drop == 1)
                            fighter.pick();
                        if (enemyArrayList.isEmpty()) {
                            newLevel.enemiesDefeated();
                            newLevel.level();
                            enemiesAndFight();
                        }
                    } else {
                        healer.attack(healer, enemyArrayList.get(k));
                        print.printBlue("Healer attack an Enemy");
                        print.printBlue("Enemy's hp is : " + enemyArrayList.get(k).getHp());
                        if (enemyArrayList.get(k).getHp() <= 0) {
                            print.printBlue("You killed an Enemy!");
                            enemyArrayList.remove(k);
                            print.printBlue("Enemy dropped: ");
                            System.out.println(enemy.getWeapon().getName());
                            System.out.println(enemy.getArmor().getName());
                            print.printYellow("Would you like to add them to your inventory? (1 for yes, 2 for no)");
                            drop = scanner.nextInt();
                            if (drop == 1)
                                healer.pick();
                            if (enemyArrayList.isEmpty()) {
                                newLevel.enemiesDefeated();
                                newLevel.level();
                                enemiesAndFight();
                            }
                        } else {
                            tank.attack(tank, enemyArrayList.get(k));
                            print.printBlue("Tank attack an Enemy");
                            print.printBlue("Enemy's hp is : " + enemyArrayList.get(k).getHp());
                            if (enemyArrayList.get(k).getHp() <= 0) {
                                print.printBlue("You killed an Enemy!");
                                enemyArrayList.remove(k);
                                print.printBlue("Enemy dropped: ");
                                System.out.println(enemy.getWeapon().getName());
                                System.out.println(enemy.getArmor().getName());
                                print.printYellow("Would you like to add them to your inventory? (1 for yes, 2 for no)");
                                drop = scanner.nextInt();
                                if (drop == 1)
                                    tank.pick();
                                if (enemyArrayList.isEmpty()) {
                                    newLevel.enemiesDefeated();
                                    newLevel.level();
                                    enemiesAndFight();
                                }
                            } else {
                                if (tank.getHp() <= 0) {

                                    if (fighter.getHp() <= 0) {
                                        print.printBlue("Fighter and tank are not alive.\n Enemy will attack healer");
                                        enemyArrayList.get(k).attack(enemyArrayList.get(k), healer);
                                        if (healer.getHp() <= 0) {
                                            print.printBlue("Healer is dead.");
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
                                            newLevel.defeated();
                                            play = false;
                                        } else {
                                            print.printBlue("Healer's hp is : " + healer.getHp());
                                        }
                                    } else {
                                        print.printBlue("Tank is not alive.\n Enemy will attack Fighter.");
                                        enemyArrayList.get(k).attack(enemyArrayList.get(k), fighter);
                                        if (fighter.getHp() <= 0) {
                                            print.printBlue("Fighter is dead.");
                                        } else {
                                            print.printBlue("Fighter's hp is : " + fighter.getHp());
                                        }
                                    }
                                } else {
                                    enemyArrayList.get(k).attack(enemyArrayList.get(k), tank);
                                    print.printBlue("An enemy attack Tank");
                                    if (tank.getHp() <= 0) {
                                        print.printBlue("Tank is dead.");
                                    } else {
                                        print.printBlue("Tank's hp is : " + tank.getHp());
                                    }
                                }


                            }
                        }
                    }
                }
                if (choice == 2) {
                    fighter.specialAttackHeavyAttack(fighter, sword1, enemyArrayList.get(k));
                    print.printBlue("Fighter attack an Enemy");
                    print.printBlue("Enemy's hp is : " + enemyArrayList.get(k).getHp());

                    if (enemyArrayList.get(k).getHp() <= 0) {
                        print.printBlue("You killed an Enemy!");
                        enemyArrayList.remove(k);
                        print.printBlue("Enemy dropped: ");
                        System.out.println(enemy.getWeapon().getName());
                        System.out.println(enemy.getArmor().getName());
                        print.printYellow("Would you like to add them to your inventory? (1 for yes, 2 for no)");
                        drop = scanner.nextInt();
                        if (drop == 1)
                            fighter.pick();
                        if (enemyArrayList.isEmpty()) {
                            newLevel.enemiesDefeated();
                            newLevel.level();
                            enemiesAndFight();
                        }
                    } else {
                        healer.attack(healer, enemyArrayList.get(k));
                        print.printBlue("Healer attack an Enemy");
                        print.printBlue("Enemy's hp is : " + enemyArrayList.get(k).getHp());
                        if (enemyArrayList.get(k).getHp() <= 0) {
                            print.printBlue("You killed an Enemy!");
                            enemyArrayList.remove(k);
                            print.printBlue("Enemy dropped: ");
                            System.out.println(enemy.getWeapon().getName());
                            System.out.println(enemy.getArmor().getName());
                            print.printYellow("Would you like to add them to your inventory? (1 for yes, 2 for no)");
                            drop = scanner.nextInt();
                            if (drop == 1)
                                healer.pick();
                            if (enemyArrayList.isEmpty()) {
                                newLevel.enemiesDefeated();
                                newLevel.level();
                                enemiesAndFight();
                            }
                        } else {
                            tank.attack(tank, enemyArrayList.get(k));
                            print.printBlue("Tank attack an Enemy");
                            print.printBlue("Enemy's hp is : " + enemyArrayList.get(k).getHp());
                            if (enemyArrayList.get(k).getHp() <= 0) {
                                print.printBlue("You killed an Enemy!");
                                enemyArrayList.remove(k);
                                print.printBlue("Enemy dropped: ");
                                System.out.println(enemy.getWeapon().getName());
                                System.out.println(enemy.getArmor().getName());
                                print.printYellow("Would you like to add them to your inventory? (1 for yes, 2 for no)");
                                drop = scanner.nextInt();
                                if (drop == 1)
                                    tank.pick();
                                if (enemyArrayList.isEmpty()) {
                                    newLevel.enemiesDefeated();
                                    newLevel.level();
                                    enemiesAndFight();
                                }
                            } else {
                                if (tank.getHp() <= 0) {

                                    if (fighter.getHp() <= 0) {
                                        print.printBlue("Fighter and tank are not alive.\n Enemy will attack healer");
                                        enemyArrayList.get(k).attack(enemyArrayList.get(k), healer);
                                        if (healer.getHp() <= 0) {
                                            print.printBlue("Healer is dead.");
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
                                            newLevel.defeated();
                                            play = false;
                                        } else {
                                            print.printBlue("Healer's hp is : " + healer.getHp());
                                        }
                                    } else {
                                        print.printBlue("Tank is not alive.\n Enemy will attack Fighter.");
                                        enemyArrayList.get(k).attack(enemyArrayList.get(k), fighter);
                                        if (fighter.getHp() <= 0) {
                                            print.printBlue("Fighter is dead.");
                                        } else {
                                            print.printBlue("Fighter's hp is : " + fighter.getHp());
                                        }
                                    }
                                } else {
                                    enemyArrayList.get(k).attack(enemyArrayList.get(k), tank);
                                    print.printBlue("An enemy attack Tank");
                                    if (tank.getHp() <= 0) {
                                        print.printBlue("Tank is dead.");
                                    } else {
                                        print.printBlue("Tank's hp is : " + tank.getHp());
                                    }
                                }
                            }
                        }
                    }
                }
                if (choice == 3) {
                    healer.specialAttackHeal(healer, tank, fighter, wand1);
                    print.printBlue("Healer uses special action");
                    print.printBlue("Healer's hp is : " + healer.getHp());
                    print.printBlue("Tank's hp is : " + tank.getHp());
                    print.printBlue("Fighter's hp is : " + fighter.getHp());

                    fighter.attack(fighter, enemyArrayList.get(k));
                    print.printBlue("Fighter attack an Enemy");
                    print.printBlue("Enemy's hp is : " + enemyArrayList.get(k).getHp());

                    if (enemyArrayList.get(k).getHp() <= 0) {
                        print.printBlue("You killed an Enemy!");
                        enemyArrayList.remove(k);
                        print.printBlue("Enemy dropped: ");
                        System.out.println(enemy.getWeapon().getName());
                        System.out.println(enemy.getArmor().getName());
                        print.printYellow("Would you like to add them to your inventory? (1 for yes, 2 for no)");
                        drop = scanner.nextInt();
                        if (drop == 1)
                            fighter.pick();
                        if (enemyArrayList.isEmpty()) {
                            newLevel.enemiesDefeated();
                            newLevel.level();
                            enemiesAndFight();
                        }
                    } else {
                        tank.attack(tank, enemyArrayList.get(k));
                        print.printBlue("Tank attack an Enemy");
                        print.printBlue("Enemy's hp is : " + enemyArrayList.get(k).getHp());
                        if (enemyArrayList.get(k).getHp() <= 0) {
                            print.printBlue("You killed an Enemy!");
                            enemyArrayList.remove(k);
                            print.printBlue("Enemy dropped: ");
                            System.out.println(enemy.getWeapon().getName());
                            System.out.println(enemy.getArmor().getName());
                            print.printYellow("Would you like to add them to your inventory? (1 for yes, 2 for no)");
                            drop = scanner.nextInt();
                            if (drop == 1)
                                tank.pick();
                            if (enemyArrayList.isEmpty()) {
                                newLevel.enemiesDefeated();
                                newLevel.level();
                                enemiesAndFight();
                            }
                        } else {
                            if (tank.getHp() <= 0) {

                                if (fighter.getHp() <= 0) {
                                    print.printBlue("Fighter and tank are not alive.\n Enemy will attack healer");
                                    enemyArrayList.get(k).attack(enemyArrayList.get(k), healer);
                                    if (healer.getHp() <= 0) {
                                        print.printBlue("Healer is dead.");
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
                                        newLevel.defeated();
                                        play = false;
                                    } else {
                                        print.printBlue("Healer's hp is : " + healer.getHp());
                                    }
                                } else {
                                    print.printBlue("Tank is not alive.\n Enemy will attack Fighter.");
                                    enemyArrayList.get(k).attack(enemyArrayList.get(k), fighter);
                                    if (fighter.getHp() <= 0) {
                                        print.printBlue("Fighter is dead.");
                                    } else {
                                        print.printBlue("Fighter's hp is : " + fighter.getHp());
                                    }
                                }
                            } else {
                                enemyArrayList.get(k).attack(enemyArrayList.get(k), tank);
                                print.printBlue("An enemy attack Tank");
                                if (tank.getHp() <= 0) {
                                    print.printBlue("Tank is dead.");
                                } else {
                                    print.printBlue("Tank's hp is : " + tank.getHp());
                                }
                            }

                        }
                    }

                }
                if (choice == 4) {
                    fighter.attack(fighter, enemyArrayList.get(k));
                    print.printBlue("Fighter attack an Enemy");
                    print.printBlue("Enemy's hp is : " + enemyArrayList.get(k).getHp());

                    if (enemyArrayList.get(k).getHp() <= 0) {
                        print.printBlue("You killed an Enemy!");
                        enemyArrayList.remove(k);
                        print.printBlue("Enemy dropped: ");
                        System.out.println(enemy.getWeapon().getName());
                        System.out.println(enemy.getArmor().getName());
                        print.printYellow("Would you like to add them to your inventory? (1 for yes, 2 for no)");
                        drop = scanner.nextInt();
                        if (drop == 1)
                            fighter.pick();
                        if (enemyArrayList.isEmpty()) {
                            newLevel.enemiesDefeated();
                            newLevel.level();
                            enemiesAndFight();
                        }
                    } else {
                        healer.attack(healer, enemyArrayList.get(k));
                        print.printBlue("Healer attack an Enemy");
                        print.printBlue("Enemy's hp is : " + enemyArrayList.get(k).getHp());
                        if (enemyArrayList.get(k).getHp() <= 0) {
                            print.printBlue("You killed an Enemy!");
                            enemyArrayList.remove(k);
                            print.printBlue("Enemy dropped: ");
                            System.out.println(enemy.getWeapon().getName());
                            System.out.println(enemy.getArmor().getName());
                            print.printYellow("Would you like to add them to your inventory? (1 for yes, 2 for no)");
                            drop = scanner.nextInt();
                            if (drop == 1)
                                healer.pick();
                            if (enemyArrayList.isEmpty()) {
                                newLevel.enemiesDefeated();
                                newLevel.level();
                                enemiesAndFight();
                            }
                        }
                    }
                }
                if (choice == 5) {
                    tank.displayMenu();
                    fighter.displayMenu();
                    healer.displayMenu();
                }
                if (choice != 1 && choice != 2 && choice != 3 && choice != 4 && choice != 5) {
                    print.printYellow("Type your choice again!");
                    choice = scanner.nextInt();
                }
                print.printWhite("1 for attack.");
                print.printWhite("2 for special action of Fighter.");
                print.printWhite("3 for special action of Healer.");
                print.printWhite("4 for special action of Tank.");
                print.printWhite("5 for examine.");
                choice = scanner.nextInt();
            }
        }
    }
}
