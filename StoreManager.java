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
    Product product = new Product();
    /**
     * Check how much stock of a given product is in the inventory
     */
    public void checkStock(){
        return Obj.getQuantity(Obj.getProducts());
    }

    public void processTransaction(){
        float total = 0;
        for(Map.Entry value : products.entrySet()){
            if(Obj.getQuantity(product.getID))
        }
    }
}
