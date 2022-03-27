
package inventory;

public class HealthPotion extends Consumable{
    private int healingPower;

    public HealthPotion(int healingPower) {
        super();
    }

    /**
     * Constructor of class HealthPotion
     * @param healingPower - shows how much healing power this health potion has
     */
 
    /**
     * Prints the type of the Consumable and its power
     * @return string message
     */
    public String toString() {
        return "Heal " + healingPower;
    }
}
