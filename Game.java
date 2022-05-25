import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Game {
    Location location = new Location();


    public void login(){
        Scanner scanner = new Scanner(System.in);
        System.err.println("\n" + " ░█████╗░░█████╗░███╗░░██╗███╗░░██╗░█████╗░███╗░░██╗  ███████╗░█████╗░██████╗░██████╗░███████╗██████╗░\n" +
                " ██╔══██╗██╔══██╗████╗░██║████╗░██║██╔══██╗████╗░██║  ██╔════╝██╔══██╗██╔══██╗██╔══██╗██╔════╝██╔══██╗\n" +
                " ██║░░╚═╝███████║██╔██╗██║██╔██╗██║██║░░██║██╔██╗██║  █████╗░░██║░░██║██║░░██║██║░░██║█████╗░░██████╔╝\n" +
                " ██║░░██╗██╔══██║██║╚████║██║╚████║██║░░██║██║╚████║  ██╔══╝░░██║░░██║██║░░██║██║░░██║██╔══╝░░██╔══██╗\n" +
                " ╚█████╔╝██║░░██║██║░╚███║██║░╚███║╚█████╔╝██║░╚███║  ██║░░░░░╚█████╔╝██████╔╝██████╔╝███████╗██║░░██║" + "\n");
        System.out.println("Welcome to the Cannon Fodder!");
        System.out.println("Enter your name: \n");
        String playerName = scanner.nextLine();
        Player player = new Player(playerName);
        System.out.println("Good luck "+ playerName+"!\n");
    }

    public void CreateSquad(){
        Items[] knightItems = new Items[5];
        Items[] supportItems = new Items[5];
        Items[] tankItems = new Items[5];

        ArrayList<Items> inventory = new ArrayList<>();
        Fighter melee = new Fighter("Knight",1,1,1,1,knightItems, inventory);
        Healer support = new Healer("Support",1,1,1,1,supportItems, inventory);
        Tank tank = new Tank("Front line",1,1,1,1,tankItems, inventory);

        System.out.println(melee.getName()+" created with  -> Strength: "+ melee.getStrength()+", HP: "+melee.getHp()+", Vitality: "+melee.getVitality()+
                ", Intelligence: "+melee.getIntelligence()+", Items: "+Arrays.toString(knightItems)+", Inventory: "+ melee.getInventory()+".");
        System.out.println(support.getName()+" created with -> Strength: "+ support.getStrength()+", HP: "+support.getHp()+", Vitality: "+support.getVitality()+
                ", Intelligence: "+support.getIntelligence()+", Items: "+Arrays.toString(supportItems)+", Inventory: "+ support.getInventory()+".");
        System.out.println(tank.getName()+" created with    -> Strength: "+ tank.getStrength()+", HP: "+tank.getHp()+", Vitality: "+tank.getVitality()+
                ", Intelligence: "+tank.getIntelligence()+", Items: "+Arrays.toString(tankItems)+", Inventory: "+ tank.getInventory()+".\n");

        System.out.println(melee.getName()+" wields ");
        System.out.println(support.getName()+" wields ");
        System.out.println(tank.getName()+" wields ");
    }
}
