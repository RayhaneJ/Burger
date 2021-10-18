package general;

import java.util.ArrayList;
import java.util.List;

public class BigBurgerCook implements BurgerCook {
    private String name;
    private List<FoodProduct> products  = new ArrayList<FoodProduct>();

    public BigBurgerCook(String name, Size size, MeatType meatType){
        this.name = name;
    }

    @Override
    public BurgerCook with_cheese() {
        products.add(new Cheddar(30));
        return this;
    }

    @Override
    public BurgerCook with_onions() {
        products.add(new DeepFriedOnions(20));
        return this;
    }

    @Override
    public BurgerCook with_sauce(Sauce.SauceType sauceType) {
        products.add(new Sauce(sauceType, 20));
        return this;
    }

    @Override
    public BurgerCook with_tomato() {
        products.add(new Tomato(20));
        return this;
    }

    @Override
    public Burger cook() {
        return new BigBurgerBurger(name, products);
    }
}
