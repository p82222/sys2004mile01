//STUDENT NAME: Chia-Yu Liu //
//STUDENT ID: 100698737     //

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class StoreManager {

    private HashMap<Product, Integer> products = new HashMap<Product, Integer>();

    /**
     * Creates a new inventory
     */
    private Inventory inventory = new Inventory();

    public StoreManager(){
        this.inventory = null;
    }

    public StoreManager(Inventory inventory){
        this.inventory = inventory;
    }

    /**
     * Check how much stock of a given product is in the inventory
     */
    public void checkStock(int id){
        int stock;
        stock = inventory.getQuantity(id);
        System.out.println("Stock is " +stock);
    }

    /**
     * Checks the quantity exists and if it does processes the transaction
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
