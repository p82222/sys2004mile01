import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class Inventory {

    /**
     * The Inventory class will track the state of the inventory of your system. It should keep track of the type
     * and quantity of each Product, as well as provide methods to access and modify this information.
     */


    //private String type = "";                    // type of the Product
    private int quantity = 0;                    // quantity of Product
    private  Product product = null;
    private HashMap<Product, Integer> products = new HashMap<Product, Integer>();      // products the inventory is tracking


    /**
     * Creates a new Inventory with the supplied attributes.
     * Set default values upon object creation
     */
    public Inventory(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
        this.products.put(product, quantity);

    }

    public Inventory(){

        this.product = null;
        this.quantity = 0;
    }




    /**
     * Set the quantity of this Inventory.
     */
    public void addQuantity(int id) {
        for (Map.Entry<Product, Integer> set : products.entrySet()) {
            if(set.getKey().getId() == id){
                Scanner keyboard = new Scanner(System.in);
                System.out.println("enter new Quantity amount");
                int num = keyboard.nextInt();
                set.setValue(num);
                return;
            }
        }
        Scanner keyboard = new Scanner(System.in);
        System.out.println("New product for inventory");
        System.out.println("enter the product name");
        String name = keyboard.nextLine();

        System.out.println("enter the product price");
        float price = keyboard.nextFloat();
        Product product = new Product(name,id,price);

        System.out.println("enter new Quantity amount");
        int num = keyboard.nextInt();
        this.products.put(product, num);
        return;





    }

    /**
     * Get the amount of stock for a given Product ID (Note: it is possible the Product does not exist in
     * the Inventory!)
     */
    public int getQuantity(int id) {

        for (Map.Entry<Product, Integer> set : products.entrySet()) {
            if(set.getKey().getId() == id){
                return set.getValue();
            }
        }
        System.out.println("Product not in inventory.");
        return 0;

    }

    public void removeQuantity(int id) {

        for (Map.Entry<Product, Integer> set : products.entrySet()) {
            if(set.getKey().getId() == id){
                Scanner keyboard = new Scanner(System.in);
                System.out.println("how much quantity to remove?");
                int num = keyboard.nextInt();

                set.setValue(set.getValue()-num);
                return;


            }
        }
        System.out.println("Product not in inventory.");
        return;

    }

    public HashMap<Product, Integer> getProducts(HashMap<Product, Integer> products) {

        return this.products;

    }






}
