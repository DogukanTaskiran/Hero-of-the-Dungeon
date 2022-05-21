import java.util.Scanner;

public class Game {
    Player player;
    public void login(){
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to the Adventure Game...");
        System.out.println("Enter your name: ");
        String plName=input.nextLine();
        player=new Player(plName);


    }

}
