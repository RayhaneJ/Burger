package general;

import java.util.List;

public class Burger implements FoodProduct {
    private String name;
    private List<FoodProduct> items;

    public Burger(String name, List<FoodProduct> items) {
        this.name = name;
        this.items = items;
    }

    public double weight() {
        return items.stream().map(Product::weight).reduce(0.0, Double::sum);
    }

    public double price() {
        return items.stream().map(Product::price).reduce(0.0, Double::sum);
    }

    @Override
    public double calories_per_100g() {
        return 0;
    }

    @Override
    public double calories() {
        return 0;
    }
}
