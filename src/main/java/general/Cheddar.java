package general;

public class Cheddar implements FoodProduct {
    // 400 kcal / 100g

    private double weight;
    private double BASE_PRICE = 4;

    public Cheddar(double weight) {
        this.weight = weight;
    }

    public double weight() {
        return weight;
    }

    public double price() {
        return BASE_PRICE * weight / 100;
    }

    public double calories_per_100g() {
        return 0;
    }

    @Override
    public String toString() {
        return String.format("cheddar (%.0fg) -- %.2f€", weight(), price());
    }

    @Override
    public double calories() {
        return 0;
    }
}
