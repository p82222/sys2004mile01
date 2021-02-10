import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class StoreManager {

    private HashMap<Product, Integer> products = new HashMap<Product, Integer>();
    /**
     * Creates a new inventory
     */
    Inventory Obj = new Inventory();

    public StoreManager(){
      this.obj = null;
    }

    public StoreManager(Inventory inventory){
      this.obj = inventory;
    }

    /**
     * Check how much stock of a given product is in the inventory
     */
    public void checkStock(int id){
        int stock;
        stock = Obj.getQuantity(id);
        System.out.println("Stock is " +stock);
    }

    /**
     * Checks the quantity exists and if it does processes the transaction
     */
    public void processTransaction(int cart[][]){
        float total = 0;
        boolean success = true;
        for(int[] i : cart){
            if(Obj.getQuantity(i[0]) >= i[1]){
                total += Obj.getProducts(i[0]).getPrice() * i[1];
                Obj.removeQuantity(i[0]);
            }
            else{
                success = false;
                break;
            }
            if(){
                System.out.println("-1");
            }
        }
    }
}
