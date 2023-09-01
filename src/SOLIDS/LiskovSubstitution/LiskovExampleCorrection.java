package SOLIDS.LiskovSubstitution;

public class LiskovExampleCorrection {

    public static class MenuItem {
        public int price;
        public String name;
        public String description;

        public MenuItem(int price, String name, String description) {
            this.price = price;
            this.name = name;
            this.description = description;
        }

        public double getPrice() {
            return this.price - this.getDiscount();
        }

        private double getDiscount() {
            return 0;
        }

        ;
    }

    ;

    public static class BeverageItem extends MenuItem {

        public BeverageItem(int price, String name, String description) {
            super(price, name, description);
        }

        public double getPriceWithDiscount(int discountPercent) {
            return this.price - (discountPercent * .01 * this.price);
        }

        public double getPrice() {
            return this.price - this.getDiscount();
        }

        private double getDiscount() {
            int discountPercent = 10;
            return discountPercent * .01 * this.price;
        }

        ;

        public static void printItemPrice(MenuItem item) {
//            this will not violate Liskov principle.
            if (item instanceof BeverageItem) {
                System.out.println("Beverage item price:");
            } else {
                System.out.println("MenuItem price:");
            }
            System.out.println(item.getPrice());
        }

        public static void main(String[] args) {

            MenuItem menuItem = new MenuItem(100, "Bread", "wheat flour bread");
            BeverageItem beverageItem = new BeverageItem(60, "Coke", "cold beverage");

            printItemPrice(menuItem);
            printItemPrice(beverageItem);

        }
    }
}
