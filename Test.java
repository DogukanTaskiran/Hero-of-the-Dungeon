public class Test {

    public static void main(String[] args) {

        Game game = new Game();
        Level level = new Level();

        game.login();
        game.characters();
        level.level();
        game.enemiesAndFight();

    }
}