package SOLIDS.LiskovSubstitution;

public class LiskovExample {

    public static class MenuItem{
        public int price;
        public String name;
        public String description;

        public MenuItem(int price, String name, String description){
            this.price=price;
            this.name=name;
            this.description=description;
        }

        public double getPrice(){
            return this.price;
        }
    };

    public static class BeverageItem extends MenuItem{

        //@Component("beverageItem")
        public BeverageItem(int price, String name, String description){
            super(price, name, description);
        }

        public double getPriceWithDiscount(int discountPercent){
            return this.price-(discountPercent*.01*this.price);
        }

        public static void printItemPrice(MenuItem item){
//            this will violate Liskov and we would have to check if item is an instance of BeverageItem and call item.getPrice()
//            MenuItem's price and print 100 in both cases.
//             This check is violation Liskov and we have to fix it.

            if(item instanceof BeverageItem){
                System.out.println("Beverage item price:");
                System.out.println(((BeverageItem)item).getPriceWithDiscount(10));
            }
            else{
                System.out.println("MenuItem price:");
                System.out.println(item.getPrice());
            }
        }

        /***
         * The above issue can be resolved by having a Map<String,Beantype> introduced which will address the issue of initialisation of the bean with the correct bean implementation as specified.
         * The string will be the bean name or the qualifier which will be used  to refer the bean implementation.
         * example:
         * // Create a HashMap with a single key-value pair
         *         HashMap<String, BeverageItem> menuMap = new HashMap<>();
         *         menuMap.put("beverageItem", new BeverageItem(100, "Bread", "wheat flour bread"));
         *
         *         and similarly handle the implementation in the class being called for. Please refer qualifier.md in the same package.
         * @param args
         */
        public static void main(String[] args) {

            MenuItem menuItem =new MenuItem(100,"Bread","wheat flour bread");
            BeverageItem beverageItem = new BeverageItem(60,"Coke","cold beverage");

            printItemPrice(menuItem);
            printItemPrice(beverageItem);

        }
    }
}
