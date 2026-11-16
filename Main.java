public class Main {
    public static void main(String[] args) {
        CoffeePotView view = new CoffeePotView();

        while (true) {
            view.showMenu();
            String input = view.getUserInput();

            view.displayMessage("You entered: " + input);

            if (input.equalsIgnoreCase("exit")) {
                break;
            }
        }
    }
}
