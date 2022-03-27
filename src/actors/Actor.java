
package actors;

import inventory.Inventory;
import game.Room;



public abstract class Actor {


    /**
     * Constructor of class Actor with 5 parameters.
     *
     * @param name - name of the actor
     * @param health - health of the actor, which should be higher than zero, otherwise the actor is dead
     * @param attackPower - it gets subtracted from the opponents defence power.
     * @param defensivePower - it get decreased from the opponent's attack power,
     * @param inventory - initial inventory with some list of items, which can be changed later through out the game.
     */


    public Actor(String name, int health, int attackPower, int defensivePower, Inventory inventory) {

    }




}
