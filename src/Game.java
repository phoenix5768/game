import game.GameMap;
import actors.Player;

public class Game {
    private GameMap gamemap;
    private Player player;

    /**
     * Constructor of class Game with 2 parameters.
     *
     * @param width - width of the GameMap, i.e. size of the 2D array
     * @param height - height of the GameMap, i.e. size of the 2D array
     * @param maxNumberofEnemies - maximum number of enemies allowed in this game
     * @param player - is the main actor of the game
     */
    public Game(int width, int height, int maxNumberofEnemies, Player player){
        gamemap = new GameMap(width, height, maxNumberofEnemies);
        this.player = player;
    }

    /**
     * Methods that creates the gameMap and fills it's rooms with items and actors
     * Initially it also displayes that gameMap with all the details inside each room of the game map.
     */
    public void beginGame(){
        gamemap.fillRooms(); //it fills with inventory and enemies
        gamemap.printRooms();
    }

}
