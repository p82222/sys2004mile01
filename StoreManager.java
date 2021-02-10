//STUDENT NAME: Chia-Yu Liu //
//STUDENT ID: 100698737     //
//STUDENT NAME: Keefer Belanger//
//STUDENT ID: 101152085//

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class StoreManager {

    private HashMap<Product, Integer> products = new HashMap<Product, Integer>();
    private int[][] cart = new int[][]{};

    /**
     * Creates a new inventory
     */
    private Inventory inventory = new Inventory();

    /**
     * Creates StoreManager constructor
     */
    public StoreManager(){
        this.inventory = null;
    }

    public StoreManager(Inventory inventory){
        this.inventory = inventory;
    }

    /**
     * Check how much stock of a given product is in the inventory
     *
     * @param id
     * @void the method has no return value
     *
     */
    public void checkStock(int id){
        int stock;
        stock = inventory.getQuantity(id);
        System.out.println("Stock is " +stock);
    }

    /**
     * Checks the quantity exists and if it does processes the transaction
     *
     * @param cart
     * @void the method has no return value
     */
    public void processTransaction(int cart[][]){
        float total = 0;
        boolean success = true;
        for(int[] i : cart) {
            if (inventory.getQuantity(i[0]) >= i[1]) {
                total += inventory.getProductInfo(i[0]).getPrice() * i[1];
                inventory.removeQuantity(i[0]);
            } else {
                success = false;
                break;
            }
        }
        if(!success){
            System.out.println("Transaction Failed");
        }
        else{
            System.out.println("Total = " +total);
        }
    }
}
