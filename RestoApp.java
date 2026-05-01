public class RestoApp {
    public static void main(String[] args) {
        // Step D1: Leaves
        MenuItem burger = new MenuItem("Classic Burger", 250.00);
        MenuItem fries  = new MenuItem("Large Fries", 85.00);
        MenuItem soda   = new MenuItem("Root Beer", 60.00);

        // Step D2: Sub-Composite
        MenuCategory barkadaMeal = new MenuCategory("Barkada Solo Meal");
        barkadaMeal.add(burger);
        barkadaMeal.add(fries);
        barkadaMeal.add(soda);

        // Step D3: Another Leaf
        MenuItem sundae = new MenuItem("Vanilla Sundae", 45.00);

        // Step D4: Top-Composite
        MenuCategory mainMenu = new MenuCategory("Main Menu");
        mainMenu.add(barkadaMeal);
        mainMenu.add(sundae);

        // Step D5: Test
        mainMenu.print();
        System.out.println("==============================");
        System.out.printf("Total Menu Value: \u20b1%.2f%n", mainMenu.getPrice());
    }
}