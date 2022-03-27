
package game;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

import actors.Actor;
import actors.Enemy;
import inventory.Inventory;

public class Room {
    private ArrayList<Actor> listOfActors;
    private Inventory inventory;
    private boolean filled;
    private int enemyCounter;

    /**
     * Constructor of the Room class
     * @param inventory - takes only inventory with list of items inside.
     * Also constructor creates a collection of actors, that will be stored in one Room
     * Might need additional fields that can be initialised inside this constructor.
     */

    public Room (Inventory inventory) {
        listOfActors = new ArrayList<Actor>();
        this.inventory = inventory;
        filled = false;
        enemyCounter = 0;
    }

    /**
     * This method checks whether the room was filled with items and/or actors
     * @return true or false depending on whether the room was filled.
     */
    public boolean isFilled() {

        return filled;
    }

    /**
     * This methods adds actor along with its inventory to the the Room
     * Since every actor has own inventory list
     */
    public void addActor() {
    //I did not get what this function supposed to do.
        //So I left it empty
    }

    /**
     * This method adds inventory to the Room itself.
     * @param number
     */
    public void addInventory(int number){
        filled = true;
        for(int i = 0; i < number; i++) {
            Random rnd = new Random();
            int attack = rnd.nextInt(100);
            int defense = rnd.nextInt(100);
            int destroy = rnd.nextInt(100);
            int healing = rnd.nextInt(100);
            inventory.addInventoryForRoom(attack, defense,destroy,healing);
        }
    }


    public int getEnemyCounter(){

        return enemyCounter;
    }


    public void addEnemy() {
        Enemy enemy = new Enemy("Thanos", 100, 80, 40, inventory);
        listOfActors.add(enemy);
        enemyCounter++;
    }

    /**
     * Prints the all items int this room
     * @return string message
     */
    public String toString(){

        return "Number of enemies: " + getEnemyCounter()
                + "\n"
                + "Number of Inventories: " + inventory.getInventory().size();
    }
}
