public class Main {
    public static void main(String[] args) {
        CoffeePotModel pot = new CoffeePotModel(20);

        pot.brew(10);
        System.out.println("After brewing: " + pot.getCurrentVolume());

        pot.pour(5);
        System.out.println("After pouring: " + pot.getCurrentVolume());

        try {
            pot.brew(30);
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            pot.pour(20);
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            pot.brew(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
