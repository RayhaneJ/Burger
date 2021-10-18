package general;

public interface BurgerCook {
    BurgerCook with_cheese();
    BurgerCook with_onions();
    BurgerCook with_sauce(Sauce.SauceType sauceType);
    BurgerCook with_tomato();
    Burger cook();
}
