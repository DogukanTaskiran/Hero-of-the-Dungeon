import java.util.Scanner;

public class Game {
    Location location = new Location();

    public void login(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n" + " ░█████╗░░█████╗░███╗░░██╗███╗░░██╗░█████╗░███╗░░██╗  ███████╗░█████╗░██████╗░██████╗░███████╗██████╗░\n" +
                " ██╔══██╗██╔══██╗████╗░██║████╗░██║██╔══██╗████╗░██║  ██╔════╝██╔══██╗██╔══██╗██╔══██╗██╔════╝██╔══██╗\n" +
                " ██║░░╚═╝███████║██╔██╗██║██╔██╗██║██║░░██║██╔██╗██║  █████╗░░██║░░██║██║░░██║██║░░██║█████╗░░██████╔╝\n" +
                " ██║░░██╗██╔══██║██║╚████║██║╚████║██║░░██║██║╚████║  ██╔══╝░░██║░░██║██║░░██║██║░░██║██╔══╝░░██╔══██╗\n" +
                " ╚█████╔╝██║░░██║██║░╚███║██║░╚███║╚█████╔╝██║░╚███║  ██║░░░░░╚█████╔╝██████╔╝██████╔╝███████╗██║░░██║" + "\n");
        System.out.println("Welcome to the Cannon Fodder!");
        System.out.println("Enter your name: ");
        String playerName = scanner.nextLine();
        Player player = new Player(playerName);
    }
}
