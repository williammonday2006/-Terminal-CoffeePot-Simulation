public class CoffeePotController {
    private CoffeePotModel model;
    private CoffeePotView view;

    public CoffeePotController(CoffeePotModel model, CoffeePotView view) {
        this.model = model;
        this.view = view;
    }

    public void start() {
        while (true) {
            view.showMenu();
            String input = view.getUserInput().trim();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            String[] parts = input.split("\\s+");

            try {
                if (parts[0].equalsIgnoreCase("status") && parts.length == 1) {
                    displayStatus();
                } else if (parts.length == 2) {
                    int amount = Integer.parseInt(parts[1]);

                    if (parts[0].equalsIgnoreCase("brew")) {
                        model.brew(amount);
                        view.displayMessage("Coffee brewed successfully.");
                        displayStatus();
                    } else if (parts[0].equalsIgnoreCase("pour")) {
                        model.pour(amount);
                        view.displayMessage("Coffee poured successfully.");
                        displayStatus();
                    } else {
                        view.displayMessage("Unknown command.");
                    }
                } else {
                    view.displayMessage("Invalid command.");
                }
            } catch (IllegalArgumentException | IllegalStateException e) {
                view.displayMessage("Error: " + e.getMessage());
            }
        }

        view.displayMessage("Goodbye!");
    }

    private void displayStatus() {
        view.displayMessage("Current volume: " + model.getCurrentVolume());
    }
}
