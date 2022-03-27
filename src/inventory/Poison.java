
package inventory;

public class Poison extends Consumable{
    private int destroyPower;

    public Poison(int destroyPower) {
        super();
    }

    /**
     * Constructor of class Poison
     * @param destroyPower - shows how much destroy power this posion has
     */


    /**
     * Prints the type of the Consumable and its power
     * @return string message
     */
    public String toString() {
        return "Poison " + destroyPower;
    }
}
