import java.util.Scanner;

public class CoffeePotView {
    private Scanner scanner = new Scanner(System.in);

    public void showMenu() {
        System.out.println("\n--- Coffee Pot Menu ---");
        System.out.println("brew <amt> - Add coffee");
        System.out.println("pour <amt> - Remove coffee");
        System.out.println("status - Check volume");
        System.out.println("exit - Quit");
        System.out.print("> ");
    }

    public String getUserInput() {
        return scanner.nextLine();
    }

    public void displayMessage(String msg) {
        System.out.println(msg);
    }
}
