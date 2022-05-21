public class Test {
    public static void main(String[] args) {

        System.out.println("\n" + "░█████╗░░█████╗░███╗░░██╗███╗░░██╗░█████╗░███╗░░██╗  ███████╗░█████╗░██████╗░██████╗░███████╗██████╗░\n" +
                "██╔══██╗██╔══██╗████╗░██║████╗░██║██╔══██╗████╗░██║  ██╔════╝██╔══██╗██╔══██╗██╔══██╗██╔════╝██╔══██╗\n" +
                "██║░░╚═╝███████║██╔██╗██║██╔██╗██║██║░░██║██╔██╗██║  █████╗░░██║░░██║██║░░██║██║░░██║█████╗░░██████╔╝\n" +
                "██║░░██╗██╔══██║██║╚████║██║╚████║██║░░██║██║╚████║  ██╔══╝░░██║░░██║██║░░██║██║░░██║██╔══╝░░██╔══██╗\n" +
                "╚█████╔╝██║░░██║██║░╚███║██║░╚███║╚█████╔╝██║░╚███║  ██║░░░░░╚█████╔╝██████╔╝██████╔╝███████╗██║░░██║" + "\n");

        Sword sword1 = new Sword("Kronen",1,1,1,1);
        Sword sword2 = new Sword("Nikana",1,1,1,1);
        Sword sword3 = new Sword("Orthos",1,1,1,1);

        Wand wand1 = new Wand("Manwë",1,1,1,1);
        Wand wand2 = new Wand("Morgoth",1,1,1,1);
        Wand wand3 = new Wand("Gothmog",1,1,1,1);

        Shield shield1 = new Shield("Sentsui no Kyojin",1,1,1,1);
        Shield shield2 = new Shield("Shingeki no Kyojin",1,1,1,1);
        Shield shield3 = new Shield("Chō ōgata Kyojin",1,1,1,1);

        Armor armor1 = new Armor("X",1,1,1,1);
        Armor armor2 = new Armor("Y",1,1,1,1);
        Armor armor3 = new Armor("Z",1,1,1,1);

        sword1.ItemInfo();
        sword2.ItemInfo();
        sword3.ItemInfo();
        wand1.ItemInfo();
        wand2.ItemInfo();
        wand3.ItemInfo();
        shield1.ItemInfo();
        shield2.ItemInfo();
        shield3.ItemInfo();
        armor1.ItemInfo();
        armor2.ItemInfo();
        armor3.ItemInfo();
    }
}
