import actors.Player;
import inventory.Inventory;

public class Main {

    public static void main(String[] args) {
        Player aigerim = new Player("Aigerim", 10, 10, 10, new Inventory());
        Game game = new Game(10, 10, 10, aigerim);
        game.beginGame();

    }
}
