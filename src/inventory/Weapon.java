
package inventory;

public class Weapon extends Equipment {
    private int attackPower;

    public Weapon(int attackPower) {
        super();
    }

    /**
     * Constructor for Weapon class
     * @param attackPower - shows how much attack power this weapon has
     */


    /**
     * Prints the type of the Equipment and its power
     * @return string message
     */
    public String toString() {
        return "Gun " + attackPower;
    }

}
