import java.security.SecureRandom;
import java.util.ArrayList;

public class Objects {
    Print print = new Print();
    SecureRandom sr = new SecureRandom();
    private ArrayList<Weapon> swordArrayList = new ArrayList<>();
    private ArrayList<Weapon> wandArrayList = new ArrayList<>();
    private ArrayList<Weapon> shieldArrayList = new ArrayList<>();
    private ArrayList<ArrayList<Weapon>> allWeapons = new ArrayList<>();

    public Objects() {

        Sword sword1 = new Sword("Kronen", "Sword", sr.nextInt(2) + 1, sr.nextInt(1) + 1, sr.nextInt(2) + 1, 5);
        Sword sword2 = new Sword("Nikana", "Sword", sr.nextInt(3) + 2, sr.nextInt(3) + 2, sr.nextInt(1) + 2, 4);
        Sword sword3 = new Sword("Paracesis", "Sword", sr.nextInt(5) + 3, sr.nextInt(5) + 3, sr.nextInt(4) + 3, 3);

        Wand wand1 = new Wand("Gothmog", "Wand", sr.nextInt(1) + 3, sr.nextInt(4) + 4, 3);
        Wand wand2 = new Wand("Melkor", "Wand", sr.nextInt(2) + 5, sr.nextInt(2) + 4, 4);
        Wand wand3 = new Wand("Manwe", "Wand", sr.nextInt(4) + 8, sr.nextInt(4) + 6, 5);

        Shield shield1 = new Shield("Alduin", "Shield", sr.nextInt(1) + 3, sr.nextInt(1) + 4, sr.nextInt(2) + 3, 4);
        Shield shield2 = new Shield("Durnehviir", "Shield", sr.nextInt(2) + 6, sr.nextInt(3) + 5, sr.nextInt(3), 5);
        Shield shield3 = new Shield("Sahrotaar", "Shield", sr.nextInt(3) + 8, sr.nextInt(5) + 6, sr.nextInt(4), 4);

        getShieldArrayList().add(shield1);
        getShieldArrayList().add(shield2);
        getShieldArrayList().add(shield3);
        getSwordArrayList().add(sword1);
        getSwordArrayList().add(sword2);
        getSwordArrayList().add(sword3);
        getWandArrayList().add(wand1);
        getWandArrayList().add(wand2);
        getWandArrayList().add(wand3);

        getAllWeapons().add(getShieldArrayList());
        getAllWeapons().add(getWandArrayList());
        getAllWeapons().add(getSwordArrayList());

    }

    public ArrayList<ArrayList<Weapon>> getAllWeapons() {
        return allWeapons;
    }

    public ArrayList<Weapon> getSwordArrayList() {
        return swordArrayList;
    }

    public ArrayList<Weapon> getWandArrayList() {
        return wandArrayList;
    }

    public ArrayList<Weapon> getShieldArrayList() {
        return shieldArrayList;
    }

    public void weaponsPrintInfo() {
        for (int i = 0; i < getAllWeapons().size(); i++) {
            print.printBlue("-------Information" + getAllWeapons().get(i).get(i).getType() + " Weapons-----------");
            for (int j = 0; j < getAllWeapons().get(i).size(); j++) {
                print.printBlue("Name of weapons: " + getAllWeapons().get(i).get(j).getName());
                print.printBlue("Damage of weapons: " + getAllWeapons().get(i).get(j));

            }
        }
    }
}