import java.util.ArrayList;

public class Inventory {

    /**
     * The Inventory class will track the state of the inventory of your system. It should keep track of the type
     * and quantity of each Product, as well as provide methods to access and modify this information.
     */


    private String type = "";                    // type of the Product
    private int quantity = 0;                    // quantity of Product
    private  Product product = null;
    private ArrayList<Product> products = new ArrayList<>();      // products the inventory is tracking


    /**
     * Creates a new Inventory with the supplied attributes.
     * Set default values upon object creation
     */
    public Inventory(Product product, String type, int quantity) {
        this.type = type;
        this.quantity = quantity;
        this.product = product;
        products.add(product);

    }

    /**
     * Get this Inventory's type.
     */
    public String getType() {
        return type;
    }


    /**
     * Set the type of this Inventory.
     */
    public void setType(String newType) {
        type = newType;
    }

    /**
     * Set the quantity of this Inventory.
     */
    public void setQuantity(int newQuantity) {
        quantity = newQuantity;
    }

    /**
     * Get the amount of stock for a given Product ID (Note: it is possible the Product does not exist in
     * the Inventory!)
     */
    public int getQuantity(int  id) {
        int num = 0;

        for (Product p: this.products){
            if (p.getId() != id){
               continue;
            } else{
                num += 1;
            }
        }
        if (num == 0){
            System.out.println("this product does not exist in the Inventory!");

        }
        return num;



    }

    /**
     * Add a specified amount of stock for a given Product to the inventory.
     */
    public void addQuantity(int id) {
        boolean flag = false;
        for (Product p: this.products){
            if (p.getId() != id){
                flag = true;
                break;
            }
        }
        if (flag == false){
            if(!fullLoad){
                courses.add(course);
                if (courses.size() == 5)
                    fullLoad = true;
            }
        }
    }


}
