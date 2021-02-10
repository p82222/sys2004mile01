public class Main {
    public static void main(String[] args) {
        // you can test here

        Product apple = new Product("apple", 001, 1.0);

        //Product chicken = new Product("chicken", 002, 2.0);
        Product cherry = new Product("cherry", 003, 3.0);

        Inventory inventory = new Inventory(apple, 10);

        StoreManager storeManager = new StoreManager(inventory);

        System.out.println("test \"inventory...getProductInfo:\"");

        inventory.getProductInfo(001);
        System.out.println();
        System.out.println("test \"inventory...getProductInfo: with no product\"");
        inventory.getProductInfo(002);

        System.out.println();
        System.out.println("test \"inventory...removeQuantity: with product\"");
        System.out.println("before");
        inventory.removeQuantity(001);
        System.out.println("after");
        System.out.println(inventory.getQuantity(001));

        System.out.println();
        System.out.println("test \"inventory...addQuantity: \"");
        System.out.println("before");
        System.out.println(inventory.getQuantity(001));
        inventory.addQuantity(001);
        System.out.println("after");
        System.out.println(inventory.getQuantity(001));

        /*
        System.out.println();
        System.out.println("test \"inventory...addQuantity ( no prodcut): \"");
        System.out.println("before");
        System.out.println(inventory.getQuantity(002));
        inventory.addQuantity(002);
        System.out.println("after");
        inventory.getProductInfo(002);
        System.out.println(inventory.getQuantity(002));
        System.out.println();

         */

        System.out.println("==================================");
        System.out.println();

        System.out.println("test \"storeManager...checkStock: \"");
        storeManager.checkStock(001);
        storeManager.checkStock(003);

        System.out.println("test \"storeManager...: \"");
        int[][] cart = new int[5][2];

        cart = new int[][]{{001, 1}, {002, 15}, {003, 3}};

        storeManager.processTransaction(cart);





    }
}
