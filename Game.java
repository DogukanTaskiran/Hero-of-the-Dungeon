import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.security.SecureRandom;
public class Game {
    SecureRandom random=new SecureRandom();
    Location location = new Location();

    public void login(){
        Scanner scanner = new Scanner(System.in);
        System.err.println("\n" +
                " ░█████╗░░█████╗░███╗░░██╗███╗░░██╗░█████╗░███╗░░██╗  ███████╗░█████╗░██████╗░██████╗░███████╗██████╗░\n" +
                " ██╔══██╗██╔══██╗████╗░██║████╗░██║██╔══██╗████╗░██║  ██╔════╝██╔══██╗██╔══██╗██╔══██╗██╔════╝██╔══██╗\n" +
                " ██║░░╚═╝███████║██╔██╗██║██╔██╗██║██║░░██║██╔██╗██║  █████╗░░██║░░██║██║░░██║██║░░██║█████╗░░██████╔╝\n" +
                " ██║░░██╗██╔══██║██║╚████║██║╚████║██║░░██║██║╚████║  ██╔══╝░░██║░░██║██║░░██║██║░░██║██╔══╝░░██╔══██╗\n" +
                " ╚█████╔╝██║░░██║██║░╚███║██║░╚███║╚█████╔╝██║░╚███║  ██║░░░░░╚█████╔╝██████╔╝██████╔╝███████╗██║░░██║" + "\n");
        System.out.println("Welcome to the Cannon Fodder!");
        System.out.println("Enter your name: ");
        String playerName = scanner.next();
        Player player = new Player(playerName);
    }

    public void createSquad(){
        Fighter melee=new Fighter();
        Tank tank2=new Tank();
        Healer healer=new Healer();

        ArrayList<Items> inventory = new ArrayList<>();
        Fighter fighter = new Fighter("Knight",1,(random.nextInt(5)+6),(random.nextInt(5)+3),(random.nextInt(5)+1),melee.getEquipment(), inventory);
        Healer support = new Healer("Support",1,(random.nextInt(5)+3),(random.nextInt(5)+1),(random.nextInt(5)+6),healer.getEquipment(), inventory);
        Tank tank = new Tank("Front line",1,(random.nextInt(5)+1),(random.nextInt(5)+6),(random.nextInt(5)+3),tank2.getEquipment(), inventory);

        System.out.println(fighter.getName()+" created with  -> Strength: "+ fighter.getStrength()+", HP: "+fighter.getHp()+", Vitality: "+fighter.getVitality()+
                ", Intelligence: "+fighter.getIntelligence()+", Items: "+Arrays.toString(fighter.equipment)+", Inventory: "+ fighter.getInventory()+".");
        System.out.println(support.getName()+" created with -> Strength: "+ support.getStrength()+", HP: "+support.getHp()+", Vitality: "+support.getVitality()+
                ", Intelligence: "+support.getIntelligence()+", Items: "+Arrays.toString(support.equipment)+", Inventory: "+ support.getInventory()+".");
        System.out.println(tank.getName()+" created with    -> Strength: "+ tank.getStrength()+", HP: "+tank.getHp()+", Vitality: "+tank.getVitality()+
                ", Intelligence: "+tank.getIntelligence()+", Items: "+Arrays.toString(tank.equipment)+", Inventory: "+ tank.getInventory()+".\n");

        System.out.println(fighter.getName()+" wields "+ Arrays.toString(fighter.equipment));
        System.out.println(support.getName()+" wields "+ Arrays.toString(support.equipment));
        System.out.println(tank.getName()+" wields "+ Arrays.toString(tank.equipment));
    }
}
