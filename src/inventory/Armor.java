/**
 * CSCI 235 - Week 4 - Lab
 *
 * @author: Aigerim Y
 */
package inventory;

public class Armor extends Equipment{
    private int defencePower;

    public Armor(int defencePower) {
        super();
    }

    /**
     * Constructor for Armor class
     * @param defencePower - shows how much defence power this armor has
     */


    /**
     * Prints the type of the Equipment and its power
     * @return string message
     */
    public String toString() {
        return "Armor " + defencePower;
    }
}
