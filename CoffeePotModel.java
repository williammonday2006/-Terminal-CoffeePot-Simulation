public class CoffeePotModel {
    private int currentVolume;
    private int maxCapacity;

    public CoffeePotModel(int maxCapacity) {
        this.currentVolume = 0;
        this.maxCapacity = maxCapacity;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void brew(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount cannot be negative.");
        }
        if (currentVolume + amount > maxCapacity) {
            throw new IllegalStateException("Pot capacity exceeded.");
        }
        currentVolume += amount;
    }

    public void pour(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount cannot be negative.");
        }
        if (currentVolume - amount < 0) {
            throw new IllegalStateException("Not enough coffee.");
        }
        currentVolume -= amount;
    }
}
