package game;

import inventory.Inventory;
import java.util.Random;

public class GameMap {
    private Room gameMap[][];
    private int maxNumEnemies;
    private int width;
    private int height;


    /**
     * Constructor of the GameMap class with three parameters
     * @param width - number of rows for the 2D array of Rooms
     * @param height - number of columns for the 2D array of Rooms
     * @param maxNumEnemies - - maximum number of enemies allowed in this game
     */

    public GameMap(int width, int height, int maxNumberofEnemies) {
        gameMap = new Room[width][height];
        this.maxNumEnemies = maxNumberofEnemies;

        this.height = height;
        this.width = width;
    }

    /**
     * Method that iterates through each room of the GameMap
     * Fills each room with random number and type of inventory and actors(enemies)
     */
    public void fillRooms(){
        for(int i = 0; i < this.width; i++) {
            for(int j = 0; j < this.height; j++) {
                Random rnd  = new Random();
                int number = rnd.nextInt(10);

                Inventory inv = new Inventory();
                gameMap[i][j] = new Room(inv);

                gameMap[i][j].addInventory(number);
            }
        }

        for(int i = 0; i < maxNumEnemies; i++) {
            Random rnd = new Random();
            int w = rnd.nextInt(this.width);
            int h = rnd.nextInt(this.height);
            gameMap[w][h].addEnemy();

        }
    }

    /**
     * Methods that iterates through all the rooms and prints the content of each room to console.
     */
    public void printRooms(){
        for(int i = 0; i < width; i++) {
            for(int j = 0; j < height; j++) {
                System.out.println(gameMap[i][j].toString());
            }
        }
    }
}
