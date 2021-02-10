//Keefer Belanger//
//St# 101152085//

import java.util.ArrayList;

public class Product {


    private String name;                     // name of the Product
    private int id;                          // id of Product
    private float price;                     // price of Product


    /**
     * Creates a new Product with the supplied attributes.
     */
    public Product(String name, int id, float price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    /**
     * Get this Product's name.
     */
    public String getName() {
        return name;
    }

    /**
     * Get this Product's ID.
     */
    public int getId() {
        return id;
    }

    /**
     * Get this Product's price.
     */
    public float getPrice() {
        return price;
    }





}
