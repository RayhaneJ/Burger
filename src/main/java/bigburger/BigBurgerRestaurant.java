package bigburger;

import general.*;

public class BigBurgerRestaurant implements BurgerRestaurant {
    private BigBurgerRestaurant instance;

    public BigBurgerRestaurant queue(){
        instance = new BigBurgerRestaurant();
        BurgerAdvisor.register(Tariff.EXPENSIVE, instance);
        return instance;
    }

    public BurgerCook order_menu(MenuType meatType) {
        return new BigBurgerCook("BigBurger", Size.BIG, meatType);
    }

    public BurgerCook order_personal(Size size, MeatType meatType) {
        return new BigBurgerCook("BigBurger", size, meatType);
    }
}
