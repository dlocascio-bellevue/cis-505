/*
    Locascio, D. (2026). CIS 505 Intermediate Java Programming. Bellevue University.
*/

public class ProductDB {
    public static GenericQueue<Product> getProducts(String code) {
        GenericQueue<Product> products = new GenericQueue<Product>();

        if (code.equalsIgnoreCase("b")) {
            Ball ball1 = new Ball();
            ball1.setCode("B100");
            ball1.setDescription("Black Widow 2.0");
            ball1.setPrice(144.95);
            ball1.setColor("Black and Red");

            Ball ball2 = new Ball();
            ball2.setCode("B200");
            ball2.setDescription("Axiom Pearl");
            ball2.setPrice(154.95);
            ball2.setColor("Blue and Red");    

            Ball ball3 = new Ball();
            ball3.setCode("B300");
            ball3.setDescription("Proton Physix");
            ball3.setPrice(174.95);
            ball3.setColor("Pink and Purple");  

            Ball ball4 = new Ball();
            ball4.setCode("B400");
            ball4.setDescription("Force Unleash");
            ball4.setPrice(139.99);
            ball4.setColor("Red and White");                                  

            Ball ball5 = new Ball();
            ball5.setCode("B500");
            ball5.setDescription("Phaze III");
            ball5.setPrice(154.99);
            ball5.setColor("Purple and Green");    

            System.out.print("\n  --Product Listing--");
            products.enqueue(ball1);
            products.enqueue(ball2); 
            products.enqueue(ball3); 
            products.enqueue(ball4);                                  
            products.enqueue(ball5);

        } else if (code.equalsIgnoreCase("s")) {
            Shoe shoe1 = new Shoe();
            shoe1.setCode("S100");
            shoe1.setDescription("Men's Ram Black");
            shoe1.setPrice(39.99);
            shoe1.setSize(10.5);

            Shoe shoe2 = new Shoe();
            shoe2.setCode("S200");
            shoe2.setDescription("Women's Rise Black/Hot Pink");
            shoe2.setPrice(39.99);
            shoe2.setSize(7.0);

            Shoe shoe3 = new Shoe();
            shoe3.setCode("S300");
            shoe3.setDescription("Women's Path Lite Seamless Mesh");
            shoe3.setPrice(54.99);
            shoe3.setSize(6.0);       

            Shoe shoe4 = new Shoe();
            shoe4.setCode("S400");
            shoe4.setDescription("Men's Tribal White");
            shoe4.setPrice(26.99);
            shoe4.setSize(8.5);                 

            Shoe shoe5 = new Shoe();
            shoe5.setCode("S500");
            shoe5.setDescription("Youth Skull Green/Black");
            shoe5.setPrice(39.99);
            shoe5.setSize(3.0);

            System.out.print("\n  --Product Listing--");
            products.enqueue(shoe1); 
            products.enqueue(shoe2);
            products.enqueue(shoe3);  
            products.enqueue(shoe4);                                              
            products.enqueue(shoe5); 

        } else if (code.equalsIgnoreCase("a")) {
            Bag bag1 = new Bag();
            bag1.setCode("A100");
            bag1.setDescription("Path Pro Deluxe");
            bag1.setPrice(34.99);
            bag1.setType("Single");

            Bag bag2 = new Bag();
            bag2.setCode("A200");
            bag2.setDescription("Prime Roller Black/Royal Blue");
            bag2.setPrice(54.99);
            bag2.setType("Double");

            Bag bag3 = new Bag();
            bag3.setCode("A300");
            bag3.setDescription("Silver/Royal Blue");
            bag3.setPrice(74.99);
            bag3.setType("Triple");  

            System.out.print("\n  --Product Listing--");
            products.enqueue(bag1);  
            products.enqueue(bag2);                       
            products.enqueue(bag3);

        } else {
            return products;
        }
        return products;
    }
}