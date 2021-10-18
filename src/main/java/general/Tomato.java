package general;

public class Tomato implements FoodProduct {

    private double weight;
    private double BASE_PRICE = 0.5;

    public Tomato(double weight) {
        this.weight = weight;
    }

    public double weight() {
        return weight;
    }

    public double price() {
        return BASE_PRICE * weight / 100;
    }

    @Override
    public String toString() {
        return String.format("tomato, qty: %.0f -- %.2f", weight(), price());
    }

    public double calories_per_100g() {
        return 0;
    }

    @Override
    public double calories() {
        return 0;
    }
}
