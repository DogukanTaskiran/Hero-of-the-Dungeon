import java.util.Scanner;

public class Player {
    private int damage,healthy,money;
     private Inventory inv;
    private String name,characterName;
    Scanner input=new Scanner(System.in);
    public Player(String plName){

    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getHealthy() {
        return healthy;
    }

    public void setHealthy(int healthy) {
        this.healthy = healthy;
    }

    public Inventory getInv() {
        return inv;
    }

    public void setInv(Inventory inv) {
        this.inv = inv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }
    public void selectCharacter(){
        switch (characterMenu()){
            case 1:
                setCharacterName("Enemy Soldier");
                break;
            case 2:
                setCharacterName("Fighter");
                break;
            case 3:
                setCharacterName("Tank");
                break;
            case 4:
                setCharacterName("Healer");
                break;

        }
        System.out.println("Character: "+ getCharacterName());
    }
    public int characterMenu(){
        System.out.println("Please,choose a character: ");
        System.out.println("1-Enemy Soldier");
        System.out.println("2-Fighter");
        System.out.println("3-Tank");
        System.out.println("4- Healer");
        System.out.println("Your choice: ");
        int chaID= input.nextInt();
        while(chaID<1||chaID>3){
            System.out.println("Please, enter a valid character.");
            chaID= input.nextInt();
        }
        return chaID;
    }

}
