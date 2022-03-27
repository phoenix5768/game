
package inventory;

import java.util.ArrayList;
import java.util.Random;

public class Inventory {
    private ArrayList<Item> inventory;

    /**
     * Constructor of Inventory class, without parameters
     * But creates inside the list of the items
     */
    public Inventory (){
        inventory = new ArrayList<>();
    }

    public ArrayList<Item> getInventory(){
        return inventory;
    }

    /**
     * Adds all items to the list of items in invetory, that will be used as default list for each actor.
     * There could only item of the each type
     * @param attackPower
     * @param defencePower
     * @param destroyPower
     * @param healingPower
     */
    public void addInventoryForActor(int attackPower, int defencePower, int destroyPower, int healingPower){

        inventory.add(new Weapon(attackPower));
        inventory.add(new Armor(defencePower));
        inventory.add(new Poison(destroyPower));
        inventory.add(new HealthPotion(healingPower));

    }

    /**
     * Adds different items to the list of items, which will be used when we will add items to the Room.
     * There could several items of the same type
     * @param attackPower
     * @param defencePower
     * @param destroyPower
     * @param healingPower
     */
    public void addInventoryForRoom(int attackPower, int defencePower, int destroyPower, int healingPower){
        Random rnd = new Random();
        int prob = rnd.nextInt(100);

        if(prob < 50) {
            inventory.add(new Poison(destroyPower));
        }

        prob = rnd.nextInt(100);
        if(prob < 20) {
            inventory.add(new Weapon(attackPower));
        }

        prob = rnd.nextInt(100);
        if(prob < 30) {
            inventory.add(new Armor(defencePower));
        }

        prob = rnd.nextInt(100);
        if(prob < 15) {
            inventory.add(new HealthPotion(healingPower));
        }
       
    }

   /**
     * Prints each item from the list of items
     * @return string message
     */
    public String toString(){
        for(int i = 0; i < inventory.size(); i++) {
            System.out.print(inventory.get(i) + " ");
        }
        return "\n";
    }

}
